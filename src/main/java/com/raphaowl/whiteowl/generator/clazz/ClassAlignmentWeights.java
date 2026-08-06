package com.raphaowl.whiteowl.generator.clazz;

import java.util.List;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.generator.alignment.AlignmentWeight;

public final class ClassAlignmentWeights {

    private ClassAlignmentWeights() {
    }

    public static List<AlignmentWeight> get(ClassEnum clazz) {

        return switch (clazz) {

            case BARBARIAN -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 40),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 15),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 10)
            );

            case BARD -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 15)
            );

            case CLERIC -> List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 15)
            );

            case DRUID -> List.of(
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 40),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 15)
            );

            case FIGHTER -> List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 25)
            );

            case MONK -> List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 10)
            );

            case PALADIN -> List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 50),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 10)
            );

            case RANGER -> List.of(
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 15)
            );

            case ROGUE -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 15),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 15),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 10)
            );

            case SORCERER -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20)
            );

            case WARLOCK -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 25),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 20)
            );

            case WIZARD -> List.of(
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 20)
            );

        };

    }

}
