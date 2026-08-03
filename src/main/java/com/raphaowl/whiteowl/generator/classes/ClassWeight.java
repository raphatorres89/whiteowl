package com.raphaowl.whiteowl.generator.classes;

import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.generator.Weighted;

public record ClassWeight(
        ClassEnum clazz,
        int weight
) implements Weighted {

}
