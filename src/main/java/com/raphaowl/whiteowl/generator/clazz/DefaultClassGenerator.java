package com.raphaowl.whiteowl.generator.clazz;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.util.WeightedRandom;

import org.springframework.stereotype.Service;

@Service
public class DefaultClassGenerator implements ClassGenerator {

    @Override
    public ClassEnum generate(ClassEnum filter, RaceEnum race) {

        if (filter != null) {
            return filter;
        }

        return WeightedRandom.pick(RaceClassWeights.get(race));

    }

}
