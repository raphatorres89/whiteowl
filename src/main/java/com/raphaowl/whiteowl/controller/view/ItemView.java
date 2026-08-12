package com.raphaowl.whiteowl.controller.view;

import java.math.BigDecimal;

public record ItemView(
        String name,
        String description,
        String category,
        WeaponView weapon,
        ArmorView armor,
        String size,
        BigDecimal weight,
        String weightUnit,
        BigDecimal cost
) {

}
