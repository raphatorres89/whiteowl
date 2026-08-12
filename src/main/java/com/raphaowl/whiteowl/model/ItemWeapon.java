package com.raphaowl.whiteowl.model;

import java.util.List;

public record ItemWeapon(
        String key,
        String name,
        DamageType damageType,
        String damageDice,
        List<WeaponProperty> properties,
        Boolean isSimple,
        Boolean isMartial,
        Boolean isImprovised,
        String distanceUnit
) {
}
