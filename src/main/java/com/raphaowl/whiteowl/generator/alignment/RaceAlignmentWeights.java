package com.raphaowl.whiteowl.generator.alignment;

import java.util.List;
import java.util.Map;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.model.AlignmentWeight;

public final class RaceAlignmentWeights {

    private static final Map<RaceEnum, List<AlignmentWeight>> WEIGHTS = Map.of(
            RaceEnum.ELF,
            List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 40),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 10))

    );

    private RaceAlignmentWeights() {
    }

    public static List<AlignmentWeight> get(RaceEnum race) {
        return WEIGHTS.getOrDefault(race, List.of());
    }
}
