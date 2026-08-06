package com.raphaowl.whiteowl.generator.background;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;

public final class ClassBackgroundWeights {

    private ClassBackgroundWeights() {
    }

    public static List<BackgroundWeight> get(ClassEnum clazz) {

        return switch (clazz) {

            case BARBARIAN -> List.of(
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 40),
                    new BackgroundWeight(BackgroundEnum.MARAUDER, 25),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 15),
                    new BackgroundWeight(BackgroundEnum.EXILE, 10),
                    new BackgroundWeight(BackgroundEnum.FARMER, 10)
            );

            case BARD -> List.of(
                    new BackgroundWeight(BackgroundEnum.ENTERTAINER, 45),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 20),
                    new BackgroundWeight(BackgroundEnum.TRADER, 15),
                    new BackgroundWeight(BackgroundEnum.GAMBLER, 10),
                    new BackgroundWeight(BackgroundEnum.URCHIN, 10)
            );

            case CLERIC -> List.of(
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 50),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 20),
                    new BackgroundWeight(BackgroundEnum.SAGE, 15),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 15)
            );

            case DRUID -> List.of(
                    new BackgroundWeight(BackgroundEnum.HERMIT, 35),
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 35),
                    new BackgroundWeight(BackgroundEnum.FARMER, 15),
                    new BackgroundWeight(BackgroundEnum.EXILE, 15)
            );

            case FIGHTER -> List.of(
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 25),
                    new BackgroundWeight(BackgroundEnum.GUILD_MEMBER, 25),
                    new BackgroundWeight(BackgroundEnum.SAILOR, 30), // remova se não existir
                    new BackgroundWeight(BackgroundEnum.MARAUDER, 10),
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 10)
            );

            case MONK -> List.of(
                    new BackgroundWeight(BackgroundEnum.HERMIT, 40),
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 30),
                    new BackgroundWeight(BackgroundEnum.SAGE, 20),
                    new BackgroundWeight(BackgroundEnum.EXILE, 10)
            );

            case PALADIN -> List.of(
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 40),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 30),
                    new BackgroundWeight(BackgroundEnum.GUILD_MEMBER, 15),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 15)
            );

            case RANGER -> List.of(
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 45),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 20),
                    new BackgroundWeight(BackgroundEnum.EXILE, 15),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 10),
                    new BackgroundWeight(BackgroundEnum.FARMER, 10)
            );

            case ROGUE -> List.of(
                    new BackgroundWeight(BackgroundEnum.CRIMINAL, 35),
                    new BackgroundWeight(BackgroundEnum.SCOUNDREL, 25),
                    new BackgroundWeight(BackgroundEnum.URCHIN, 20),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 10),
                    new BackgroundWeight(BackgroundEnum.GAMBLER, 10)
            );

            case SORCERER -> List.of(
                    new BackgroundWeight(BackgroundEnum.HERMIT, 20),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 20),
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 20),
                    new BackgroundWeight(BackgroundEnum.EXILE, 20),
                    new BackgroundWeight(BackgroundEnum.SAGE, 20)
            );

            case WARLOCK -> List.of(
                    new BackgroundWeight(BackgroundEnum.HERMIT, 25),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 20),
                    new BackgroundWeight(BackgroundEnum.CRIMINAL, 20),
                    new BackgroundWeight(BackgroundEnum.EXILE, 20),
                    new BackgroundWeight(BackgroundEnum.SAGE, 15)
            );

            case WIZARD -> List.of(
                    new BackgroundWeight(BackgroundEnum.SAGE, 45),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 20),
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 15),
                    new BackgroundWeight(BackgroundEnum.ARTISAN, 10),
                    new BackgroundWeight(BackgroundEnum.GUILD_MEMBER, 10)
            );

        };

    }

}
