package com.raphaowl.whiteowl.generator.name;

import java.util.Map;

import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.name.tables.DragonbornNames;
import com.raphaowl.whiteowl.generator.name.tables.DwarfNames;
import com.raphaowl.whiteowl.generator.name.tables.ElfNames;
import com.raphaowl.whiteowl.generator.name.tables.GnomeNames;
import com.raphaowl.whiteowl.generator.name.tables.HalfElfNames;
import com.raphaowl.whiteowl.generator.name.tables.HalfOrcNames;
import com.raphaowl.whiteowl.generator.name.tables.HalflingNames;
import com.raphaowl.whiteowl.generator.name.tables.HumanNames;
import com.raphaowl.whiteowl.generator.name.tables.TieflingNames;
import com.raphaowl.whiteowl.generator.util.RandomUtils;

import org.springframework.stereotype.Service;

@Service
public class NameGenerator {

    private final Map<RaceEnum, RaceNames> tables = Map.of(
            RaceEnum.HUMAN, HumanNames.DATA,
            RaceEnum.ELF, ElfNames.DATA,
            RaceEnum.DWARF, DwarfNames.DATA,
            RaceEnum.GNOME, GnomeNames.DATA,
            RaceEnum.HALFLING, HalflingNames.DATA,
            RaceEnum.DRAGONBORN, DragonbornNames.DATA,
            RaceEnum.HALF_ELF, HalfElfNames.DATA,
            RaceEnum.HALF_ORC, HalfOrcNames.DATA,
            RaceEnum.TIEFLING, TieflingNames.DATA
    );

    public String generateName(RaceEnum race, Gender gender) {

        RaceNames names = tables.get(race);

        String first = gender == Gender.MALE
                ? RandomUtils.pick(names.maleNames())
                : RandomUtils.pick(names.femaleNames());

        return first + " " + RandomUtils.pick(names.surnames());
    }

    public String generateTitle(RaceEnum race) {
        return RandomUtils.pick(tables.get(race).titles());
    }

}
