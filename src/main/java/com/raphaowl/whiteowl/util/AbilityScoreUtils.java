package com.raphaowl.whiteowl.util;

public final class AbilityScoreUtils {

    private AbilityScoreUtils() {
    }

    public static String toPt(String attribute) {
        if (attribute == null) {
            return "";
        }

        return switch (attribute.trim().toLowerCase()) {
            case "strength" -> "Força";
            case "dexterity" -> "Destreza";
            case "constitution" -> "Constituição";
            case "intelligence" -> "Inteligência";
            case "wisdom" -> "Sabedoria";
            case "charisma" -> "Carisma";
            case "other" -> "Outro";
            default -> attribute;
        };
    }
}