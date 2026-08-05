package com.raphaowl.whiteowl.generator.appearance;

import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;

public interface RaceAppearanceGenerator {

    RaceEnum race();

    String generate(Gender gender, ClassEnum clazz);

}
