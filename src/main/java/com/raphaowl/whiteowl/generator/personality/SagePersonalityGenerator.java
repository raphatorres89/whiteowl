package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class SagePersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "curioso",
            "analítico",
            "paciente",
            "disciplinado",
            "calmo",
            "metódico",
            "reflexivo",
            "observador"
    );

    private static final List<String> SOCIAL = List.of(
            "gosta de explicar assuntos complexos",
            "ouve atentamente antes de formular uma resposta",
            "faz perguntas constantemente",
            "prefere debates inteligentes a discussões acaloradas",
            "costuma citar livros e estudiosos",
            "compartilha conhecimento com prazer",
            "analisa diferentes pontos de vista antes de decidir",
            "demonstra entusiasmo ao aprender algo novo"
    );

    private static final List<String> VIRTUES = List.of(
            "sabedoria",
            "curiosidade",
            "disciplina",
            "honestidade",
            "paciência",
            "objetividade",
            "humildade intelectual",
            "dedicação"
    );

    private static final List<String> FLAWS = List.of(
            "pensa demais antes de agir",
            "subestima pessoas menos instruídas",
            "fica obcecado por mistérios",
            "esquece das necessidades práticas",
            "corrige os outros com frequência",
            "é excessivamente perfeccionista",
            "tem dificuldade em admitir que não sabe algo",
            "prioriza conhecimento acima de emoções"
    );

    private static final List<String> HABITS = List.of(
            "faz anotações constantemente",
            "coleciona livros e mapas antigos",
            "observa cuidadosamente pequenos detalhes",
            "costuma ler antes de dormir",
            "memoriza nomes e datas com facilidade",
            "faz perguntas mesmo sobre assuntos simples",
            "organiza cuidadosamente seus documentos",
            "costuma refletir em voz alta"
    );

    private static final List<String> FEARS = List.of(
            "perder um conhecimento valioso",
            "ver livros antigos destruídos",
            "morrer antes de concluir suas pesquisas",
            "ser enganado por falsas informações",
            "esquecer algo importante",
            "fracassar na resolução de um grande mistério",
            "tomar decisões baseadas na ignorância",
            "descobrir que toda sua pesquisa estava errada"
    );

    private static final List<String> GOALS = List.of(
            "descobrir um conhecimento perdido",
            "escrever uma obra que sobreviva aos séculos",
            "resolver um antigo mistério",
            "dominar todas as grandes bibliotecas do mundo",
            "traduzir um manuscrito lendário",
            "ensinar uma nova geração de estudiosos",
            "desvendar os segredos da magia",
            "compreender completamente a história do mundo"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.SAGE;
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
