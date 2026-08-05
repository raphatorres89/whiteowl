package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class AcolytePersonalityGenerator extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "calmo",
            "sereno",
            "paciente",
            "disciplinado",
            "contemplativo"
    );

    private static final List<String> SOCIAL = List.of(
            "ouve mais do que fala",
            "trata todos com respeito",
            "aconselha aqueles ao seu redor",
            "fala com voz tranquila",
            "evita conflitos desnecessários"
    );

    private static final List<String> VIRTUES = List.of(
            "compaixão",
            "honestidade",
            "humildade",
            "perseverança",
            "empatia"
    );

    private static final List<String> FLAWS = List.of(
            "confia facilmente nas pessoas",
            "é rígido em suas crenças",
            "tem dificuldade em quebrar regras",
            "costuma se sacrificar pelos outros",
            "julga quem despreza sua fé"
    );

    private static final List<String> HABITS = List.of(
            "faz pequenas orações diariamente",
            "mantém suas roupas impecáveis",
            "carrega um símbolo sagrado nas mãos",
            "recita antigos ensinamentos",
            "agradece antes das refeições"
    );

    private static final List<String> FEARS = List.of(
            "perder sua fé",
            "falhar com sua ordem",
            "ser corrompido",
            "ver inocentes sofrerem",
            "ser abandonado por sua divindade"
    );

    private static final List<String> GOALS = List.of(
            "espalhar esperança",
            "proteger os inocentes",
            "encontrar uma relíquia sagrada",
            "restaurar um templo antigo",
            "cumprir uma antiga profecia"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.ACOLYTE;
    }

    @Override
    public Personality generate(CharacterContext context) {
        return build(
                TEMPERAMENTS,
                SOCIAL,
                VIRTUES,
                FLAWS,
                HABITS,
                FEARS,
                GOALS
        );
    }
}
