package com.raphaowl.whiteowl.generator.race;

import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.util.EnumUtils;

import org.springframework.stereotype.Service;

@Service
public class DefaultRaceGenerator implements RaceGenerator {

    @Override
    public RaceEnum generate(RaceEnum filter) {

        if (filter != null) {
            return filter;
        }

        return EnumUtils.random(RaceEnum.class);

    }

}
