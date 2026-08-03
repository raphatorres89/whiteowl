package com.raphaowl.whiteowl.controller.view;

import java.util.List;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
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
) {}