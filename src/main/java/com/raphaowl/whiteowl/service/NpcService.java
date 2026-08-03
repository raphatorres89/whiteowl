package com.raphaowl.whiteowl.service;

import java.util.Random;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.controller.view.NpcView;
import com.raphaowl.whiteowl.generator.NpcGenerator;
import com.raphaowl.whiteowl.generator.appearance.AppearanceGeneratorFactory;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class NpcService {

    private final AppearanceGeneratorFactory appearanceGeneratorFactory;

    private final Random random = new Random();

    public NpcService(AppearanceGeneratorFactory appearanceGeneratorFactory) {
        this.appearanceGeneratorFactory = appearanceGeneratorFactory;
    }

    public NpcView generate(NpcFilter filter) {
        NpcGenerator generator = appearanceGeneratorFactory.getGenerator(filter.race());

        return generator.generate(filter);
    }
}