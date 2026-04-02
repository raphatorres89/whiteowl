package com.raphaowl.whiteowl.controller.view;

public record CharacterClassSummaryView (
        String name,
        String slug,
        String desc,
        String hitDice,
        String profSavingThrows,
        String spellcastingAbility,
        String subtypesName
) {
}
