package com.raphaowl.whiteowl.model;

public record ItemArmor(
        String name,
        String key,
        String category,
        Integer acBase,
        String acDisplay,
        Boolean acAddDexMod,
        Integer acCapDexMod,
        Boolean grantsStealthDisadvantage,
        Integer strengthScoreRequired
) {
}