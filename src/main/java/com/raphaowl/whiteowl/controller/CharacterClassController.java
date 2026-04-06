package com.raphaowl.whiteowl.controller;

import java.util.List;

import com.raphaowl.whiteowl.controller.mapper.CharacterClassMapper;
import com.raphaowl.whiteowl.controller.view.BreadcrumbItem;
import com.raphaowl.whiteowl.model.CharacterClass;
import com.raphaowl.whiteowl.service.CharacterClassService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/classes")
@AllArgsConstructor
public class CharacterClassController {

    private final CharacterClassService characterClassService;
    private final CharacterClassMapper characterClassMapper;

    @GetMapping
    public String listClasses(Model model) {
        var characterClasses = characterClassService.findAll();
        var characterClassSummaryViewList = characterClasses.stream()
                .map(characterClassMapper::toSummaryView)
                .toList();
        model.addAttribute("classes", characterClassSummaryViewList);

        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Classes", null)
        ));
        return "classes";
    }

    @GetMapping("/{slug}")
    public String classDetail(@PathVariable String slug, Model model) {
        var characterClass = characterClassService.findBySlug(slug);
        var characterClassView = characterClassMapper.toView(characterClass);

        model.addAttribute("characterClass", characterClassView);

        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Classes", "/classes"),
                new BreadcrumbItem(characterClass.name(), null)
        ));
        return "class-detail";
    }
}