package com.raphaowl.whiteowl.controller;

import com.raphaowl.whiteowl.controller.mapper.SpellMapper;
import com.raphaowl.whiteowl.exceptions.SpellNotFoundException;
import com.raphaowl.whiteowl.model.SpellFilter;
import com.raphaowl.whiteowl.service.SpellService;
import com.raphaowl.whiteowl.util.BreadcrumbBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/spells")
@RequiredArgsConstructor
public class SpellController {

    private final SpellService spellService;

    @GetMapping
    public String listSpells(
            @ModelAttribute SpellFilter filter,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "12") int size,
            Model model) {
        var spellsPage = spellService.findAll(filter, page, size);

        model.addAttribute("filter", filter);
        model.addAttribute("spellsPage", spellsPage);
        model.addAttribute("spells", spellsPage.content());
        model.addAttribute("schools", spellService.findAllSchools());
        model.addAttribute("levels", spellService.findAllLevels());
        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildRootFor("Magias"));

        return "spells";
    }

    @GetMapping("/{slug}")
    public String spellDetail(@PathVariable String slug, Model model) {
        var spell = spellService.findBySlug(slug)
                .map(SpellMapper::toView)
                .orElseThrow(() -> new SpellNotFoundException(slug));

        model.addAttribute("spell", spell);

        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildBreadcrumb("Magias", "/spells", spell.name()));
        return "spell-detail";
    }
}