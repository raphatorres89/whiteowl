package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class ScoundrelPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "astuto",
            "irreverente",
            "carismático",
            "descontraído",
            "impulsivo",
            "confiante",
            "sarcástico",
            "oportunista"
    );

    private static final List<String> SOCIAL = List.of(
            "sempre encontra uma saída inesperada",
            "prefere conversar antes de sacar uma arma",
            "usa humor para esconder suas intenções",
            "faz aliados com facilidade",
            "adora provocar pessoas arrogantes",
            "costuma dizer exatamente o que os outros querem ouvir",
            "raramente revela seus verdadeiros planos",
            "transforma qualquer negociação em vantagem própria"
    );

    private static final List<String> VIRTUES = List.of(
            "adaptabilidade",
            "criatividade",
            "coragem",
            "autoconfiança",
            "independência",
            "engenhosidade",
            "persistência",
            "versatilidade"
    );

    private static final List<String> FLAWS = List.of(
            "mente com facilidade",
            "é excessivamente ganancioso",
            "quebra promessas quando lhe convém",
            "confia demais na própria esperteza",
            "subestima seus inimigos",
            "age por impulso diante de oportunidades",
            "evita assumir responsabilidades",
            "tem dificuldade em seguir regras"
    );

    private static final List<String> HABITS = List.of(
            "gira uma adaga entre os dedos",
            "observa discretamente bolsos e mochilas",
            "sorri antes de responder perguntas difíceis",
            "procura sempre a saída mais próxima",
            "mantém várias identidades falsas",
            "coleciona pequenos objetos curiosos",
            "fala com extrema confiança",
            "vive improvisando histórias"
    );

    private static final List<String> FEARS = List.of(
            "ser preso novamente",
            "ser enganado por alguém mais esperto",
            "perder sua liberdade",
            "não conseguir escapar de uma armadilha",
            "ser traído por um aliado",
            "ficar completamente sem dinheiro",
            "ser obrigado a viver honestamente",
            "ser esquecido após a morte"
    );

    private static final List<String> GOALS = List.of(
            "realizar o golpe perfeito",
            "acumular riqueza suficiente para nunca mais trabalhar",
            "enganar um nobre poderoso",
            "construir uma reputação lendária",
            "viver intensamente cada oportunidade",
            "tornar-se intocável pela lei",
            "superar todos os seus rivais",
            "desaparecer com uma última grande fortuna"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.SCOUNDREL;
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
