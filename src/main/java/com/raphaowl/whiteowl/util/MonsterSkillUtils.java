package com.raphaowl.whiteowl.util;

public final class MonsterSkillUtils {

    private MonsterSkillUtils() {}

    public static String formatSkill(String skill) {
        if (skill == null) return "";

        return switch (skill.toLowerCase()) {
            case "acrobatics" -> "Acrobacia (Des)";
            case "arcana" -> "Arcanismo (Int)";
            case "athletics" -> "Atletismo (For)";
            case "deception" -> "Enganação (Car)";
            case "history" -> "Historia (Int)";
            case "insight" -> "Percepção (Sab)";
            case "intimidation" -> "Intimidação (Car)";
            case "investigation" -> "Investigação (Int)";
            case "medicine" -> "Medicina (Sab)";
            case "nature" -> "Natureza (Int)";
            case "perception" -> "Percepção (Sab)";
            case "performance" -> "Atuação (Car)";
            case "persuasion" -> "Persuasão (Car)";
            case "religion" -> "Religião (Int)";
            case "stealth" -> "Furtividade (Des)";
            case "survival" -> "Sobrevivência (Sab)";
            default -> skill;
        };
    }
}
