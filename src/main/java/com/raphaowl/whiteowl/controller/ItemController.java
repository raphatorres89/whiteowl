package com.raphaowl.whiteowl.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildBreadcrumb("Itens", "/items", categoryEnum.getLabel()));
        return "item-category";
    }
}
