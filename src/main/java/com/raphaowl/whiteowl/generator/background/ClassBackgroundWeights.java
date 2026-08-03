package com.raphaowl.whiteowl.generator.background;

import java.util.List;
import java.util.Map;

import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;

public final class ClassBackgroundWeights {

    private ClassBackgroundWeights() {
    }

    private static final Map<ClassEnum, List<BackgroundWeight>> WEIGHTS = Map.ofEntries(

            Map.entry(ClassEnum.BARBARIAN, List.of(
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 35),
                    new BackgroundWeight(BackgroundEnum.MARAUDER, 20),
                    new BackgroundWeight(BackgroundEnum.FARMER, 10),
                    new BackgroundWeight(BackgroundEnum.EXILE, 10),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 10),
                    new BackgroundWeight(BackgroundEnum.SAILOR, 10),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 5)
            )),

            Map.entry(ClassEnum.BARD, List.of(
                    new BackgroundWeight(BackgroundEnum.ENTERTAINER, 35),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 20),
                    new BackgroundWeight(BackgroundEnum.GAMBLER, 15),
                    new BackgroundWeight(BackgroundEnum.TRADER, 10),
                    new BackgroundWeight(BackgroundEnum.GUILD_MEMBER, 10),
                    new BackgroundWeight(BackgroundEnum.URCHIN, 5),
                    new BackgroundWeight(BackgroundEnum.SAGE, 5)
            )),

            Map.entry(ClassEnum.CLERIC, List.of(
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 45),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 15),
                    new BackgroundWeight(BackgroundEnum.SAGE, 10),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 10),
                    new BackgroundWeight(BackgroundEnum.ARTISAN, 10),
                    new BackgroundWeight(BackgroundEnum.FARMER, 5),
                    new BackgroundWeight(BackgroundEnum.GUILD_MEMBER, 5)
            )),

            Map.entry(ClassEnum.DRUID, List.of(
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 35),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 25),
                    new BackgroundWeight(BackgroundEnum.FARMER, 15),
                    new BackgroundWeight(BackgroundEnum.EXILE, 10),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 10),
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 5)
            )),

            Map.entry(ClassEnum.FIGHTER, List.of(
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 20),
                    new BackgroundWeight(BackgroundEnum.MARAUDER, 20),
                    new BackgroundWeight(BackgroundEnum.SAILOR, 15),
                    new BackgroundWeight(BackgroundEnum.GUILD_MEMBER, 15),
                    new BackgroundWeight(BackgroundEnum.FARMER, 10),
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 10),
                    new BackgroundWeight(BackgroundEnum.ARTISAN, 10)
            )),

            Map.entry(ClassEnum.MONK, List.of(
                    new BackgroundWeight(BackgroundEnum.HERMIT, 35),
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 25),
                    new BackgroundWeight(BackgroundEnum.SAGE, 15),
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 10),
                    new BackgroundWeight(BackgroundEnum.EXILE, 10),
                    new BackgroundWeight(BackgroundEnum.URCHIN, 5)
            )),

            Map.entry(ClassEnum.PALADIN, List.of(
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 30),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 20),
                    new BackgroundWeight(BackgroundEnum.GUILD_MEMBER, 15),
                    new BackgroundWeight(BackgroundEnum.ARTISAN, 10),
                    new BackgroundWeight(BackgroundEnum.FARMER, 10),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 10),
                    new BackgroundWeight(BackgroundEnum.SAGE, 5)
            )),

            Map.entry(ClassEnum.RANGER, List.of(
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 35),
                    new BackgroundWeight(BackgroundEnum.FOLK_HERO, 20),
                    new BackgroundWeight(BackgroundEnum.FARMER, 15),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 10),
                    new BackgroundWeight(BackgroundEnum.EXILE, 10),
                    new BackgroundWeight(BackgroundEnum.SAILOR, 5),
                    new BackgroundWeight(BackgroundEnum.URCHIN, 5)
            )),

            Map.entry(ClassEnum.ROGUE, List.of(
                    new BackgroundWeight(BackgroundEnum.CRIMINAL, 30),
                    new BackgroundWeight(BackgroundEnum.SCOUNDREL, 25),
                    new BackgroundWeight(BackgroundEnum.URCHIN, 15),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 10),
                    new BackgroundWeight(BackgroundEnum.GAMBLER, 10),
                    new BackgroundWeight(BackgroundEnum.TRADER, 5),
                    new BackgroundWeight(BackgroundEnum.SAILOR, 5)
            )),

            Map.entry(ClassEnum.SORCERER, List.of(
                    new BackgroundWeight(BackgroundEnum.HERMIT, 20),
                    new BackgroundWeight(BackgroundEnum.EXILE, 20),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 15),
                    new BackgroundWeight(BackgroundEnum.SAGE, 15),
                    new BackgroundWeight(BackgroundEnum.URCHIN, 10),
                    new BackgroundWeight(BackgroundEnum.OUTLANDER, 10),
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 10)
            )),

            Map.entry(ClassEnum.WARLOCK, List.of(
                    new BackgroundWeight(BackgroundEnum.HERMIT, 20),
                    new BackgroundWeight(BackgroundEnum.EXILE, 20),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 20),
                    new BackgroundWeight(BackgroundEnum.CRIMINAL, 15),
                    new BackgroundWeight(BackgroundEnum.SAGE, 10),
                    new BackgroundWeight(BackgroundEnum.URCHIN, 10),
                    new BackgroundWeight(BackgroundEnum.GAMBLER, 5)
            )),

            Map.entry(ClassEnum.WIZARD, List.of(
                    new BackgroundWeight(BackgroundEnum.SAGE, 40),
                    new BackgroundWeight(BackgroundEnum.GUILD_MEMBER, 15),
                    new BackgroundWeight(BackgroundEnum.ACOLYTE, 15),
                    new BackgroundWeight(BackgroundEnum.ARTISAN, 10),
                    new BackgroundWeight(BackgroundEnum.HERMIT, 10),
                    new BackgroundWeight(BackgroundEnum.TRADER, 5),
                    new BackgroundWeight(BackgroundEnum.CHARLATAN, 5)
            ))
    );

    public static List<BackgroundWeight> get(ClassEnum clazz) {
        return WEIGHTS.get(clazz);
    }

}