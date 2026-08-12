package com.raphaowl.whiteowl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemWeapon(
        String key,
        String name,
        @JsonProperty("damage_type")
        DamageType damageType,
        @JsonProperty("damage_dice")
        String damageDice,
        List<WeaponProperty> properties,
        @JsonProperty("is_simple")
        Boolean isSimple,
        @JsonProperty("is_martial")
        Boolean isMartial,
        @JsonProperty("is_improvised")
        Boolean isImprovised,
        @JsonProperty("distance_unit")
        String distanceUnit
) {
}
