package com.raphaowl.whiteowl.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextFormatter {

    private static final String SECTION_MARKER = "@@SECTION@@";
    private static final Pattern HASH_HEADER_PATTERN = Pattern.compile("^(#{1,6})\\s+(.+)$");

    private TextFormatter() {
    }

    public static String toHtml(String text) {
        if (text == null || text.isBlank()) {
            return "";
        }

        String normalized = text.replace("\r\n", "\n");

        // mantém marcação estrutural ainda crua
        normalized = normalized.replaceAll("(?m)^\\s*\\*\\*([^*].*?)\\*\\*\\s*$", SECTION_MARKER + "$1" + SECTION_MARKER);

        List<String> lines = List.of(normalized.split("\n"));
        StringBuilder html = new StringBuilder();

        boolean inList = false;
        List<String> paragraphBuffer = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String rawLine = lines.get(i);
            String line = rawLine.trim();

            if (line.isEmpty()) {
                flushParagraph(html, paragraphBuffer);

                if (inList) {
                    html.append("</ul>");
                    inList = false;
                }
                continue;
            }

            // blockquote com markdown interno
            if (isBlockquoteLine(line)) {
                flushParagraph(html, paragraphBuffer);

                if (inList) {
                    html.append("</ul>");
                    inList = false;
                }

                List<String> quoteLines = new ArrayList<>();

                while (i < lines.size() && isBlockquoteLine(lines.get(i).trim())) {
                    quoteLines.add(stripBlockquotePrefix(lines.get(i).trim()));
                    i++;
                }

                i--;

                String quoteContent = String.join("\n", quoteLines).trim();
                String quoteHtml = toHtml(quoteContent);

                html.append("<blockquote>")
                        .append(quoteHtml)
                        .append("</blockquote>");
                continue;
            }

            // tabela
            if (isTableLine(line)) {
                flushParagraph(html, paragraphBuffer);

                if (inList) {
                    html.append("</ul>");
                    inList = false;
                }

                List<String> tableLines = new ArrayList<>();

                while (i < lines.size() && isTableLine(lines.get(i).trim())) {
                    tableLines.add(lines.get(i).trim());
                    i++;
                }

                i--;

                html.append(buildTable(tableLines));
                continue;
            }

            // headers markdown
            Matcher headerMatcher = HASH_HEADER_PATTERN.matcher(line);
            if (headerMatcher.matches()) {
                flushParagraph(html, paragraphBuffer);

                if (inList) {
                    html.append("</ul>");
                    inList = false;
                }

                int level = headerMatcher.group(1).length();
                String content = headerMatcher.group(2).trim();

                html.append("<div class=\"h")
                        .append(level)
                        .append("\">")
                        .append(applyInlineFormatting(content))
                        .append("</div>");
                continue;
            }

            // section title
            if (isSectionTitle(line)) {
                flushParagraph(html, paragraphBuffer);

                if (inList) {
                    html.append("</ul>");
                    inList = false;
                }

                String title = extractSectionTitle(line);
                html.append("<div class=\"section-title\">")
                        .append(applyInlineFormatting(title))
                        .append("</div>");
                continue;
            }

            // lista
            if (line.startsWith("- ")) {
                flushParagraph(html, paragraphBuffer);

                if (!inList) {
                    html.append("<ul class=\"list\">");
                    inList = true;
                }

                String item = line.substring(2).trim();
                html.append("<li>")
                        .append(applyInlineFormatting(item))
                        .append("</li>");
                continue;
            }

            if (inList) {
                html.append("</ul>");
                inList = false;
            }

            paragraphBuffer.add(line);
        }

        flushParagraph(html, paragraphBuffer);

        if (inList) {
            html.append("</ul>");
        }

        return html.toString();
    }

    private static void flushParagraph(StringBuilder html, List<String> paragraphBuffer) {
        if (paragraphBuffer.isEmpty()) {
            return;
        }

        String paragraph = String.join("\n", paragraphBuffer);

        html.append("<p class=\"rich-text\">")
                .append(applyInlineFormatting(paragraph))
                .append("</p>");

        paragraphBuffer.clear();
    }

    private static boolean isBlockquoteLine(String line) {
        return line.startsWith(">");
    }

    private static String stripBlockquotePrefix(String line) {
        String stripped = line.substring(1);
        if (stripped.startsWith(" ")) {
            stripped = stripped.substring(1);
        }
        return stripped;
    }

    private static boolean isTableLine(String line) {
        return line.startsWith("|") && line.contains("|");
    }

    private static String buildTable(List<String> lines) {
        if (lines.isEmpty()) {
            return "";
        }

        List<List<String>> rows = new ArrayList<>();
        for (String line : lines) {
            rows.add(parseRow(line));
        }

        if (rows.isEmpty()) {
            return "";
        }

        List<String> header = rows.get(0);

        StringBuilder html = new StringBuilder();
        html.append("<div class=\"table-wrapper\">");
        html.append("<table class=\"rich-table\">");

        html.append("<thead><tr>");
        for (String cell : header) {
            html.append("<th>")
                    .append(applyInlineFormatting(cell))
                    .append("</th>");
        }
        html.append("</tr></thead>");

        html.append("<tbody>");

        int start = 1;
        if (rows.size() > 1 && isSeparatorRow(rows.get(1))) {
            start = 2;
        }

        for (int i = start; i < rows.size(); i++) {
            List<String> row = normalizeRowSize(rows.get(i), header.size());

            html.append("<tr>");
            for (String cell : row) {
                html.append("<td>")
                        .append(applyInlineFormatting(cell))
                        .append("</td>");
            }
            html.append("</tr>");
        }

        html.append("</tbody>");
        html.append("</table>");
        html.append("</div>");

        return html.toString();
    }

    private static List<String> normalizeRowSize(List<String> row, int expectedSize) {
        List<String> normalized = new ArrayList<>(row);

        while (normalized.size() < expectedSize) {
            normalized.add("");
        }

        if (normalized.size() > expectedSize) {
            normalized = normalized.subList(0, expectedSize);
        }

        return normalized;
    }

    private static List<String> parseRow(String line) {
        String normalized = line.trim();

        if (normalized.startsWith("|")) {
            normalized = normalized.substring(1);
        }
        if (normalized.endsWith("|")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }

        if (normalized.isBlank()) {
            return List.of();
        }

        return Arrays.stream(normalized.split("\\|", -1))
                .map(String::trim)
                .toList();
    }

    private static boolean isSeparatorRow(List<String> row) {
        if (row.isEmpty()) {
            return false;
        }

        return row.stream().allMatch(cell -> {
            String cleaned = cell.replace("-", "").replace(":", "").trim();
            return cleaned.isEmpty() && cell.contains("-");
        });
    }

    private static boolean isSectionTitle(String line) {
        return line.startsWith(SECTION_MARKER) && line.endsWith(SECTION_MARKER);
    }

    private static String extractSectionTitle(String line) {
        return line.substring(SECTION_MARKER.length(), line.length() - SECTION_MARKER.length()).trim();
    }

    private static String applyInlineFormatting(String text) {
        if (text == null || text.isBlank()) {
            return "";
        }

        // Preserva <br>, <br/> e <br />
        String normalized = text
                .replace("<br />", "%%BR%%")
                .replace("<br/>", "%%BR%%")
                .replace("<br>", "%%BR%%");

        String escaped = escapeHtml(normalized);

        // Restaura as quebras
        escaped = escaped.replace("%%BR%%", "<br>");

        // ***texto*** -> negrito + itálico
        escaped = escaped.replaceAll(
                "(?<!\\*)\\*\\*\\*(.+?)\\*\\*\\*(?!\\*)",
                "<strong><em>$1</em></strong>"
        );

        // **texto** -> negrito
        escaped = escaped.replaceAll(
                "(?<!\\*)\\*\\*(.+?)\\*\\*(?!\\*)",
                "<strong>$1</strong>"
        );

        // *texto* -> negrito
        escaped = escaped.replaceAll(
                "(?<!\\*)\\*(?!\\*)(.+?)(?<!\\*)\\*(?!\\*)",
                "<strong>$1</strong>"
        );

        return escaped;
    }

    private static String escapeHtml(String text) {
        return text
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}