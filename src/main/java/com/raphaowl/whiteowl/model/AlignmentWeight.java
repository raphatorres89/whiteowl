package com.raphaowl.whiteowl.model;

import com.raphaowl.whiteowl.enums.AlignmentEnum;

public record AlignmentWeight(
        AlignmentEnum alignment,
        int weight
) {
}
