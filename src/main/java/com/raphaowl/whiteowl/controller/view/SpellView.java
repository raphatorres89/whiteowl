package com.raphaowl.whiteowl.controller.view;

import java.util.List;

public record SpellView (
    String slug,
    String name,
    String descHtml,
    String higherLevelHtml,
    String page,
    String range,
    Integer targetRangeSort,
    String components,
    Boolean requiresVerbalComponents,
    Boolean requiresSomaticComponents,
    Boolean requiresMaterialComponents,
    String material,
    Boolean canBeCastAsRitual,
    String ritual,
    String duration,
    String concentration,
    Boolean requiresConcentration,
    String castingTime,
    String level,
    Integer levelInt,
    Integer spellLevel,
    String school,
    String dndClass,
    List<String> spellLists,
    String archetype,
    String circles
) {
}
