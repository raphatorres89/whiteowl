package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class SailorPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "adaptável",
            "calmo",
            "confiante",
            "determinado",
            "disciplinado",
            "aventureiro",
            "resiliente",
            "otimista"
    );

    private static final List<String> SOCIAL = List.of(
            "faz amizade facilmente com viajantes",
            "gosta de compartilhar histórias do mar",
            "confia profundamente em seus companheiros",
            "costuma assumir responsabilidades durante crises",
            "mantém o bom humor mesmo sob pressão",
            "valoriza trabalho em equipe acima de tudo",
            "trata estranhos com respeito até que provem o contrário",
            "encoraja os outros durante momentos difíceis"
    );

    private static final List<String> VIRTUES = List.of(
            "lealdade",
            "coragem",
            "disciplina",
            "perseverança",
            "adaptabilidade",
            "honestidade",
            "responsabilidade",
            "companheirismo"
    );

    private static final List<String> FLAWS = List.of(
            "sente-se inquieto em terra firme por muito tempo",
            "confia demais na própria experiência",
            "subestima perigos desconhecidos",
            "tem dificuldade em seguir autoridades incompetentes",
            "assume riscos desnecessários",
            "é impulsivo diante de desafios",
            "carrega antigos rancores",
            "prefere resolver problemas sozinho"
    );

    private static final List<String> HABITS = List.of(
            "observa automaticamente a direção do vento",
            "amarra cordas de forma impecável",
            "cantarola antigas canções marítimas",
            "inspeciona rotas de fuga ao chegar em um lugar",
            "mantém seus equipamentos sempre secos e organizados",
            "olha frequentemente para o horizonte",
            "acorda antes do amanhecer",
            "costuma contar nós usando apenas o tato"
    );

    private static final List<String> FEARS = List.of(
            "afundar em alto-mar",
            "perder sua tripulação",
            "ser abandonado em uma ilha",
            "enfrentar uma tempestade impossível",
            "fracassar como líder",
            "ver seus companheiros morrerem",
            "ser incapaz de voltar para casa",
            "ficar preso longe do mar"
    );

    private static final List<String> GOALS = List.of(
            "explorar mares desconhecidos",
            "encontrar uma ilha lendária",
            "comandar sua própria embarcação",
            "descobrir um tesouro perdido",
            "aposentar-se com honra",
            "tornar-se um capitão respeitado",
            "mapear rotas jamais navegadas",
            "viver aventuras que sejam contadas por gerações"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.SAILOR;
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
