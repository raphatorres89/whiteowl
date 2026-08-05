package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class CharlatanPersonalityGenerator extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "carismático",
            "espirituoso",
            "ousado",
            "imprevisível",
            "confiante",
            "persuasivo",
            "encantador",
            "astuto"
    );

    private static final List<String> SOCIAL = List.of(
            "consegue conquistar quase qualquer pessoa",
            "adora contar histórias exageradas",
            "faz piadas mesmo em situações perigosas",
            "muda facilmente de comportamento conforme a ocasião",
            "costuma esconder suas verdadeiras intenções",
            "gosta de provocar reações nas pessoas",
            "fala com extrema confiança",
            "prefere convencer em vez de lutar"
    );

    private static final List<String> VIRTUES = List.of(
            "adaptabilidade",
            "criatividade",
            "coragem",
            "autoconfiança",
            "engenhosidade",
            "otimismo",
            "persistência",
            "versatilidade"
    );

    private static final List<String> FLAWS = List.of(
            "mente mesmo quando não precisa",
            "confia demais na própria lábia",
            "tem dificuldade em assumir responsabilidades",
            "raramente revela seus verdadeiros sentimentos",
            "gosta de manipular situações",
            "é impulsivo quando vê uma oportunidade",
            "subestima pessoas honestas",
            "assume riscos desnecessários"
    );

    private static final List<String> HABITS = List.of(
            "brinca com uma moeda entre os dedos",
            "sorri antes de responder perguntas difíceis",
            "costuma inventar nomes falsos",
            "observa atentamente as reações das pessoas",
            "faz pequenos truques de ilusionismo",
            "sempre procura a melhor saída de uma situação",
            "fala usando gestos exagerados",
            "elogia desconhecidos para ganhar confiança"
    );

    private static final List<String> FEARS = List.of(
            "ter sua verdadeira identidade descoberta",
            "ser preso por antigos golpes",
            "perder sua liberdade",
            "não conseguir enganar a pessoa errada",
            "ser traído por um cúmplice",
            "ficar sem recursos",
            "ser visto como um fracasso",
            "não conseguir escapar de uma armadilha"
    );

    private static final List<String> GOALS = List.of(
            "executar o golpe perfeito",
            "acumular uma grande fortuna",
            "construir uma nova identidade",
            "enganar uma figura poderosa",
            "viver uma vida confortável sem trabalhar",
            "provar que é mais inteligente que seus inimigos",
            "deixar seu passado para trás",
            "tornar-se uma lenda entre vigaristas"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.CHARLATAN;
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
