package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class CriminalPersonalityGenerator extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "frio",
            "calculista",
            "reservado",
            "determinado",
            "desconfiado",
            "pragmático",
            "cauteloso",
            "persistente"
    );

    private static final List<String> SOCIAL = List.of(
            "fala apenas o necessário",
            "desconfia de qualquer desconhecido",
            "observa todas as rotas de fuga",
            "mantém distância emocional das pessoas",
            "valoriza quem prova ser leal",
            "analisa cada palavra antes de responder",
            "raramente baixa a guarda",
            "prefere agir nas sombras"
    );

    private static final List<String> VIRTUES = List.of(
            "lealdade aos aliados",
            "disciplina",
            "autocontrole",
            "coragem",
            "resiliência",
            "determinação",
            "eficiência",
            "praticidade"
    );

    private static final List<String> FLAWS = List.of(
            "confia em poucas pessoas",
            "resolve muitos problemas pela violência",
            "guarda rancor por muito tempo",
            "é extremamente vingativo",
            "tem dificuldade em seguir autoridades",
            "sempre espera ser traído",
            "é frio demais com desconhecidos",
            "não costuma pedir ajuda"
    );

    private static final List<String> HABITS = List.of(
            "mantém as costas voltadas para a parede",
            "verifica constantemente seus equipamentos",
            "memoriza rostos com facilidade",
            "fala em voz baixa",
            "nunca revela todos os seus planos",
            "observa bolsos e cintos das pessoas automaticamente",
            "evita permanecer muito tempo no mesmo lugar",
            "costuma dormir com uma arma ao alcance"
    );

    private static final List<String> FEARS = List.of(
            "ser capturado",
            "ser traído por um antigo parceiro",
            "voltar para a prisão",
            "perder sua liberdade",
            "falhar durante uma fuga",
            "ter seu passado descoberto",
            "ver seus aliados morrerem",
            "ser usado por alguém mais poderoso"
    );

    private static final List<String> GOALS = List.of(
            "realizar um último grande golpe",
            "construir uma nova vida",
            "vingar-se de um antigo inimigo",
            "tornar-se líder de uma organização criminosa",
            "garantir segurança para sua família",
            "acumular riqueza suficiente para desaparecer",
            "destruir quem o traiu",
            "provar que ninguém controla seu destino"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.CRIMINAL;
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
