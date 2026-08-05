package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class MarauderPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "agressivo",
            "impulsivo",
            "destemido",
            "determinado",
            "independente",
            "intenso",
            "ousado",
            "resiliente"
    );

    private static final List<String> SOCIAL = List.of(
            "respeita apenas aqueles que demonstram força",
            "fala de maneira direta e sem rodeios",
            "prefere agir a discutir",
            "protege ferozmente seus companheiros",
            "desafia qualquer sinal de autoridade",
            "intimida desconhecidos naturalmente",
            "valoriza coragem acima de palavras",
            "gosta de testar os limites das pessoas"
    );

    private static final List<String> VIRTUES = List.of(
            "coragem",
            "determinação",
            "resiliência",
            "lealdade",
            "independência",
            "força de vontade",
            "autossuficiência",
            "persistência"
    );

    private static final List<String> FLAWS = List.of(
            "resolve conflitos pela força",
            "é impaciente",
            "subestima adversários mais fracos",
            "age antes de pensar",
            "tem dificuldade em aceitar ordens",
            "guarda rancor facilmente",
            "é competitivo em excesso",
            "assume riscos desnecessários"
    );

    private static final List<String> HABITS = List.of(
            "mantém sua arma sempre ao alcance",
            "observa possíveis ameaças constantemente",
            "treina diariamente",
            "analisa terrenos como possíveis campos de batalha",
            "fala alto quando está animado",
            "carrega cicatrizes com orgulho",
            "desafia amigos para competições",
            "costuma dormir de armadura quando viaja"
    );

    private static final List<String> FEARS = List.of(
            "morrer sem deixar um legado",
            "ser derrotado diante de seus aliados",
            "perder sua liberdade",
            "ser considerado fraco",
            "não conseguir proteger seu grupo",
            "ser capturado pelo inimigo",
            "envelhecer sem poder lutar",
            "falhar quando todos dependem dele"
    );

    private static final List<String> GOALS = List.of(
            "tornar-se um guerreiro lendário",
            "derrotar um inimigo poderoso",
            "conquistar riquezas através de suas vitórias",
            "liderar um grande bando",
            "provar sua força ao mundo",
            "proteger seu povo",
            "viver sem se curvar a ninguém",
            "ter seu nome lembrado nas histórias de guerra"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.MARAUDER;
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
