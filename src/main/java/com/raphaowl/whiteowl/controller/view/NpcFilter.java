package com.raphaowl.whiteowl.controller.view;

import java.util.List;

public record NpcFilter(
        String race,
        String clazz,
        String background,
        String alignment,
        List<String> traits,
        List<String> ideals,
        List<String> flaws,
        List<String> notableItems,
        String gender,
        Integer age
) {
}