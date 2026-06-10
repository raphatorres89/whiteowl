package com.raphaowl.whiteowl.controller;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.service.NpcService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NpcController {

    private final NpcService npcService;

    public NpcController(NpcService npcService) {
        this.npcService = npcService;
    }

    @GetMapping("/npcs/generator")
    public String generator(NpcFilter filter, Model model) {
        model.addAttribute("npc", npcService.generate(filter));
        model.addAttribute("filter", filter);
        model.addAttribute("races", RaceEnum.values());
        model.addAttribute("classes", ClassEnum.values());
        model.addAttribute("backgrounds", BackgroundEnum.values());
        model.addAttribute("alignments", AlignmentEnum.values());
        model.addAttribute("genders", Gender.values());
        return "npc-generator";
    }
}