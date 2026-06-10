package com.raphaowl.whiteowl.controller.view;

import java.util.List;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;

public record NpcFilter(
        RaceEnum race,
        ClassEnum clazz,
        BackgroundEnum background,
        AlignmentEnum alignment,
        List<String> traits,
        List<String> ideals,
        List<String> flaws,
        List<String> notableItems,
        Gender gender,
        Integer age
) {
}