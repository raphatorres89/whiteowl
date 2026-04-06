package com.raphaowl.whiteowl.controller;

import java.util.List;

import com.raphaowl.whiteowl.controller.view.BreadcrumbItem;
import com.raphaowl.whiteowl.model.PageResult;
import com.raphaowl.whiteowl.model.Spell;
import com.raphaowl.whiteowl.model.SpellFilter;
import com.raphaowl.whiteowl.service.SpellService;
import com.raphaowl.whiteowl.util.SpellSchoolIconUtils;
import com.raphaowl.whiteowl.util.TextFormatter;
import com.raphaowl.whiteowl.util.TextNormalizer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/spells")
public class SpellController {

    private final SpellService spellService;

    public SpellController(SpellService spellService) {
        this.spellService = spellService;
    }

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
        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Magias", null)
        ));
        return "spells";
    }

    @GetMapping("/{slug}")
    public String spellDetail(@PathVariable String slug, Model model) {
        Spell spell = spellService.findBySlug(slug);
        model.addAttribute("spell", spell);

        String normalizedDesc = TextNormalizer.normalize(spell.desc());
        String normalizedHigherLevel = TextNormalizer.normalize(spell.higherLevel());

        model.addAttribute("spellDescHtml", TextFormatter.toHtml(normalizedDesc));
        model.addAttribute("spellHigherLevelHtml", TextFormatter.toHtml(normalizedHigherLevel));

        model.addAttribute("spellSchoolIcon", SpellSchoolIconUtils.iconPath(spell.school()));

        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Magias", "/spells"),
                new BreadcrumbItem(spell.name(), null)
        ));
        return "spell-detail";
    }
}