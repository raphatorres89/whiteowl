package com.raphaowl.whiteowl.generator.name;

import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;

public interface RaceNameGenerator {
    RaceEnum race();
    String generateName(Gender gender);
    String generateTitle(Gender gender);
}
