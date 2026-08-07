package com.raphaowl.whiteowl.generator.name;

import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.name.tables.DragonbornNames;
import com.raphaowl.whiteowl.generator.util.RandomUtils;

import org.springframework.stereotype.Service;

@Service
public class DragonbornNameGenerator implements RaceNameGenerator {

    @Override
    public RaceEnum race() {
        return RaceEnum.DRAGONBORN;
    }

    @Override
    public String generateName(Gender gender) {

        String clan = RandomUtils.pick(DragonbornNames.CLAN_NAMES);

        return switch (gender) {
            case MALE -> RandomUtils.pick(DragonbornNames.MALE_NAMES) + " " + clan;
            case FEMALE -> RandomUtils.pick(DragonbornNames.FEMALE_NAMES) + " " + clan;
        };
    }

    @Override
    public String generateTitle(Gender gender) {
        return RandomUtils.pick(DragonbornNames.TITLES);
    }

}
