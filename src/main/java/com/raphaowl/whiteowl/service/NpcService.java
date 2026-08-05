package com.raphaowl.whiteowl.service;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.controller.view.NpcView;
import com.raphaowl.whiteowl.generator.CharacterGenerator;
import com.raphaowl.whiteowl.generator.CharacterProfile;
import com.raphaowl.whiteowl.generator.old.NpcGenerator;
import com.raphaowl.whiteowl.generator.old.appearance.AppearanceGeneratorFactory;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class NpcService {

    private final CharacterGenerator  characterGenerator;

    public NpcService(CharacterGenerator characterGenerator) {
        this.characterGenerator = characterGenerator;
    }

    public CharacterProfile generate(NpcFilter filter) {
        return characterGenerator.generate(filter);
    }
}