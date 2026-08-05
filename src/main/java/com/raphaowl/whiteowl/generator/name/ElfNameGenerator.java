package com.raphaowl.whiteowl.generator.name;

import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.name.tables.ElfNames;
import com.raphaowl.whiteowl.generator.util.RandomUtils;

import org.springframework.stereotype.Service;

@Service
public class ElfNameGenerator implements RaceNameGenerator {

    @Override
    public RaceEnum race() {
        return RaceEnum.ELF;
    }

    @Override
    public String generateName(Gender gender) {

        return switch (gender) {
            case MALE -> RandomUtils.pick(ElfNames.MALE_NAMES);
            case FEMALE -> RandomUtils.pick(ElfNames.FEMALE_NAMES);
        };
    }

    @Override
    public String generateTitle(Gender gender) {
        return RandomUtils.pick(ElfNames.TITLES);
    }

}
