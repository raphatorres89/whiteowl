package com.raphaowl.whiteowl.controller.view;

import java.util.List;

public record NpcView(
        String name,
        String title,
        String race,
        String clazz,
        String background,
        String alignment,
        String gender,
        Integer age,
        int level,
        String appearance,
        String personality,
        String goal,
        String secret,
        String hook,
        List<String> traits,
        List<String> ideals,
        List<String> flaws,
        List<String> notableItems
) {}