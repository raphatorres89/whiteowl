package com.raphaowl.whiteowl.generator;

import java.util.List;
import java.util.Random;

import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.enums.RaceEnum;

import org.springframework.stereotype.Component;

@Component
public class AppearanceGenerator {

    private static final Random RANDOM = new Random();

    private static final List<String> HAIR_FEMALE = List.of(
            "cabelos longos e brancos",
            "cabelos longos e dourados",
            "cabelos negros trançados",
            "cabelos ruivos ondulados",
            "cabelos curtos e prateados"
    );

    private static final List<String> HAIR_MALE = List.of(
            "cabelos curtos e grisalhos",
            "cabelos negros penteados para trás",
            "cabelos castanhos desgrenhados",
            "cabelos ruivos curtos",
            "cabeça raspada"
    );

    private static final List<String> EYES = List.of(
            "olhos verdes penetrantes",
            "olhos azuis brilhantes",
            "olhos castanhos atentos",
            "olhos dourados incomuns",
            "olhos cinzentos melancólicos"
    );

    private static final List<String> MARKS = List.of(
            "uma cicatriz atravessando a sobrancelha",
            "sardas espalhadas pelo rosto",
            "uma tatuagem de lua na testa",
            "uma marca de queimadura no pescoço",
            "uma pinta marcante abaixo do olho"
    );

    private static final List<String> EXPRESSIONS = List.of(
            "franze a testa ao falar",
            "mantém um sorriso discreto",
            "evita contato visual prolongado",
            "olha constantemente ao redor",
            "inclina levemente a cabeça enquanto escuta"
    );

    private static final List<String> CLOTHES = List.of(
            "usa roupas impecavelmente alinhadas",
            "veste um manto gasto pelo tempo",
            "prefere roupas coloridas e extravagantes",
            "traja vestes simples de viajante",
            "usa armadura cuidadosamente polida"
    );

    private static final List<String> ELF_TRAITS = List.of(
            "orelhas longas e elegantes",
            "traços faciais delicados",
            "movimentos extremamente graciosos"
    );

    private static final List<String> DWARF_TRAITS = List.of(
            "barba cuidadosamente trançada",
            "ombros largos e robustos",
            "nariz marcado por antigas batalhas"
    );

    private static final List<String> TIEFLING_TRAITS = List.of(
            "pequenos chifres curvados",
            "cauda longa e inquieta",
            "olhos sem pupilas visíveis"
    );

    public String generate(Gender gender, RaceEnum race) {

        String hair = random(
                gender == Gender.FEMALE
                        ? HAIR_FEMALE
                        : HAIR_MALE
        );

        String eyes = random(EYES);
        String mark = random(MARKS);
        String expression = random(EXPRESSIONS);
        String clothes = random(CLOTHES);

        return String.format(
                "%s, %s, %s, %s e %s.",
                hair,
                eyes,
                mark,
                clothes,
                expression
        );
    }

    private String raceTrait(RaceEnum race) {
        return switch (race) {
            case ELF -> random(ELF_TRAITS);
            case DWARF -> random(DWARF_TRAITS);
            case TIEFLING -> random(TIEFLING_TRAITS);
            default -> "";
        };
    }

    private String random(List<String> values) {
        return values.get(RANDOM.nextInt(values.size()));
    }
}
