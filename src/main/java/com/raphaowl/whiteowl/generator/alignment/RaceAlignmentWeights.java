package com.raphaowl.whiteowl.generator.alignment;

import java.util.List;
import java.util.Map;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.old.alignment.AlignmentWeight;

public final class RaceAlignmentWeights {

    private RaceAlignmentWeights() {
    }

    private static final Map<RaceEnum, List<AlignmentWeight>> WEIGHTS = Map.of(

            RaceEnum.DRAGONBORN, List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 10),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 10),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_EVIL, 5),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 5)
            ),

            RaceEnum.DWARF, List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 10),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 5),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_EVIL, 5)
            ),

            RaceEnum.ELF, List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 10),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 5),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 5)
            ),

            RaceEnum.GNOME, List.of(
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 15),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 10)
            ),

            RaceEnum.HALF_ELF, List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 15),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 10),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 5)
            ),

            RaceEnum.HALF_ORC, List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 15),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 15),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 10),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 10)
            ),

            RaceEnum.HALFLING, List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 15),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 10),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 10)
            ),

            RaceEnum.HUMAN, List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 11),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 11),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 11),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 11),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 12),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 11),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_EVIL, 11),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 11),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 11)
            ),

            RaceEnum.TIEFLING, List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 15),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 15),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 10),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 10)
            )
    );

    public static List<AlignmentWeight> get(RaceEnum race) {
        return WEIGHTS.get(race);
    }

}
