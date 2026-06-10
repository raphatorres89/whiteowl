package com.raphaowl.whiteowl.controller;

import com.raphaowl.whiteowl.service.NpcService;
import com.raphaowl.whiteowl.controller.view.NpcFilter;
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
        model.addAttribute("races", npcService.getRaces());
        model.addAttribute("classes", npcService.getClasses());
        model.addAttribute("backgrounds", npcService.getBackgrounds());
        model.addAttribute("alignments", npcService.getAlignments());
        return "npc-generator";
    }
}