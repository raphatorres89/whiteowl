package com.raphaowl.whiteowl.controller.mapper;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.raphaowl.whiteowl.controller.view.ItemView;
import com.raphaowl.whiteowl.model.Item;

import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public static ItemView toView(Item item) {
        return new ItemView(
            item.name(),
            item.desc(),
//            "/images/items/" + item.slug() + ".png",
            item.category().name(),
            null,
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
        return normalized.scale() < 0 ? normalized.setScale(0, RoundingMode.CEILING) : normalized;
    }
}
