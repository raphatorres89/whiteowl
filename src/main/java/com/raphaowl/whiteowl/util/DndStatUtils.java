package com.raphaowl.whiteowl.util;

public final class DndStatUtils {

    private DndStatUtils() {
    }

    public static int modifier(Integer score) {
        if (score == null) {
            return 0;
        }
        return Math.floorDiv(score - 10, 2);
    }

    public static String formatScore(Integer score) {
        if (score == null) {
            return "-";
        }

        int modifier = modifier(score);
        String sign = modifier >= 0 ? "+" : "";
        return score + " (" + sign + modifier + ")";
    }
}