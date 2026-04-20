package com.raphaowl.whiteowl.controller;

import com.raphaowl.whiteowl.controller.mapper.CharacterClassMapper;
import com.raphaowl.whiteowl.exceptions.CharacterClassNotFoundException;
import com.raphaowl.whiteowl.service.CharacterClassService;
import com.raphaowl.whiteowl.util.BreadcrumbBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/classes")
@RequiredArgsConstructor
public class CharacterClassController {

    private final CharacterClassService characterClassService;

    @GetMapping
    public String listClasses(Model model) {
        var characterClasses = characterClassService.findAll();
        var characterClassSummaryViewList = characterClasses.stream()
                .map(CharacterClassMapper::toSummaryView)
                .toList();
        model.addAttribute("classes", characterClassSummaryViewList);

        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildRootFor("Classes"));
        return "classes";
    }

    @GetMapping("/{slug}")
    public String classDetail(@PathVariable String slug, Model model) {
        var characterClass = characterClassService.findBySlug(slug)
                .map(CharacterClassMapper::toView)
                .orElseThrow(() -> new CharacterClassNotFoundException(slug));

        model.addAttribute("characterClass", characterClass);

        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildBreadcrumb("Classes", "/classes", characterClass.name()));
        return "class-detail";
    }
}