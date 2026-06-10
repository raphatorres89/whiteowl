package com.raphaowl.whiteowl.service;

import java.util.List;
import java.util.Random;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.controller.view.NpcView;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.generator.AppearanceGenerator;
import com.raphaowl.whiteowl.model.Alignment;
import com.raphaowl.whiteowl.model.Background;
import com.raphaowl.whiteowl.model.CharacterClass;
import com.raphaowl.whiteowl.model.Race;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class NpcService {

    private final RaceService raceService;
    private final CharacterClassService characterClassService;
    private final BackgroundService backgroundService;
    private final AlignmentService  alignmentService;
    private final AppearanceGenerator  appearanceGenerator;

    private final Random random = new Random();

    private final List<String> races;
    private final List<String> classes;
    private final List<String> backgrounds;
    private final List<String> alignments;
    private final List<String> genders;

    public NpcService(RaceService raceService, CharacterClassService characterClassService, BackgroundService backgroundService, AlignmentService alignmentService, AppearanceGenerator appearanceGenerator) {
        this.raceService = raceService;
        this.alignmentService = alignmentService;
        this.backgroundService = backgroundService;
        this.characterClassService = characterClassService;
        this.appearanceGenerator = appearanceGenerator;
        this.races = raceService.findAll().stream().map(Race::name).toList();
        this.classes = characterClassService.findAll().stream().map(CharacterClass::name).toList();
        this.backgrounds = backgroundService.findAll().stream().map(Background::name).toList();
        this.alignments = alignmentService.findAll().stream().map(Alignment::name).toList();
        this.genders = List.of("M", "F");
    }

    public NpcView generate(NpcFilter filter) {
        return new NpcView(
                randomName(),
                "O Errante",
                pick(filter.race(), races),
                pick(filter.clazz(), classes),
                pick(filter.background(), backgrounds),
                pick(filter.alignment(), alignments),
                pick(filter.gender(), genders),
                50,
                random.nextInt(10) + 1,
                appearanceGenerator.generate(Gender.MALE, null),
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

    private String pick(String filterValue, List<String> list) {
        return filterValue != null && !filterValue.isBlank()
                ? filterValue
                : list.get(random.nextInt(list.size()));
    }

    private String randomName() {
        List<String> names = List.of("Arin", "Borin", "Calia", "Doran", "Elyra");
        return names.get(random.nextInt(names.size()));
    }

}