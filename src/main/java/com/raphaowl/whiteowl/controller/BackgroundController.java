package com.raphaowl.whiteowl.controller;

import java.util.List;

import com.raphaowl.whiteowl.controller.mapper.BackgroundMapper;
import com.raphaowl.whiteowl.controller.view.BackgroundView;
import com.raphaowl.whiteowl.exceptions.CharacterClassNotFoundException;
import com.raphaowl.whiteowl.service.BackgroundService;
import com.raphaowl.whiteowl.util.BreadcrumbBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/backgrounds")
@RequiredArgsConstructor
public class BackgroundController {

    private final BackgroundService backgroundService;

    @GetMapping
    public String list(Model model) {
        List<BackgroundView> backgrounds = backgroundService.findAll().stream()
                .map(BackgroundMapper::toView)
                .toList();
        model.addAttribute("backgrounds", backgrounds);

        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildRootFor("Antecedentes"));
        return "backgrounds";
    }

    @GetMapping("/{slug}")
    public String detail(@PathVariable String slug, Model model) {
        var background = backgroundService.findBySlug(slug)
                .map(BackgroundMapper::toView)
                .orElseThrow(() -> new CharacterClassNotFoundException(slug));

        model.addAttribute("background", background);

        model.addAttribute("breadcrumbs",
                           BreadcrumbBuilder.buildBreadcrumb("Antecedentes", "/backgrounds", background.name()));
        return "background-detail";
    }
}
