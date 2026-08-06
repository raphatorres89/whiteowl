package com.raphaowl.whiteowl.controller;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.controller.view.NpcView;
import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.CharacterGenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class NpcController {

    private final CharacterGenerator characterGenerator;

    @GetMapping("/npcs/generator")
    public String generator(NpcFilter filter, Model model) {
        NpcView npcView = new NpcView().fromCharacterProfile(characterGenerator.generate(filter));
        model.addAttribute("npc", npcView);
        model.addAttribute("filter", filter);
        model.addAttribute("races", RaceEnum.values());
        model.addAttribute("classes", ClassEnum.values());
        model.addAttribute("backgrounds", BackgroundEnum.values());
        model.addAttribute("alignments", AlignmentEnum.values());
        model.addAttribute("genders", Gender.values());
        return "npc-generator";
    }
}