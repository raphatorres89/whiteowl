package com.raphaowl.whiteowl.service;

import java.text.Collator;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.raphaowl.whiteowl.controller.view.ItemView;
import com.raphaowl.whiteowl.enums.CategoryEnum;

import org.springframework.stereotype.Service;

@Service
public class ItemGroupingService {

    private static final Set<String> RANGED_WEAPON_KEYS = Set.of(
            "srd_crossbow-light",
            "srd_dart",
            "srd_shortbow",
            "srd_sling",
            "srd_blowgun",
            "srd_crossbow-hand",
            "srd_crossbow-heavy",
            "srd_longbow",
            "srd_net",
            "srd_pistol",
            "srd_musket"
    );

    public GroupedItems build(CategoryEnum category, List<ItemView> items) {
        Collator ptCollator = Collator.getInstance(Locale.of("pt", "BR"));
        Comparator<String> localizedStringOrder = ptCollator::compare;
        Comparator<ItemView> itemNameOrder = Comparator.comparing(ItemView::name, localizedStringOrder);
        List<ItemView> list = items.stream().sorted(itemNameOrder).toList();
        return switch (category) {
            case WEAPON -> new GroupedItems("weaponItemsByType",
                    groupBy(list, this::weaponGroupLabel, Comparator.comparingInt(entry -> weaponGroupRank(entry.getKey())), itemNameOrder));
            case ARMOR -> new GroupedItems("armorItemsByType",
                    groupBy(list, this::armorGroupLabel, (left, right) -> compareArmorGroups(left, right, localizedStringOrder), itemNameOrder));
            case VEHICLE, TOOLS, ADVENTURING_GEAR -> new GroupedItems("standardItemsByType",
                    groupByCategory(list, localizedStringOrder, itemNameOrder));
            default -> new GroupedItems("standardItemsByType", groupAsSingleSection(category.getLabel(), list, itemNameOrder));
        };
    }

    private Map<String, List<ItemView>> groupAsSingleSection(
            String sectionTitle,
            List<ItemView> items,
            Comparator<ItemView> itemOrder) {
        Map<String, List<ItemView>> groupedItems = new LinkedHashMap<>();
        groupedItems.put(sectionTitle, items.stream().sorted(itemOrder).toList());
        return groupedItems;
    }

    private Map<String, List<ItemView>> groupByCategory(
            List<ItemView> items,
            Comparator<String> localizedStringOrder,
            Comparator<ItemView> itemOrder) {
        return groupBy(items, ItemView::category, Map.Entry.comparingByKey(localizedStringOrder), itemOrder);
    }

    private Map<String, List<ItemView>> groupBy(
            List<ItemView> items,
            Function<ItemView, String> groupBy,
            Comparator<Map.Entry<String, List<ItemView>>> groupOrder,
            Comparator<ItemView> itemOrder) {
        return items.stream()
                .collect(Collectors.groupingBy(groupBy))
                .entrySet().stream()
                .sorted(groupOrder)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .sorted(itemOrder)
                                .toList(),
                        (left, right) -> left,
                        LinkedHashMap::new));
    }

    private int compareArmorGroups(
            Map.Entry<String, List<ItemView>> left,
            Map.Entry<String, List<ItemView>> right,
            Comparator<String> localizedStringOrder) {
        int rankDiff = Integer.compare(armorGroupRank(left.getKey()), armorGroupRank(right.getKey()));
        if (rankDiff != 0) {
            return rankDiff;
        }
        return localizedStringOrder.compare(left.getKey(), right.getKey());
    }

    private String armorGroupLabel(ItemView item) {
        if (item.armor() == null || item.armor().category() == null || item.armor().category().isBlank()) {
            return "Armadura";
        }

        String category = item.armor().category().trim();
        String normalizedCategory = category.toLowerCase(Locale.ROOT);

        return switch (normalizedCategory) {
            case "light" -> "Armadura Leve";
            case "medium" -> "Armadura Média";
            case "heavy" -> "Armadura Pesada";
            case "shield", "escudo" -> "Escudo";
            default -> "Armadura " + category;
        };
    }

    private int armorGroupRank(String groupLabel) {
        return switch (groupLabel) {
            case "Armadura Leve" -> 0;
            case "Armadura Média" -> 1;
            case "Armadura Pesada" -> 2;
            case "Escudo" -> 3;
            default -> 4;
        };
    }

    private String weaponGroupLabel(ItemView item) {
        if (item.weapon() == null) {
            return "Armas";
        }

        boolean isSimple = item.weapon().simple();
        boolean isRanged = isRangedWeapon(item.weapon().key());
        if (isSimple && !isRanged) {
            return "Armas Simples Corpo a Corpo";
        }
        if (isSimple) {
            return "Armas Simples à Distância";
        }
        if (!isRanged) {
            return "Armas Marciais Corpo a Corpo";
        }
        return "Armas Marciais à Distância";
    }

    private int weaponGroupRank(String groupLabel) {
        return switch (groupLabel) {
            case "Armas Simples Corpo a Corpo" -> 0;
            case "Armas Simples à Distância" -> 1;
            case "Armas Marciais Corpo a Corpo" -> 2;
            case "Armas Marciais à Distância" -> 3;
            default -> 4;
        };
    }

    private boolean isRangedWeapon(String weaponKey) {
        return weaponKey != null && RANGED_WEAPON_KEYS.contains(weaponKey);
    }

    public record GroupedItems(String modelAttribute, Map<String, List<ItemView>> itemsByType) {
    }
}
