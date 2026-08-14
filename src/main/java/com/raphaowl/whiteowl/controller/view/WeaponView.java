package com.raphaowl.whiteowl.controller.view;

import java.util.List;

public record WeaponView(
        String name,
        String key,
        DamageView damage,
        String damageDice,
        List<WeaponPropertyView> properties,
        boolean simple,
        boolean martial,
        boolean improvised,
        String distanceUnit
) {
}
