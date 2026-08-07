package com.raphaowl.whiteowl.generator;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.personality.Personality;

public record CharacterProfile(
        String name,
        String title,
        RaceEnum race,
        Gender gender,
        ClassEnum clazz,
        BackgroundEnum background,
        AlignmentEnum alignment,
        String appearance,
        Personality personality
) {

}
