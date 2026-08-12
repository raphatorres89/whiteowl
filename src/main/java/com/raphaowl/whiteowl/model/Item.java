package com.raphaowl.whiteowl.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Item(
        String key,
        String name,
        String desc,
        ItemCategory category,
        ItemWeapon weapon,
        ItemArmor armor,
        ItemSize size,
        BigDecimal weight,
        @JsonProperty("weight_unit")
        String weightUnit,
        BigDecimal cost
) {
}
