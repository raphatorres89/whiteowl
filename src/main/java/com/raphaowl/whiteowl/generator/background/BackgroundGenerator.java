package com.raphaowl.whiteowl.generator.background;

import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;

public interface BackgroundGenerator {

    BackgroundEnum generate(BackgroundEnum filter, ClassEnum clazz);

}
