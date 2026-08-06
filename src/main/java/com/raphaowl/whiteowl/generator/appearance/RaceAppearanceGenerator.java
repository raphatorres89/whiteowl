package com.raphaowl.whiteowl.generator.appearance;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.enums.RaceEnum;

public interface RaceAppearanceGenerator {

    RaceEnum race();
    Appearance generate(NpcFilter filter);

}
