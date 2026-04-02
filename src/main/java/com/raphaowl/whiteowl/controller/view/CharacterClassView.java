package com.raphaowl.whiteowl.controller.view;

import java.util.List;

public record CharacterClassView(
        String name,
        String slug,
        String descHtml,
        String hitDice,
        String hpAt1stLevel,
        String hpAtHigherLevels,
        String profArmor,
        String profWeapons,
        String profTools,
        String profSavingThrows,
        String profSkills,
        String equipmentHtml,
        String tableHtml,
        String spellcastingAbility,
        String subtypesName,
        List<ArchetypeView> archetypes
) {
}