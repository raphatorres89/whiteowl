package com.raphaowl.whiteowl.generator.background;

import java.util.List;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.generator.alignment.AlignmentWeight;

public final class BackgroundAlignmentWeights {

    private BackgroundAlignmentWeights() {
    }

    public static List<AlignmentWeight> get(BackgroundEnum background) {

        return switch (background) {

            case ACOLYTE -> List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 10)
            );

            case ARTISAN -> List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 15)
            );

            case CHARLATAN -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 25),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 15)
            );

            case CRIMINAL -> List.of(
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 35),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 15)
            );

            case ENTERTAINER -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 15)
            );

            case EXILE -> List.of(
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 15)
            );

            case FARMER -> List.of(
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 35),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 10)
            );

            case FOLK_HERO -> List.of(
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 40),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 10)
            );

            case GAMBLER -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 40),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 20),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 15)
            );

            case GUILD_MEMBER -> List.of(
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 15)
            );

            case HERMIT -> List.of(
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 45),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 15),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 15)
            );

            case MARAUDER -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 35),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 20),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 15)
            );

            case OUTLANDER -> List.of(
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 15)
            );

            case SAGE -> List.of(
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 15)
            );

            case SAILOR -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 20),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 20)
            );

            case SCOUNDREL -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 35),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_EVIL, 30),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 20),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_EVIL, 15)
            );

            case TRADER -> List.of(
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 25),
                    new AlignmentWeight(AlignmentEnum.LAWFUL_GOOD, 15)
            );

            case URCHIN -> List.of(
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_GOOD, 30),
                    new AlignmentWeight(AlignmentEnum.CHAOTIC_NEUTRAL, 30),
                    new AlignmentWeight(AlignmentEnum.TRUE_NEUTRAL, 25),
                    new AlignmentWeight(AlignmentEnum.NEUTRAL_GOOD, 15)
            );

        };

    }

}
