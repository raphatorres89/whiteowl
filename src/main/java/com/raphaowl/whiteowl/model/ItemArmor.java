package com.raphaowl.whiteowl.model;

public record ItemArmor(
        String name,
        String key,
        String category,
        int acBase,
        String acDisplay,
        boolean acAddDexMod,
        Integer acCapDexMod,
        boolean grantsStealthDisadvantage,
        Integer strengthScoreRequired
) {
}