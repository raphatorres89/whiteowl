package com.raphaowl.whiteowl.model;

import java.math.BigDecimal;

public record Item(
        String key,
        String name,
        String desc,
        ItemCategory category,
        ItemWeapon weapon,
        ItemArmor armor,
        ItemSize size,
        BigDecimal weight,
        String weightUnit,
        BigDecimal cost
) {
}
