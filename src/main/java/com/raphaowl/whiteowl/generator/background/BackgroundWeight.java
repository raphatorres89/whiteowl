package com.raphaowl.whiteowl.generator.background;

import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.generator.util.Weighted;

public record BackgroundWeight (BackgroundEnum background, int weight) implements Weighted<BackgroundEnum> {

    @Override
    public BackgroundEnum value() {
        return background;
    }

}
