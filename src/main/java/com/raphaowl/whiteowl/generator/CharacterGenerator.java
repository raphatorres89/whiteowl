package com.raphaowl.whiteowl.generator;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.alignment.AlignmentGenerator;
import com.raphaowl.whiteowl.generator.appearance.Appearance;
import com.raphaowl.whiteowl.generator.appearance.AppearanceGenerator;
import com.raphaowl.whiteowl.generator.background.BackgroundGenerator;
import com.raphaowl.whiteowl.generator.clazz.ClassGenerator;
import com.raphaowl.whiteowl.generator.gender.GenderGenerator;
import com.raphaowl.whiteowl.generator.name.NameGenerator;
import com.raphaowl.whiteowl.generator.personality.CharacterContext;
import com.raphaowl.whiteowl.generator.personality.Personality;
import com.raphaowl.whiteowl.generator.personality.PersonalityGenerator;
import com.raphaowl.whiteowl.generator.race.RaceGenerator;

import org.springframework.stereotype.Component;

@Component
public class CharacterGenerator {

    private final RaceGenerator raceGenerator;
    private final GenderGenerator genderGenerator;
    private final ClassGenerator classGenerator;
    private final BackgroundGenerator backgroundGenerator;
    private final AlignmentGenerator alignmentGenerator;
    private final NameGenerator raceNameGenerator;
    private final AppearanceGenerator appearanceGenerator;
    private final PersonalityGenerator personalityGenerator;

    public CharacterGenerator(RaceGenerator raceGenerator, GenderGenerator genderGenerator, ClassGenerator classGenerator,
                              BackgroundGenerator backgroundGenerator, AlignmentGenerator alignmentGenerator,
                              NameGenerator raceNameGenerator, AppearanceGenerator appearanceGenerator,
                              PersonalityGenerator personalityGenerator) {
        this.raceGenerator = raceGenerator;
        this.genderGenerator = genderGenerator;
        this.classGenerator = classGenerator;
        this.backgroundGenerator = backgroundGenerator;
        this.alignmentGenerator = alignmentGenerator;
        this.raceNameGenerator = raceNameGenerator;
        this.appearanceGenerator = appearanceGenerator;
        this.personalityGenerator = personalityGenerator;
    }

    public CharacterProfile generate(NpcFilter filter) {

        RaceEnum race = raceGenerator.generate(filter.race());
        Gender gender = genderGenerator.generate(filter.gender());
        ClassEnum clazz = classGenerator.generate(filter.clazz(), race);
        BackgroundEnum background = backgroundGenerator.generate(filter.background(), clazz);
        AlignmentEnum alignment = alignmentGenerator.generate(filter.alignment(), race, clazz, background);

        String name = raceNameGenerator.generateName(race, gender);
        String title = raceNameGenerator.generateTitle(race, gender);

        CharacterContext context = new CharacterContext(race, gender, clazz, background, alignment);

        Appearance appearance = appearanceGenerator.generate(filter);
        Personality personality = personalityGenerator.generate(context);

        return new CharacterProfile(
                name,
                title,
                race,
                gender,
                clazz,
                background,
                alignment,
                appearance,
                personality);
    }
}
