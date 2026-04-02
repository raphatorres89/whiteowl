package com.raphaowl.whiteowl.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class MarkdownTableFormatter {

    private MarkdownTableFormatter() {
    }

    public static String toHtml(String markdown) {
        if (markdown == null || markdown.isBlank()) {
            return "";
        }

        List<String> lines = markdown.lines()
                .map(String::trim)
                .filter(line -> !line.isBlank())
                .filter(line -> line.contains("|"))
                .toList();

        if (lines.size() < 2) {
            return "";
        }

        List<String> header = parseRow(lines.get(0));
        if (header.isEmpty()) {
            return "";
        }

        int separatorIndex = 1;
        if (!isSeparatorRow(parseRow(lines.get(separatorIndex)))) {
            return "";
        }

        List<List<String>> bodyRows = new ArrayList<>();
        for (int i = separatorIndex + 1; i < lines.size(); i++) {
            List<String> row = parseRow(lines.get(i));
            if (!row.isEmpty()) {
                bodyRows.add(normalizeRowSize(row, header.size()));
            }
        }

        StringBuilder html = new StringBuilder();
        html.append("<div class=\"table-wrapper\">");
        html.append("<table class=\"rich-table\">");

        html.append("<thead><tr>");
        for (String cell : header) {
            html.append("<th>")
                    .append(escapeHtml(cell))
                    .append("</th>");
        }
        html.append("</tr></thead>");

        html.append("<tbody>");
        for (List<String> row : bodyRows) {
            html.append("<tr>");
            for (String cell : row) {
                html.append("<td>")
                        .append(escapeHtml(cell))
                        .append("</td>");
            }
            html.append("</tr>");
        }
        html.append("</tbody>");

        html.append("</table>");
        html.append("</div>");

        return html.toString();
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

        return row.stream().allMatch(MarkdownTableFormatter::isSeparatorCell);
    }

    private static boolean isSeparatorCell(String cell) {
        String cleaned = cell.replace("-", "").replace(":", "").trim();
        return cleaned.isEmpty() && cell.contains("-");
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

    private static String escapeHtml(String text) {
        return text
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}