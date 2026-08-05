package com.raphaowl.whiteowl.generator.personality;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class PersonalityGenerator {

    private final Map<BackgroundEnum, BackgroundPersonalityGenerator> generators;

    public PersonalityGenerator(List<BackgroundPersonalityGenerator> generators) {
        this.generators = generators.stream()
                .collect(Collectors.toMap(BackgroundPersonalityGenerator::background, Function.identity()));
    }

    public Personality generate(CharacterContext context) {
        BackgroundPersonalityGenerator generator = generators.get(context.background());

        if (generator == null) {
            throw new IllegalArgumentException("No personality generator for " + context.background());
        }

        return generator.generate(context);
    }
}
