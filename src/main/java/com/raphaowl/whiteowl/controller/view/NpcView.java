package com.raphaowl.whiteowl.controller.view;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.CharacterProfile;
import com.raphaowl.whiteowl.generator.personality.Personality;

public record NpcView(
        String name,
        String title,
        RaceEnum race,
        String racePath,
        ClassEnum clazz,
        String classPath,
        BackgroundEnum background,
        String backgroundPath,
        AlignmentEnum alignment,
        Gender gender,
        Integer age,
        int level,
        String appearance,
        Personality personality
) {
    public NpcView() {
        this(null, null, null, null, null, null, null, null, null, null, 1, 1, null, null);
    }

    public NpcView fromCharacterProfile(CharacterProfile profile) {
        return new NpcView(
                profile.name(),
                profile.title(),
                profile.race(),
                "/images/races/icons/" + profile.race().getSlug() + ".png",
                profile.clazz(),
                "/images/classes/" + profile.clazz().name().toLowerCase() + ".png",
                profile.background(),
                "/images/backgrounds/" + profile.background().getSlug().replaceAll("_", "-") + ".png",
                profile.alignment(),
                profile.gender(),
                1,
                1,
                profile.appearance(),
                profile.personality());
    }
}