package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class EntertainerPersonalityGenerator extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "extrovertido",
            "alegre",
            "carismático",
            "espontâneo",
            "animado",
            "criativo",
            "irreverente",
            "otimista"
    );

    private static final List<String> SOCIAL = List.of(
            "gosta de ser o centro das atenções",
            "faz amizade com facilidade",
            "conta histórias envolventes",
            "usa o humor para aliviar tensões",
            "adora elogiar os outros",
            "conquista as pessoas com seu carisma",
            "está sempre pronto para uma boa conversa",
            "transforma qualquer encontro em um espetáculo"
    );

    private static final List<String> VIRTUES = List.of(
            "criatividade",
            "empatia",
            "alegria",
            "coragem",
            "generosidade",
            "otimismo",
            "autenticidade",
            "inspiração"
    );

    private static final List<String> FLAWS = List.of(
            "busca atenção constantemente",
            "tem dificuldade em levar assuntos sérios",
            "fala mais do que deveria",
            "esconde suas dores atrás de um sorriso",
            "age impulsivamente em busca de aplausos",
            "é dramático em excesso",
            "tem medo de ser esquecido",
            "evita demonstrar fraqueza"
    );

    private static final List<String> HABITS = List.of(
            "assobia enquanto caminha",
            "faz pequenas apresentações espontaneamente",
            "gesticula bastante ao falar",
            "cumprimenta todos com entusiasmo",
            "cantarola melodias conhecidas",
            "faz reverências exageradas",
            "brinca com cartas ou moedas nas mãos",
            "costuma transformar histórias simples em grandes aventuras"
    );

    private static final List<String> FEARS = List.of(
            "ser ignorado",
            "perder sua voz ou talento",
            "fracassar diante do público",
            "ser lembrado apenas pelos próprios erros",
            "ficar sozinho",
            "não conseguir mais inspirar ninguém",
            "envelhecer sem deixar um legado",
            "ser esquecido após sua morte"
    );

    private static final List<String> GOALS = List.of(
            "tornar-se uma verdadeira lenda",
            "emocionar pessoas através de sua arte",
            "apresentar-se diante da realeza",
            "escrever uma obra inesquecível",
            "viajar pelo mundo colecionando histórias",
            "ser reconhecido em todas as tavernas",
            "fundar sua própria companhia artística",
            "levar esperança por onde passar"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.ENTERTAINER;
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
