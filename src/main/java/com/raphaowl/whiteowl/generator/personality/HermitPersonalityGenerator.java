package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class HermitPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "calmo",
            "introspectivo",
            "paciente",
            "reservado",
            "sereno",
            "contemplativo",
            "sábio",
            "disciplinado"
    );

    private static final List<String> SOCIAL = List.of(
            "fala apenas quando considera necessário",
            "ouve atentamente antes de responder",
            "prefere observar as pessoas à distância",
            "transmite tranquilidade aos companheiros",
            "evita discussões desnecessárias",
            "oferece conselhos ponderados",
            "valoriza conversas profundas",
            "aprecia momentos de silêncio compartilhado"
    );

    private static final List<String> VIRTUES = List.of(
            "sabedoria",
            "paciência",
            "autocontrole",
            "humildade",
            "perseverança",
            "compaixão",
            "disciplina",
            "serenidade"
    );

    private static final List<String> FLAWS = List.of(
            "tem dificuldade em confiar nas pessoas",
            "prefere o isolamento à convivência",
            "demora para agir",
            "vive preso às próprias reflexões",
            "ignora problemas imediatos em busca de respostas maiores",
            "tem dificuldade em demonstrar emoções",
            "é excessivamente cauteloso",
            "evita assumir liderança"
    );

    private static final List<String> HABITS = List.of(
            "medita diariamente",
            "contempla o nascer do sol em silêncio",
            "anota pensamentos em um velho caderno",
            "costuma caminhar sozinho",
            "observa atentamente a natureza",
            "recita antigos provérbios",
            "mantém seus pertences organizados",
            "fecha os olhos antes de tomar decisões importantes"
    );

    private static final List<String> FEARS = List.of(
            "perder sua paz interior",
            "esquecer as lições do passado",
            "ser consumido pela raiva",
            "ver o conhecimento desaparecer",
            "machucar inocentes",
            "não encontrar as respostas que procura",
            "ser forçado a abandonar sua tranquilidade",
            "fracassar em sua busca espiritual"
    );

    private static final List<String> GOALS = List.of(
            "alcançar a verdadeira iluminação",
            "descobrir um conhecimento perdido",
            "compreender os mistérios do mundo",
            "transmitir sua sabedoria às próximas gerações",
            "encontrar equilíbrio entre corpo e mente",
            "proteger um antigo segredo",
            "resolver uma dúvida que o acompanha há anos",
            "viver em completa harmonia com a natureza"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.HERMIT;
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
