package com.raphaowl.whiteowl.util;

public final class TextNormalizer {

    private TextNormalizer() {
    }

    public static String normalize(String text) {
        if (text == null || text.isBlank()) {
            return "";
        }

        String normalized = text.replace("\r\n", "\n");

        normalized = normalized.replace("/n", "\n");
        normalized = normalized.replaceAll("([^\n])\\s+(#{1,6}\\s+)", "$1\n$2");
        normalized = normalized.replaceAll("(?m)^\\*\\s+", "- ");
        normalized = normalized.replaceAll("(?m)[ \t]+$", "");
        normalized = normalized.replaceAll("\n{3,}", "\n\n");

        return normalized.trim();
    }
}