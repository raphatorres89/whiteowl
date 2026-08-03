package com.raphaowl.whiteowl.generator.appearance;

import java.util.List;
import java.util.Random;

import com.raphaowl.whiteowl.controller.view.NpcFilter;
import com.raphaowl.whiteowl.controller.view.NpcView;
import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.NpcGenerator;
import com.raphaowl.whiteowl.generator.WeightedRandom;
import com.raphaowl.whiteowl.generator.alignment.RaceAlignmentWeights;
import com.raphaowl.whiteowl.generator.background.ClassBackgroundWeights;
import com.raphaowl.whiteowl.generator.classes.RaceClassWeights;
import com.raphaowl.whiteowl.generator.personality.PersonalityGenerator;
import com.raphaowl.whiteowl.util.EnumUtils;

import org.springframework.stereotype.Component;

@Component
public class ElfAppearanceGenerator implements NpcGenerator {

    public static final int MAX_AGE = 750;
    private static final Random RANDOM = new Random();

    public static final List<String> MALE_NAMES =
            List.of("Aelar", "Aelrindel", "Aerendil", "Aeris", "Alarion", "Althor", "Anarion", "Aramil", "Arannis", "Aravel", "Ardan", "Arlen",
                    "Aust", "Belanor", "Beluar", "Caelion", "Carric", "Daeron", "Dayereth", "Eldrin", "Elarion", "Elros", "Eltharion", "Enialis",
                    "Erevan", "Faelar", "Faeranduil", "Fenian", "Fivin", "Galador", "Galather", "Haemir", "Iafalior", "Immeral", "Ivellios",
                    "Laucian", "Laurelin", "Leandor", "Lhoris", "Mythanar", "Naeris", "Nym", "Orist", "Phaendar", "Riardon", "Soveliss", "Theren",
                    "Thamior", "Varis", "Zaos");

    public static final List<String> FEMALE_NAMES =
            List.of("Adrie", "Aelene", "Aeris", "Alaisa", "Althaea", "Amakiir", "Anastrianna", "Aranel", "Ariawyn", "Aryllan", "Ashryn", "Ayla",
                    "Belmara", "Caelynn", "Celebrian", "Daenala", "Dara", "Drusilia", "Eilistra", "Elaith", "Elanil", "Elora", "Elyra", "Enna",
                    "Faelivrin", "Faelyn", "Felosial", "Gaelira", "Holone", "Ielenia", "Illyria", "Ilyana", "Ithilwen", "Keyleth", "Laerdya",
                    "Laurelin", "Leshanna", "Lia", "Lirael", "Meriele", "Myriil", "Naivara", "Nuala", "Quelenna", "Sariel", "Shava", "Sylvara",
                    "Thia", "Valanthe", "Xyrra");

    public static final List<String> TITLES =
            List.of("Andarilho das Florestas", "Guardião das Árvores Antigas", "Vigia do Bosque", "Caçador Silencioso", "Arqueiro da Lua", "Filho " +
                    "das Estrelas", "Portador da Aurora", "Sábio dos Rios", "Protetor dos Bosques", "Cantor das Folhas", "Senhor dos Cervos",
                    "Sentinela da Fronteira", "Peregrino Élfico", "Mestre dos Ventos", "Observador das Constelações", "Defensor da Natureza",
                    "Caminhante da Névoa", "Guardião dos Antigos Segredos", "Herdeiro da Corte Élfica", "Imortal Errante");

    public static final List<String> BODY_TYPES =
            List.of("alto e esguio", "esbelto", "atlético", "robusto para um elfo", "magro", "delicado", "imponente", "refinado", "gracioso", "de " +
                    "porte elegante");

    public static final List<String> MOVEMENTS =
            List.of("move-se com extrema elegância", "caminha em completo silêncio", "mantém uma postura impecável", "tem gestos calmos e precisos"
                    , "transmite leveza em cada movimento", "move-se como um caçador experiente", "demonstra confiança ao caminhar", "desliza pelo " +
                            "ambiente quase sem fazer ruído", "mantém movimentos suaves e controlados", "parece sempre atento ao ambiente ao redor");

    public static final List<String> SKIN = List.of(
            "pele muito clara",
            "pele clara e lisa",
            "pele levemente bronzeada",
            "pele dourada",
            "pele pálida",
            "pele de tom oliva claro",
            "pele suave sem imperfeições",
            "pele de aparência jovem",
            "pele delicada",
            "pele luminosa"
    );

    public static final List<String> HAIR = List.of(
            "cabelos longos prateados",
            "cabelos dourados até os ombros",
            "cabelos negros lisos",
            "cabelos castanhos ondulados",
            "cabelos ruivos trançados",
            "cabelos brancos longos",
            "cabelos grisalhos presos em um coque",
            "cabelos curtos castanhos",
            "cabelos loiros cuidadosamente penteados",
            "cabelos negros presos por uma trança"
    );

