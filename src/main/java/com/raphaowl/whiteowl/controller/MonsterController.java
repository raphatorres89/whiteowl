package com.raphaowl.whiteowl.controller;

import java.util.List;
import java.util.Optional;

import com.raphaowl.whiteowl.controller.mapper.MonsterMapper;
import com.raphaowl.whiteowl.controller.view.AbilityScoresView;
import com.raphaowl.whiteowl.controller.view.BreadcrumbItem;
import com.raphaowl.whiteowl.controller.view.MonsterView;
import com.raphaowl.whiteowl.model.Monster;
import com.raphaowl.whiteowl.model.MonsterFilter;
import com.raphaowl.whiteowl.service.MonsterService;
import com.raphaowl.whiteowl.util.DndStatUtils;
import com.raphaowl.whiteowl.util.MonsterTypeIconUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/monsters")
@RequiredArgsConstructor
public class MonsterController {

    private final MonsterService monsterService;

    @GetMapping("/{id}")
    public String monsterDetail(@PathVariable String id, Model model) {
        MonsterView monster = monsterService.findById(id)
                .map(MonsterMapper::toView)
                .orElseThrow(() -> new RuntimeException("Monster not found"));

        model.addAttribute("monster", monster);
        model.addAttribute("monsterTypeIcon", MonsterTypeIconUtils.iconPath(monster.type()));
        model.addAttribute("abilityScores", new AbilityScoresView(
                DndStatUtils.formatScore(monster.strength()),
                DndStatUtils.formatScore(monster.dexterity()),
                DndStatUtils.formatScore(monster.constitution()),
                DndStatUtils.formatScore(monster.intelligence()),
                DndStatUtils.formatScore(monster.wisdom()),
                DndStatUtils.formatScore(monster.charisma())
        ));

        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Monstros", "/monsters"),
                new BreadcrumbItem(monster.name(), null)
        ));
        return "monster-detail";
    }

    @GetMapping
    public String listMonsters(
            @ModelAttribute MonsterFilter filter,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "12") int size,
            Model model) {
        var monstersPage = monsterService.findAll(filter, page, size);

        model.addAttribute("filter", filter);
        model.addAttribute("monstersPage", monstersPage);
        model.addAttribute("monsters", monstersPage.content());

        model.addAttribute("types", monsterService.findAllTypes());
        model.addAttribute("environments", monsterService.findAllEnvironments());
        model.addAttribute("alignments", monsterService.findAllAlignments());

        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Monstros", null)
        ));
        return "monsters";
    }
}
