package com.raphaowl.whiteowl.controller.view;

public record ArmorView(
        String name,
        String category,
        Integer acBase,
        String acDisplay,
        Boolean acAddDexMod,
        Integer acCapDexMod,
        Boolean grantsStealthDisadvantage,
        Integer strengthScoreRequired
) {
}
