package com.raphaowl.whiteowl.generator.alignment;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.RaceEnum;

public interface AlignmentGenerator {

    AlignmentEnum generate(RaceEnum race, ClassEnum clazz, BackgroundEnum background);

}
