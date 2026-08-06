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
        ClassEnum clazz,
        BackgroundEnum background,
        AlignmentEnum alignment,
        Gender gender,
        Integer age,
        int level,
        String appearance,
        Personality personality
) {
    public NpcView() {
        this(null, null, null, null, null, null, null, 1, 1, null, null);
    }

    public NpcView fromCharacterProfile(CharacterProfile profile) {
        return new NpcView(
                profile.name(),
                profile.title(),
                profile.race(),
                profile.clazz(),
                profile.background(),
                profile.alignment(),
                profile.gender(),
                1,
                1,
                profile.appearance().appearance(),
                profile.personality());
    }
}