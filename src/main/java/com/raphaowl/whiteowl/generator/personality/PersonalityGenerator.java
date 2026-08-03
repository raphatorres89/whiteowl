package com.raphaowl.whiteowl.generator.personality;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Component;

@Component
public class PersonalityGenerator {

    public Personality generate(BackgroundEnum background) {
        PersonalityProfile profile = BackgroundPersonalityProfiles.get(background);

        return new Personality(
                random(profile.temperaments()),
                random(profile.socialBehaviors()),
                random(profile.virtues()),
                random(profile.flaws()),
                random(profile.habits()),
                random(profile.fears()),
                random(profile.goals())
        );
    }

    private String random(List<String> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }
}
