package com.raphaowl.whiteowl.model;

import java.util.List;

public record ItemWeapon(
        String key,
        String name,
        DamageType damageType,
        String damageDice,
        List<WeaponProperty> properties,
        boolean isSimple,
        boolean isMartial,
        boolean isImprovised,
        String distanceUnit
) {
}
