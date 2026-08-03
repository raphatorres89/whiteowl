package com.raphaowl.whiteowl.generator.background;

import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.generator.Weighted;

public record BackgroundWeight(
        BackgroundEnum background,
        int weight
) implements Weighted {
}
