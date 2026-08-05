package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class UrchinPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "esperto",
            "desconfiado",
            "resiliente",
            "curioso",
            "independente",
            "criativo",
            "cauteloso",
            "persistente"
    );

    private static final List<String> SOCIAL = List.of(
            "observa as pessoas antes de confiar nelas",
            "faz amizade apenas com quem demonstra lealdade",
            "costuma desaparecer sem ser percebido",
            "usa humor para esconder dificuldades",
            "protege ferozmente quem considera família",
            "lê facilmente as intenções das pessoas",
            "fala apenas o necessário",
            "gosta de ajudar crianças e pessoas indefesas"
    );

    private static final List<String> VIRTUES = List.of(
            "resiliência",
            "criatividade",
            "adaptabilidade",
            "lealdade",
            "coragem",
            "independência",
            "empatia",
            "persistência"
    );

    private static final List<String> FLAWS = List.of(
            "tem dificuldade em confiar nas pessoas",
            "pega objetos sem pensar",
            "sempre espera ser enganado",
            "guarda rancor facilmente",
            "é excessivamente cauteloso",
            "mente para evitar problemas",
            "tem dificuldade em aceitar ajuda",
            "coloca a própria sobrevivência acima de tudo"
    );

    private static final List<String> HABITS = List.of(
            "observa constantemente rotas de fuga",
            "esconde pequenas moedas em vários bolsos",
            "come rapidamente sempre que pode",
            "anda quase sem fazer barulho",
            "memoriza becos e atalhos",
            "inspeciona portas e janelas automaticamente",
            "carrega pequenas lembranças da infância",
            "dorme de maneira extremamente leve"
    );

    private static final List<String> FEARS = List.of(
            "voltar a viver nas ruas",
            "passar fome novamente",
            "ser abandonado por seus companheiros",
            "perder sua liberdade",
            "ser capturado por criminosos",
            "não conseguir proteger quem ama",
            "ser tratado como alguém sem valor",
            "ficar completamente sozinho"
    );

    private static final List<String> GOALS = List.of(
            "construir uma vida digna",
            "nunca mais passar necessidade",
            "proteger outras crianças abandonadas",
            "ter um verdadeiro lar",
            "provar seu valor ao mundo",
            "encontrar a família que perdeu",
            "deixar o passado para trás",
            "ser respeitado por suas próprias conquistas"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.URCHIN;
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
