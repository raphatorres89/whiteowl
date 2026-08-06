package com.raphaowl.whiteowl.generator.clazz;

import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.generator.util.Weighted;

public record ClassWeight(ClassEnum clazz, int weight) implements Weighted<ClassEnum> {

    @Override
    public ClassEnum value() {
        return clazz;
    }

}
