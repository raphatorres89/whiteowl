package com.raphaowl.whiteowl.generator.name;

import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.name.tables.DwarfNames;
import com.raphaowl.whiteowl.generator.util.RandomUtils;

import org.springframework.stereotype.Service;

@Service
public class DwarfNameGenerator implements RaceNameGenerator {

    @Override
    public RaceEnum race() {
        return RaceEnum.DWARF;
    }

    @Override
    public String generateName(Gender gender) {

        String clan = RandomUtils.pick(DwarfNames.CLAN_NAMES);

        return switch (gender) {
            case MALE -> RandomUtils.pick(DwarfNames.MALE_NAMES) + " " + clan;
            case FEMALE -> RandomUtils.pick(DwarfNames.FEMALE_NAMES) + " " + clan;
        };
    }

    @Override
    public String generateTitle(Gender gender) {
        return RandomUtils.pick(DwarfNames.TITLES);
    }

}
