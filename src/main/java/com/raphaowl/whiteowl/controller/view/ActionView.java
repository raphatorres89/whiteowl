package com.raphaowl.whiteowl.controller.view;

public record ActionView(
        String name,
        String desc,
        Integer attackBonus,
        String damageDice,
        Integer damageBonus
) {
}
