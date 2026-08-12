package com.raphaowl.whiteowl.controller.view;

public record ArmorView(
        String name,
        String category,
        int acBase,
        String acDisplay,
        boolean acAddDexMod,
        Integer acCapDexMod,
        boolean grantsStealthDisadvantage,
        Integer strengthScoreRequired
) {
}
