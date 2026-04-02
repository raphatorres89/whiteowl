package com.raphaowl.whiteowl.util;

public final class TextSummaryUtils {

    private TextSummaryUtils() {
    }

    public static String summarize(String text, int maxLength) {
        if (text == null || text.isBlank()) {
            return "";
        }

        String normalized = TextNormalizer.normalize(text);

        // remove headers markdown
        normalized = normalized.replaceAll("(?m)^#{1,6}\\s*", "");

        // remove section title markdown isolado
        normalized = normalized.replaceAll("(?m)^\\*\\*([^*].*?)\\*\\*\\s*$", "$1");

        // remove quotes markdown
        normalized = normalized.replaceAll("(?m)^>\\s?", "");

        // remove linhas de tabela markdown
        normalized = normalized.replaceAll("(?m)^\\|.*\\|\\s*$", "");

        // remove marcadores de lista
        normalized = normalized.replaceAll("(?m)^-\\s+", "");

        // remove markdown inline
        normalized = normalized.replace("***", "");
        normalized = normalized.replace("**", "");
        normalized = normalized.replace("*", "");

        // remove tags HTML simples, caso existam
        normalized = normalized.replaceAll("<[^>]+>", "");

        // colapsa espaços
        normalized = normalized.replaceAll("\\s+", " ").trim();

        if (normalized.length() <= maxLength) {
            return normalized;
        }

        return normalized.substring(0, maxLength).trim() + "...";
    }
}