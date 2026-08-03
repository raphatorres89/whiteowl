package com.raphaowl.whiteowl.generator.alignment;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.generator.Weighted;

public record AlignmentWeight(
        AlignmentEnum alignment,
        int weight
) implements Weighted {
}
