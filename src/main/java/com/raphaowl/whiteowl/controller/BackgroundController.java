package com.raphaowl.whiteowl.controller;

import java.util.List;

import com.raphaowl.whiteowl.controller.mapper.BackgroundMapper;
import com.raphaowl.whiteowl.controller.view.BackgroundView;
import com.raphaowl.whiteowl.controller.view.BreadcrumbItem;
import com.raphaowl.whiteowl.model.Background;
import com.raphaowl.whiteowl.service.BackgroundService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BackgroundController {

    private final BackgroundService backgroundService;
    private final BackgroundMapper  backgroundMapper;

    @GetMapping("/backgrounds")
    public String list(Model model) {
        List<BackgroundView> backgrounds = backgroundService.findAll().stream()
                .map(backgroundMapper::toView)
                .toList();
        model.addAttribute("backgrounds", backgrounds);

        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Antecedentes", null)
        ));
        return "backgrounds";
    }

    @GetMapping("/backgrounds/{slug}")
    public String detail(@PathVariable String slug, Model model) {
        var background = backgroundService.findBySlug(slug);
        var backgroundView = backgroundMapper.toView(background);

        model.addAttribute("background", backgroundView);

        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Antecedentes", "/backgrounds"),
                new BreadcrumbItem(backgroundView.name(), null)
        ));
        return "background-detail";
    }
}
