package com.raphaowl.whiteowl.generator.background;

import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.generator.util.WeightedRandom;

import org.springframework.stereotype.Service;

@Service
public class DefaultBackgroundGenerator implements BackgroundGenerator {

    @Override
    public BackgroundEnum generate(BackgroundEnum filter, ClassEnum clazz) {

        if (filter != null) {
            return filter;
        }

        return WeightedRandom.pick(
                ClassBackgroundWeights.get(clazz)
        );

    }

}
