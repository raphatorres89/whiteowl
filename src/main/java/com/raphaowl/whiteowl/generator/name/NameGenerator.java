package com.raphaowl.whiteowl.generator.name;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;

import org.springframework.stereotype.Service;

@Service
public class NameGenerator {

    private final Map<RaceEnum, RaceNameGenerator> generators;

    public NameGenerator(List<RaceNameGenerator> generators) {
        this.generators = generators.stream()
                .collect(Collectors.toMap(RaceNameGenerator::race, Function.identity()));
    }

    public String generateName(RaceEnum race, Gender gender) {
        RaceNameGenerator generator = generators.get(race);

        if (generator == null) {
            throw new IllegalArgumentException("No name generator for race " + race);
        }

        return generator.generateName(gender);
    }

    public String generateTitle(RaceEnum race, Gender gender) {
        RaceNameGenerator generator = generators.get(race);

        if (generator == null) {
            throw new IllegalArgumentException("No name generator for race " + race);
        }

        return generator.generateTitle(gender);
    }
}
