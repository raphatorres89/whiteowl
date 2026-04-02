package com.raphaowl.whiteowl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Action (
        String name,
        String desc,
        @JsonProperty("attack_bonus")
        Integer attackBonus,
        @JsonProperty("damage_dice")
        String damageDice,
        @JsonProperty("damage_bonus")
        Integer damageBonus
) {
}
