package com.raphaowl.whiteowl.controller;

import java.util.Arrays;

import com.raphaowl.whiteowl.enums.CategoryEnum;
import com.raphaowl.whiteowl.util.BreadcrumbBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("categories", Arrays.stream(CategoryEnum.values())
                .sorted((c1, c2) -> c1.getLabel().compareTo(c2.getLabel()))
                .toArray(CategoryEnum[]::new));

        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildRootFor("Itens"));
        return "items";
    }
}
