package com.raphaowl.whiteowl.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class TableFormatter {

    private TableFormatter() {
    }

    public static boolean looksLikeTableBlock(List<String> lines, int startIndex) {
        if (startIndex >= lines.size()) {
            return false;
        }

        String first = lines.get(startIndex).trim();
        return first.startsWith("|");
    }

    public static String toHtml(List<String> rawLines) {
        if (rawLines == null || rawLines.isEmpty()) {
            return "";
        }

        List<String> lines = expandFlattenedRows(rawLines);

        boolean hasSeparator = lines.size() > 1 && isSeparatorRow(lines.get(1));
        List<String> headerCells;
        int bodyStart;

        if (hasSeparator) {
            headerCells = parseRow(lines.get(0));
            bodyStart = 2;
        } else {
            headerCells = parseRow(lines.get(0));
            bodyStart = 1;
        }

        if (headerCells.isEmpty()) {
            return "";
        }

        StringBuilder html = new StringBuilder();
        html.append("<div class=\"table-wrapper\">");
        html.append("<table class=\"rich-table\">");

        if (hasSeparator) {
            html.append("<thead><tr>");
            for (String cell : headerCells) {
                html.append("<th>").append(escapeHtml(cell)).append("</th>");
            }
            html.append("</tr></thead>");
        }

        html.append("<tbody>");
        for (int i = bodyStart; i < lines.size(); i++) {
            List<String> cells = parseRow(lines.get(i));
            if (cells.isEmpty() || isSeparatorRow(lines.get(i))) {
                continue;
            }

            html.append("<tr>");
            for (int j = 0; j < headerCells.size(); j++) {
                String value = j < cells.size() ? cells.get(j) : "";
                html.append("<td>").append(escapeHtml(value)).append("</td>");
            }
            html.append("</tr>");
        }
        html.append("</tbody>");

        html.append("</table>");
        html.append("</div>");

        return html.toString();
    }

    private static List<String> expandFlattenedRows(List<String> rawLines) {
        List<String> result = new ArrayList<>();

        for (String raw : rawLines) {
            String line = raw.trim();
            if (!line.startsWith("|")) {
                continue;
            }

            List<String> cells = parseRow(line);

            if (cells.isEmpty()) {
                continue;
            }

            // separador markdown
            if (cells.stream().allMatch(TableFormatter::isSeparatorCell)) {
                result.add(line);
                continue;
            }

            // se for header normal de 2 colunas, mantém
            if (cells.size() <= 2) {
                result.add(rebuildRow(cells));
                continue;
            }

            // se vier achatado com múltiplos pares de colunas, divide em linhas de 2 células
            for (int i = 0; i < cells.size(); i += 2) {
                List<String> pair = new ArrayList<>();
                pair.add(cells.get(i));
                pair.add(i + 1 < cells.size() ? cells.get(i + 1) : "");
                result.add(rebuildRow(pair));
            }
        }

        return result;
    }

    private static boolean isSeparatorRow(String line) {
        List<String> cells = parseRow(line);
        return !cells.isEmpty() && cells.stream().allMatch(TableFormatter::isSeparatorCell);
    }

    private static boolean isSeparatorCell(String cell) {
        String normalized = cell.replace(":", "").replace("-", "").trim();
        return normalized.isEmpty() && cell.contains("-");
    }

    private static String rebuildRow(List<String> cells) {
        return "| " + String.join(" | ", cells) + " |";
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

        return Arrays.stream(normalized.split("\\|"))
                .map(String::trim)
                .toList();
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