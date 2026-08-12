package com.raphaowl.whiteowl.controller.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import com.raphaowl.whiteowl.controller.view.DamageView;
import com.raphaowl.whiteowl.controller.view.ItemView;
import com.raphaowl.whiteowl.controller.view.PropertyView;
import com.raphaowl.whiteowl.controller.view.WeaponPropertyView;
import com.raphaowl.whiteowl.controller.view.WeaponView;
import com.raphaowl.whiteowl.model.DamageType;
import com.raphaowl.whiteowl.model.Item;
import com.raphaowl.whiteowl.model.ItemWeapon;
import com.raphaowl.whiteowl.model.Property;
import com.raphaowl.whiteowl.model.WeaponProperty;

import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public static ItemView toView(Item item) {
        return new ItemView(
            item.name(),
            item.desc(),
//            "/images/items/" + item.slug() + ".png",
            item.category().name(),
            toWeaponView(item.weapon()),
            null,
//            item.weapon(),
//            item.armor(),
            item.size().name(),
            normalizeDecimal(item.weight()),
            item.weightUnit(),
            normalizeDecimal(item.cost())
        );
    }

    private static BigDecimal normalizeDecimal(BigDecimal value) {
        if (value == null) {
            return null;
        }

        BigDecimal normalized = value.stripTrailingZeros();
        return normalized.scale() < 0 ? normalized.setScale(0) : normalized;
    }

    private static WeaponView toWeaponView(ItemWeapon weapon) {
        if (weapon == null) {
            return null;
        }

        return new WeaponView(
                weapon.name(),
                toDamageView(weapon.damageType()),
                weapon.damageDice(),
                toWeaponPropertyViews(weapon.properties()),
                Boolean.TRUE.equals(weapon.isSimple()),
                Boolean.TRUE.equals(weapon.isMartial()),
                Boolean.TRUE.equals(weapon.isImprovised()),
                weapon.distanceUnit()
        );
    }

    private static DamageView toDamageView(DamageType damageType) {
        if (damageType == null) {
            return null;
        }

        return new DamageView(damageType.key(), damageType.name());
    }

    private static List<WeaponPropertyView> toWeaponPropertyViews(List<WeaponProperty> properties) {
        if (properties == null) {
            return List.of();
        }

        return properties.stream()
                .map(ItemMapper::toWeaponPropertyView)
                .filter(Objects::nonNull)
                .toList();
    }

    private static WeaponPropertyView toWeaponPropertyView(WeaponProperty property) {
        if (property == null) {
            return null;
        }

        return new WeaponPropertyView(toPropertyView(property.property()), property.detail());
    }

    private static PropertyView toPropertyView(Property property) {
        if (property == null) {
            return null;
        }

        return new PropertyView(property.name(), property.type(), property.description());
    }
}
