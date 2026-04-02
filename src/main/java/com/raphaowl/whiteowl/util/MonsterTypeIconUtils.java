package com.raphaowl.whiteowl.util;

public final class MonsterTypeIconUtils {

    private MonsterTypeIconUtils() {
    }

    public static String iconPath(String type) {
        if (type == null || type.isBlank()) {
            return "/images/types/default.png";
        }

        return switch (type.trim().toLowerCase()) {
            case "aberração" -> "/images/types/aberration.png";
            case "besta" -> "/images/types/beast.png";
            case "celestial" -> "/images/types/celestial.png";
            case "constructo" -> "/images/types/construct.png";
            case "dragão" -> "/images/types/dragon.png";
            case "elemental" -> "/images/types/elemental.png";
            case "fada" -> "/images/types/fey.png";
            case "ínfero" -> "/images/types/fiend.png";
            case "gigante" -> "/images/types/giant.png";
            case "humanoide" -> "/images/types/humanoid.png";
            case "monstruosidade" -> "/images/types/monstrosity.png";
            case "gosma" -> "/images/types/ooze.png";
            case "planta" -> "/images/types/plant.png";
            case "morto-vivo" -> "/images/types/undead.png";
            default -> "/images/types/default.png";
        };
    }
}