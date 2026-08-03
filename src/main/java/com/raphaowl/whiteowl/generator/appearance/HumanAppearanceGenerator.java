package com.raphaowl.whiteowl.generator.appearance;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.controller.view.NpcView;
import com.raphaowl.whiteowl.generator.NpcGenerator;

import org.springframework.stereotype.Component;

@Component
public class HumanAppearanceGenerator implements NpcGenerator {

    @Override
    public NpcView generate(NpcFilter filter) {
        return null;
    }
}
