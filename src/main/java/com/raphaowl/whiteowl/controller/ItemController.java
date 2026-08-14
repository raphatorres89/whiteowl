package com.raphaowl.whiteowl.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.raphaowl.whiteowl.controller.mapper.ItemMapper;
import com.raphaowl.whiteowl.controller.view.ItemView;
import com.raphaowl.whiteowl.enums.CategoryEnum;
import com.raphaowl.whiteowl.service.ItemService;
import com.raphaowl.whiteowl.util.BreadcrumbBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

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

    private final ItemService itemService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("categories", Arrays.stream(CategoryEnum.values())
                .sorted(Comparator.comparing(CategoryEnum::getLabel))
                .toArray(CategoryEnum[]::new));

        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildRootFor("Itens"));
        return "items";
    }

    @GetMapping("/category/{category}")
    public String detail(@PathVariable String category, Model model) {
        CategoryEnum categoryEnum = CategoryEnum.fromKey(category);
        List<ItemView> items = itemService.findByCategory(categoryEnum).stream()
                .map(ItemMapper::toView)
                .sorted(Comparator.comparing(ItemView::name))
                .toList();

        model.addAttribute("items", items);
        model.addAttribute("category", categoryEnum);
        if (categoryEnum == CategoryEnum.VEHICLE) {
            Map<String, List<ItemView>> vehicleItemsByType = items.stream()
                    .collect(Collectors.groupingBy(ItemView::category))
                    .entrySet().stream()
                    .sorted(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            entry -> entry.getValue().stream()
                                    .sorted(Comparator.comparing(ItemView::name))
                                    .toList(),
                            (left, right) -> left,
                            LinkedHashMap::new));
            model.addAttribute("vehicleItemsByType", vehicleItemsByType);
        }
        if (categoryEnum == CategoryEnum.TOOLS) {
            Map<String, List<ItemView>> toolItemsByType = items.stream()
                    .collect(Collectors.groupingBy(ItemView::category))
                    .entrySet().stream()
                    .sorted(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            entry -> entry.getValue().stream()
                                    .sorted(Comparator.comparing(ItemView::name))
                                    .toList(),
                            (left, right) -> left,
                            LinkedHashMap::new));
            model.addAttribute("toolItemsByType", toolItemsByType);
        }
        if (categoryEnum == CategoryEnum.ADVENTURING_GEAR) {
            Map<String, List<ItemView>> adventuringGearItemsByType = items.stream()
                    .collect(Collectors.groupingBy(ItemView::category))
                    .entrySet().stream()
                    .sorted(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            entry -> entry.getValue().stream()
                                    .sorted(Comparator.comparing(ItemView::name))
                                    .toList(),
                            (left, right) -> left,
                            LinkedHashMap::new));
            model.addAttribute("adventuringGearItemsByType", adventuringGearItemsByType);
        }
        if (categoryEnum == CategoryEnum.WEAPON) {
            Map<String, List<ItemView>> weaponItemsByType = items.stream()
                    .collect(Collectors.groupingBy(ItemController::weaponGroupLabel))
                    .entrySet().stream()
                    .sorted(Comparator.comparingInt(entry -> weaponGroupRank(entry.getKey())))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            entry -> entry.getValue().stream()
                                    .sorted(Comparator.comparing(ItemView::name))
                                    .toList(),
                            (left, right) -> left,
                            LinkedHashMap::new));
            model.addAttribute("weaponItemsByType", weaponItemsByType);
        }
        if (categoryEnum == CategoryEnum.ARMOR) {
            Map<String, List<ItemView>> armorItemsByType = items.stream()
                    .collect(Collectors.groupingBy(ItemController::armorGroupLabel))
                    .entrySet().stream()
                    .sorted((left, right) -> {
                        int rankDiff = Integer.compare(armorGroupRank(left.getKey()), armorGroupRank(right.getKey()));
                        if (rankDiff != 0) {
                            return rankDiff;
                        }
                        return String.CASE_INSENSITIVE_ORDER.compare(left.getKey(), right.getKey());
                    })
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            entry -> entry.getValue().stream()
                                    .sorted(Comparator.comparing(ItemView::name))
                                    .toList(),
                            (left, right) -> left,
                            LinkedHashMap::new));
            model.addAttribute("armorItemsByType", armorItemsByType);
        }

        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildBreadcrumb("Itens", "/items", categoryEnum.getLabel()));
        return "item-category";
    }

    private static String armorGroupLabel(ItemView item) {
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

    private static int armorGroupRank(String groupLabel) {
        return switch (groupLabel) {
            case "Armadura Leve" -> 0;
            case "Armadura Média" -> 1;
            case "Armadura Pesada" -> 2;
            case "Escudo" -> 3;
            default -> 4;
        };
    }

    private static String weaponGroupLabel(ItemView item) {
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

    private static int weaponGroupRank(String groupLabel) {
        return switch (groupLabel) {
            case "Armas Simples Corpo a Corpo" -> 0;
            case "Armas Simples à Distância" -> 1;
            case "Armas Marciais Corpo a Corpo" -> 2;
            case "Armas Marciais à Distância" -> 3;
            default -> 4;
        };
    }

    private static boolean isRangedWeapon(String weaponKey) {
        return weaponKey != null && RANGED_WEAPON_KEYS.contains(weaponKey);
    }
}
