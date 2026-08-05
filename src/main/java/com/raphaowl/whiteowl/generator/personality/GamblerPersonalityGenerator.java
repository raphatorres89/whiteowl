package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class GamblerPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "ousado",
            "impulsivo",
            "confiante",
            "carismático",
            "aventureiro",
            "espirituoso",
            "imprevisível",
            "despreocupado"
    );

    private static final List<String> SOCIAL = List.of(
            "faz amizade facilmente em tavernas",
            "adora contar histórias de apostas improváveis",
            "costuma desafiar desconhecidos por diversão",
            "prefere negociar antes de lutar",
            "usa o humor para quebrar o gelo",
            "faz promessas com extrema confiança",
            "vive procurando uma oportunidade vantajosa",
            "está sempre disposto a aceitar um desafio"
    );

    private static final List<String> VIRTUES = List.of(
            "coragem",
            "otimismo",
            "adaptabilidade",
            "criatividade",
            "autoconfiança",
            "persistência",
            "espontaneidade",
            "engenhosidade"
    );

    private static final List<String> FLAWS = List.of(
            "arrisca mais do que deveria",
            "confia demais na própria sorte",
            "tem dificuldade em economizar dinheiro",
            "age por impulso",
            "subestima as consequências de suas escolhas",
            "faz apostas desnecessárias",
            "gosta de provocar adversários",
            "tem dificuldade em recusar um desafio"
    );

    private static final List<String> HABITS = List.of(
            "gira uma moeda entre os dedos",
            "embaralha cartas enquanto conversa",
            "faz pequenas apostas por diversão",
            "calcula probabilidades mentalmente",
            "sorri diante do perigo",
            "coleciona dados e fichas de jogo",
            "observa cuidadosamente a linguagem corporal das pessoas",
            "assobia quando acredita que a sorte está ao seu lado"
    );

    private static final List<String> FEARS = List.of(
            "perder tudo em uma única aposta",
            "ser controlado por outra pessoa",
            "ficar preso a uma vida monótona",
            "não conseguir pagar antigas dívidas",
            "ser enganado por alguém mais esperto",
            "perder sua liberdade",
            "ver a sorte abandoná-lo",
            "fracassar quando tudo depende de uma única decisão"
    );

    private static final List<String> GOALS = List.of(
            "ganhar uma fortuna lendária",
            "vencer a aposta mais difícil de sua vida",
            "quitar todas as suas dívidas",
            "provar que a sorte favorece os ousados",
            "abrir a melhor casa de jogos do reino",
            "encontrar um adversário à sua altura",
            "viver aventuras inesquecíveis",
            "ser lembrado como o maior apostador de todos os tempos"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.GAMBLER;
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