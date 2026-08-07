package com.raphaowl.whiteowl.generator.appearance;

import static com.raphaowl.whiteowl.generator.appearance.tables.DragonbornTables.*;

import java.util.List;
import java.util.Random;

import com.raphaowl.whiteowl.enums.RaceEnum;

import org.springframework.stereotype.Component;

@Component
public class DragonbornAppearanceGenerator implements RaceAppearanceGenerator {

    private static final Random RANDOM = new Random();

    @Override
    public RaceEnum race() {
        return RaceEnum.DRAGONBORN;
    }

    @Override
    public String generate() {
        return String.format(
                "%s, %s. Possui %s, %s e %s. Tem %s. %s e %s. %s.",
                capitalize(random(BODY_TYPES)),
                random(MOVEMENTS),
                random(SKIN),
                random(HAIR),
                random(EYES),
                random(TRAITS),
                capitalize(random(MARKS)),
                random(EXPRESSIONS),
                capitalize(random(CLOTHES) + " e " + random(ACCESSORIES))
        );
    }

    private String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    private String random(List<String> list) {
        return list.get(RANDOM.nextInt(list.size()));
    }
}
