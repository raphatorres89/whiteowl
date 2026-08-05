package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.generator.util.RandomUtils;

public abstract class AbstractBackgroundPersonalityGenerator implements BackgroundPersonalityGenerator {

    protected Personality build(
            List<String> temperament,
            List<String> socialBehavior,
            List<String> virtues,
            List<String> flaws,
            List<String> habit,
            List<String> fear,
            List<String> goal
    ) {
        return new Personality(
                RandomUtils.pick(temperament),
                RandomUtils.pick(socialBehavior),
                RandomUtils.pick(virtues),
                RandomUtils.pick(flaws),
                RandomUtils.pick(habit),
                RandomUtils.pick(fear),
                RandomUtils.pick(goal)
        );
    }
}