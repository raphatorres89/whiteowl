package com.raphaowl.whiteowl.service;

import java.util.List;
import java.util.Random;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.controller.view.NpcView;
import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.AppearanceGenerator;
import com.raphaowl.whiteowl.util.EnumUtils;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class NpcService {

    private final AppearanceGenerator  appearanceGenerator;

    private final Random random = new Random();

    public NpcService(AppearanceGenerator appearanceGenerator) {
        this.appearanceGenerator = appearanceGenerator;
    }

    public NpcView generate(NpcFilter filter) {
        return new NpcView(
                randomName(),
                "O Errante",
                EnumUtils.pick(filter.race(), RaceEnum.class),
                EnumUtils.pick(filter.clazz(), ClassEnum.class),
                EnumUtils.pick(filter.background(), BackgroundEnum.class),
                EnumUtils.pick(filter.alignment(), AlignmentEnum.class),
                EnumUtils.pick(filter.gender(), Gender.class),
                50,
                random.nextInt(10) + 1,
                appearanceGenerator.generate(Gender.MALE, filter.race()),
                "Observador e silencioso.",
                "Busca poder arcano.",
                "Esconde um passado sombrio.",
                "Pode ajudar ou trair o grupo.",
                List.of(),
                List.of(),
                List.of(),
                List.of()
        );
    }

    private String randomName() {
        List<String> names = List.of("Arin", "Borin", "Calia", "Doran", "Elyra");
        return names.get(random.nextInt(names.size()));
    }
}