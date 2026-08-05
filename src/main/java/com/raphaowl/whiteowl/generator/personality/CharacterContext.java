package com.raphaowl.whiteowl.generator.personality;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;

public record CharacterContext(
        RaceEnum race,
        Gender gender,
        ClassEnum clazz,
        BackgroundEnum background,
        AlignmentEnum alignment
) {
}
