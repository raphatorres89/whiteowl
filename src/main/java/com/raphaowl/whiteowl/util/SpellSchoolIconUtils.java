package com.raphaowl.whiteowl.util;

import org.springframework.stereotype.Component;

@Component
public class SpellSchoolIconUtils {

    public SpellSchoolIconUtils() {
    }

    public String iconPath(String school) {
        if (school == null || school.isBlank()) {
            return "/images/schools/default.png";
        }

        return switch (school.trim().toLowerCase()) {
            case "abjuração" -> "/images/schools/abjuration.png";
            case "conjuração" -> "/images/schools/conjuration.png";
            case "adivinhação" -> "/images/schools/divination.png";
            case "encantamento" -> "/images/schools/enchantment.png";
            case "evocação" -> "/images/schools/evocation.png";
            case "ilusão" -> "/images/schools/illusion.png";
            case "necromancia" -> "/images/schools/necromancy.png";
            case "transmutação" -> "/images/schools/transmutation.png";
            default -> "/images/schools/default.png";
        };
    }
}
