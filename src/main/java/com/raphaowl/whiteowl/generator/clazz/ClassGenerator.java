package com.raphaowl.whiteowl.generator.clazz;

import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.RaceEnum;

public interface ClassGenerator {

    ClassEnum generate(ClassEnum filter, RaceEnum race);

}
