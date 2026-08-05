package com.raphaowl.whiteowl.generator.clazz;

import java.util.List;
import java.util.Map;

import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.old.classes.ClassWeight;

public final class RaceClassWeights {

    private RaceClassWeights() {
    }

    private static final Map<RaceEnum, List<ClassWeight>> WEIGHTS = Map.of(

            RaceEnum.DRAGONBORN, List.of(
                    new ClassWeight(ClassEnum.PALADIN, 30),
                    new ClassWeight(ClassEnum.FIGHTER, 25),
                    new ClassWeight(ClassEnum.CLERIC, 15),
                    new ClassWeight(ClassEnum.SORCERER, 15),
                    new ClassWeight(ClassEnum.BARBARIAN, 10),
                    new ClassWeight(ClassEnum.RANGER, 5)
            ),

            RaceEnum.DWARF, List.of(
                    new ClassWeight(ClassEnum.FIGHTER, 30),
                    new ClassWeight(ClassEnum.CLERIC, 25),
                    new ClassWeight(ClassEnum.PALADIN, 15),
                    new ClassWeight(ClassEnum.BARBARIAN, 15),
                    new ClassWeight(ClassEnum.RANGER, 10),
                    new ClassWeight(ClassEnum.MONK, 5)
            ),

            RaceEnum.ELF, List.of(
                    new ClassWeight(ClassEnum.RANGER, 30),
                    new ClassWeight(ClassEnum.WIZARD, 20),
                    new ClassWeight(ClassEnum.DRUID, 15),
                    new ClassWeight(ClassEnum.ROGUE, 10),
                    new ClassWeight(ClassEnum.BARD, 10),
                    new ClassWeight(ClassEnum.FIGHTER, 10),
                    new ClassWeight(ClassEnum.CLERIC, 5)
            ),

            RaceEnum.GNOME, List.of(
                    new ClassWeight(ClassEnum.WIZARD, 35),
                    new ClassWeight(ClassEnum.BARD, 20),
                    new ClassWeight(ClassEnum.ROGUE, 15),
                    new ClassWeight(ClassEnum.DRUID, 10),
                    new ClassWeight(ClassEnum.SORCERER, 10),
                    new ClassWeight(ClassEnum.CLERIC, 10)
            ),

            RaceEnum.HALF_ELF, List.of(
                    new ClassWeight(ClassEnum.BARD, 25),
                    new ClassWeight(ClassEnum.SORCERER, 20),
                    new ClassWeight(ClassEnum.PALADIN, 15),
                    new ClassWeight(ClassEnum.WARLOCK, 15),
                    new ClassWeight(ClassEnum.ROGUE, 10),
                    new ClassWeight(ClassEnum.RANGER, 10),
                    new ClassWeight(ClassEnum.WIZARD, 5)
            ),

            RaceEnum.HALF_ORC, List.of(
                    new ClassWeight(ClassEnum.BARBARIAN, 35),
                    new ClassWeight(ClassEnum.FIGHTER, 25),
                    new ClassWeight(ClassEnum.RANGER, 15),
                    new ClassWeight(ClassEnum.PALADIN, 10),
                    new ClassWeight(ClassEnum.ROGUE, 10),
                    new ClassWeight(ClassEnum.CLERIC, 5)
            ),

            RaceEnum.HALFLING, List.of(
                    new ClassWeight(ClassEnum.ROGUE, 30),
                    new ClassWeight(ClassEnum.BARD, 20),
                    new ClassWeight(ClassEnum.RANGER, 20),
                    new ClassWeight(ClassEnum.FIGHTER, 10),
                    new ClassWeight(ClassEnum.DRUID, 10),
                    new ClassWeight(ClassEnum.CLERIC, 10)
            ),

            RaceEnum.HUMAN, List.of(
                    new ClassWeight(ClassEnum.BARBARIAN, 8),
                    new ClassWeight(ClassEnum.BARD, 8),
                    new ClassWeight(ClassEnum.CLERIC, 8),
                    new ClassWeight(ClassEnum.DRUID, 8),
                    new ClassWeight(ClassEnum.FIGHTER, 12),
                    new ClassWeight(ClassEnum.MONK, 8),
                    new ClassWeight(ClassEnum.PALADIN, 8),
                    new ClassWeight(ClassEnum.RANGER, 8),
                    new ClassWeight(ClassEnum.ROGUE, 8),
                    new ClassWeight(ClassEnum.SORCERER, 8),
                    new ClassWeight(ClassEnum.WARLOCK, 8),
                    new ClassWeight(ClassEnum.WIZARD, 8)
            ),

            RaceEnum.TIEFLING, List.of(
                    new ClassWeight(ClassEnum.WARLOCK, 30),
                    new ClassWeight(ClassEnum.SORCERER, 25),
                    new ClassWeight(ClassEnum.ROGUE, 15),
                    new ClassWeight(ClassEnum.BARD, 10),
                    new ClassWeight(ClassEnum.WIZARD, 10),
                    new ClassWeight(ClassEnum.PALADIN, 5),
                    new ClassWeight(ClassEnum.CLERIC, 5)
            )
    );

    public static List<ClassWeight> get(RaceEnum race) {
        return WEIGHTS.get(race);
    }
}