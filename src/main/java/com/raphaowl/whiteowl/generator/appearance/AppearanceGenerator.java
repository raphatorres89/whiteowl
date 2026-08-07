package com.raphaowl.whiteowl.generator.appearance;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.appearance.tables.DragonbornTables;
import com.raphaowl.whiteowl.generator.appearance.tables.DwarfTables;
import com.raphaowl.whiteowl.generator.appearance.tables.ElfTables;
import com.raphaowl.whiteowl.generator.appearance.tables.GnomeTables;
import com.raphaowl.whiteowl.generator.appearance.tables.HalfElfTables;
import com.raphaowl.whiteowl.generator.appearance.tables.HalfOrcTables;
import com.raphaowl.whiteowl.generator.appearance.tables.HalflingTables;
import com.raphaowl.whiteowl.generator.appearance.tables.HumanTables;
import com.raphaowl.whiteowl.generator.appearance.tables.TieflingTables;
import com.raphaowl.whiteowl.generator.util.RandomUtils;

import org.springframework.stereotype.Service;

@Service
public class AppearanceGenerator {

    private static final Random RANDOM = new Random();

    private final Map<RaceEnum, AppearanceTables> tables = Map.of(
            RaceEnum.HUMAN, HumanTables.DATA,
            RaceEnum.ELF, ElfTables.DATA,
            RaceEnum.DWARF, DwarfTables.DATA,
            RaceEnum.GNOME, GnomeTables.DATA,
            RaceEnum.HALFLING, HalflingTables.DATA,
            RaceEnum.DRAGONBORN, DragonbornTables.DATA,
            RaceEnum.HALF_ELF, HalfElfTables.DATA,
            RaceEnum.HALF_ORC, HalfOrcTables.DATA,
            RaceEnum.TIEFLING, TieflingTables.DATA
    );

    public String generate(NpcFilter filter) {
        RaceEnum raceEnum = filter.race() == null ? RandomUtils.pick(List.of(RaceEnum.values())) : filter.race();

        AppearanceTables appearanceTables = tables.get(raceEnum);

        return String.format(
                "%s, %s. Possui %s, %s e %s. Tem %s. %s e %s. %s.",
                capitalize(random(appearanceTables.bodyTypes())),
                random(appearanceTables.movements()),
                random(appearanceTables.skin()),
                random(appearanceTables.hair()),
                random(appearanceTables.eyes()),
                random(appearanceTables.traits()),
                capitalize(random(appearanceTables.marks())),
                random(appearanceTables.expressions()),
                capitalize(random(appearanceTables.clothes()) + " e " + random(appearanceTables.accessories()))
        );
    }

    private String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    private String random(List<String> list) {
        return list.get(RANDOM.nextInt(list.size()));
    }


}
