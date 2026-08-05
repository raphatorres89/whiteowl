package com.raphaowl.whiteowl.generator.personality;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

public interface BackgroundPersonalityGenerator {
    BackgroundEnum background();
    Personality generate(CharacterContext context);
}
