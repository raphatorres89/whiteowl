package com.raphaowl.whiteowl.controller.view;

public record WeaponView(
        String name,
        // damageType
        String damageDice,
        // properties
        boolean simple,
        boolean martial,
        boolean improvised,
        String distanceUnit
) {
}
