package com.raphaowl.whiteowl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemArmor(
        String name,
        String key,
        String category,
        @JsonProperty("ac_base")
        Integer acBase,
        @JsonProperty("ac_display")
        String acDisplay,
        @JsonProperty("ac_add_dexmod")
        Boolean acAddDexMod,
        @JsonProperty("ac_cap_dexmod")
        Integer acCapDexMod,
        @JsonProperty("grants_stealth_disadvantage")
        Boolean grantsStealthDisadvantage,
        @JsonProperty("strength_score_required")
        Integer strengthScoreRequired
) {
}