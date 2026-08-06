package com.raphaowl.whiteowl.generator.alignment;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.generator.util.Weighted;

public record AlignmentWeight(AlignmentEnum alignment, int weight) implements Weighted<AlignmentEnum> {

    @Override
    public AlignmentEnum value() {
        return alignment;
    }

}
