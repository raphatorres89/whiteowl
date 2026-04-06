package com.raphaowl.whiteowl.controller;

import java.util.List;

import com.raphaowl.whiteowl.controller.mapper.RaceViewMapper;
import com.raphaowl.whiteowl.controller.view.BreadcrumbItem;
import com.raphaowl.whiteowl.controller.view.RaceView;
import com.raphaowl.whiteowl.service.RaceService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/races")
public class RaceController {

    private final RaceService raceService;
    private final RaceViewMapper raceViewMapper;

    public RaceController(RaceService raceService, RaceViewMapper raceViewMapper) {
        this.raceService = raceService;
        this.raceViewMapper = raceViewMapper;
    }

    @GetMapping
    public String listRaces(Model model) {
        List<RaceView> races = raceService.findAll().stream()
                .map(raceViewMapper::toView)
                .toList();

        model.addAttribute("races", races);
        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Raças", null)
        ));
        return "races";
    }

    @GetMapping("/{slug}")
    public String raceDetail(@PathVariable String slug, Model model) {
        RaceView race = raceViewMapper.toView(raceService.findBySlug(slug));
        model.addAttribute("race", race);
        model.addAttribute("breadcrumbs", List.of(
                new BreadcrumbItem("Raças", "/races"),
                new BreadcrumbItem(race.name(), null)
        ));
        return "race-detail";
    }
}