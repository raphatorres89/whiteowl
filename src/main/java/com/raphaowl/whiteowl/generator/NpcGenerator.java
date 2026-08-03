package com.raphaowl.whiteowl.generator;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.controller.view.NpcView;

public interface NpcGenerator {
    NpcView generate(NpcFilter filter);
}
