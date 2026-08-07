package com.raphaowl.whiteowl.generator.appearance;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.enums.RaceEnum;

import org.springframework.stereotype.Service;

@Service
public class AppearanceGenerator {

    private final Map<RaceEnum, RaceAppearanceGenerator> generators;

    public AppearanceGenerator(List<RaceAppearanceGenerator> generators) {
        this.generators = generators.stream().collect(Collectors.toMap(RaceAppearanceGenerator::race, Function.identity()));
    }

    public String generate(NpcFilter filter) {
        return generators.get(filter.race()).generate();
    }
}
