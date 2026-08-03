package com.raphaowl.whiteowl.generator.appearance;

import java.util.Map;

import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.NpcGenerator;

import org.springframework.stereotype.Component;

@Component
public final class AppearanceGeneratorFactory {
    private final Map<RaceEnum, NpcGenerator> generators;

    public AppearanceGeneratorFactory(ElfAppearanceGenerator elfAppearanceGenerator, HumanAppearanceGenerator humanAppearanceGenerator) {
        this.generators = Map.of(
                RaceEnum.ELF, elfAppearanceGenerator,
                RaceEnum.HUMAN, humanAppearanceGenerator
        );
    }

    public NpcGenerator getGenerator(RaceEnum race) {
        NpcGenerator generator = generators.get(race);
        if (generator == null) {
            throw new IllegalArgumentException("No NPC generator configured for race: " + race);
        }
        return generator;
    }
}
