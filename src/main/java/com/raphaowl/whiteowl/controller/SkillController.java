package com.raphaowl.whiteowl.controller;

import java.util.List;

import com.raphaowl.whiteowl.model.Skill;
import com.raphaowl.whiteowl.service.SkillService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/skills")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService skillService;

    @GetMapping
    public String index(Model model) {

        List<Skill> all = skillService.findAll();
        model.addAttribute("skills", all);

        return "skills";
    }
}
