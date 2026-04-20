package com.raphaowl.whiteowl.controller;

import java.util.List;

import com.raphaowl.whiteowl.controller.mapper.RaceMapper;
import com.raphaowl.whiteowl.controller.view.RaceView;
import com.raphaowl.whiteowl.exceptions.RaceNotFoundException;
import com.raphaowl.whiteowl.service.RaceService;
import com.raphaowl.whiteowl.util.BreadcrumbBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/races")
@RequiredArgsConstructor
public class RaceController {

    private final RaceService raceService;

    @GetMapping
    public String listRaces(Model model) {
        List<RaceView> races = raceService.findAll().stream()
                .map(RaceMapper::toView)
                .toList();

        model.addAttribute("races", races);
        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildRootFor("Raças"));
        return "races";
    }

    @GetMapping("/{slug}")
    public String raceDetail(@PathVariable String slug, Model model) {
        var race = raceService.findBySlug(slug)
                .map(RaceMapper::toView)
                .orElseThrow(() -> new RaceNotFoundException(slug));

        model.addAttribute("race", race);
        model.addAttribute("breadcrumbs", BreadcrumbBuilder.buildBreadcrumb("Raças", "/races", race.name()));
        return "race-detail";
    }
}