    public static final List<String> EYES = List.of(
            "olhos verde-esmeralda",
            "olhos azul-gelo",
            "olhos dourados",
            "olhos castanhos profundos",
            "olhos violeta",
            "olhos âmbar",
            "olhos cinzentos",
            "olhos azul-claros",
            "olhos verde-musgo",
            "olhos prateados"
    );

    public static final List<String> TRAITS = List.of(
            "orelhas longas e elegantes",
            "traços faciais delicados",
            "maçãs do rosto altas",
            "rosto fino e harmonioso",
            "olhar sereno",
            "movimentos extremamente graciosos",
            "feições aristocráticas",
            "nariz fino e delicado",
            "voz suave e melodiosa",
            "aparência quase etérea"
    );

    public static final List<String> MARKS = List.of(
            "uma fina cicatriz na sobrancelha",
            "uma pequena tatuagem élfica no pescoço",
            "sardas discretas",
            "uma pinta abaixo do olho",
            "uma cicatriz no queixo",
            "runas delicadas nos braços",
            "brincos de prata nas orelhas",
            "uma marca de nascimento em forma de folha",
            "uma tatuagem inspirada na natureza",
            "pequenas cicatrizes nas mãos"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém um sorriso discreto",
            "raramente demonstra emoções",
            "parece constantemente atento",
            "observa tudo com curiosidade",
            "transmite serenidade",
            "mantém um olhar distante",
            "demonstra confiança",
            "possui um olhar acolhedor",
            "parece sempre em contemplação",
            "encara as pessoas com tranquilidade"
    );

    public static final List<String> CLOTHES = List.of(
            "usa um manto verde bordado",
            "veste roupas finas em tons claros",
            "traja roupas de couro bem cuidadas",
            "usa uma túnica azul ornamentada",
            "veste um casaco de viagem elegante",
            "traja vestes simples de explorador",
            "usa armadura de couro trabalhada",
            "veste roupas ornamentadas com fios de prata",
            "usa um manto escuro com capuz",
            "traja roupas típicas da nobreza élfica"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega um broche em forma de folha",
            "usa um colar de âmbar",
            "possui um pingente de prata",
            "carrega um arco finamente entalhado",
            "usa braceletes élficos ornamentados",
            "traz um grimório preso ao cinto",
            "carrega uma espada de lâmina delicada",
            "usa um anel com uma esmeralda",
            "mantém um medalhão de família",
            "carrega uma bolsa de couro ricamente decorada"
    );

    private static final List<ClassEnum> ELF_CLASSES =
            List.of(ClassEnum.RANGER, ClassEnum.WIZARD, ClassEnum.DRUID, ClassEnum.ROGUE, ClassEnum.BARD, ClassEnum.FIGHTER);
    public static final RaceEnum RACE = RaceEnum.ELF;

    private final PersonalityGenerator personalityGenerator;

    public ElfAppearanceGenerator(PersonalityGenerator personalityGenerator) {
        this.personalityGenerator = personalityGenerator;
    }

    @Override
    public NpcView generate(NpcFilter filter) {

        ClassEnum clazz = WeightedRandom.pick(RaceClassWeights.get(RACE)).clazz();
        AlignmentEnum alignment = WeightedRandom.pick(RaceAlignmentWeights.get(RACE)).alignment();
        BackgroundEnum background = WeightedRandom.pick(ClassBackgroundWeights.get(clazz)).background();

        return new NpcView(
                getName(filter.gender()),
                TITLES.get(RANDOM.nextInt(TITLES.size())),
                RACE,
                clazz,
                background,
                alignment,
                EnumUtils.pick(filter.gender(), Gender.class),
                RANDOM.nextInt(MAX_AGE),
                RANDOM.nextInt(16),
                generateAppearance(),
                personalityGenerator.generate(background));
    }

    private String getName(Gender gender) {
        if (gender == Gender.MALE) {
            return random(MALE_NAMES);
        } else {
            return random(FEMALE_NAMES);
        }
    }

    private String generateAppearance() {
        return String.format(
                "%s, %s. Possui %s, %s e %s. Tem %s. %s e %s. %s.",
                random(BODY_TYPES),
                random(MOVEMENTS),
                random(SKIN),
                random(HAIR),
                random(EYES),
                random(TRAITS),
                random(MARKS),
                random(EXPRESSIONS),
                random(CLOTHES) + " e " + random(ACCESSORIES)
        );
    }

    private String random(List<String> list) {
        return list.get(RANDOM.nextInt(list.size()));
    }

}
