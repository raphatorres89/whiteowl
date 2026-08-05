package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class ArtisanPersonalityGenerator extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "meticuloso",
            "paciente",
            "criativo",
            "perfeccionista",
            "pragmático",
            "persistente",
            "disciplinado",
            "observador"
    );

    private static final List<String> SOCIAL = List.of(
            "prefere demonstrar habilidade em vez de falar",
            "gosta de ensinar seu ofício aos interessados",
            "faz amizades facilmente com outros artesãos",
            "analisa cuidadosamente tudo ao seu redor",
            "conversa animadamente sobre técnicas e ferramentas",
            "trata desconhecidos com educação profissional",
            "escuta atentamente antes de oferecer uma solução",
            "costuma elogiar o bom trabalho de outras pessoas"
    );

    private static final List<String> VIRTUES = List.of(
            "dedicação",
            "criatividade",
            "honestidade",
            "paciência",
            "excelência",
            "disciplina",
            "humildade",
            "generosidade"
    );

    private static final List<String> FLAWS = List.of(
            "é perfeccionista demais",
            "fica irritado com trabalhos mal feitos",
            "tem dificuldade em delegar tarefas",
            "subestima pessoas sem um ofício",
            "demora para considerar um projeto concluído",
            "é teimoso quanto aos próprios métodos",
            "trabalha até a exaustão",
            "tem orgulho excessivo de suas criações"
    );

    private static final List<String> HABITS = List.of(
            "está sempre polindo ou ajustando alguma ferramenta",
            "inspeciona automaticamente objetos bem construídos",
            "faz pequenos esboços sempre que tem uma ideia",
            "mantém as mãos constantemente ocupadas",
            "observa detalhes que passam despercebidos pelos outros",
            "mede distâncias e proporções apenas com o olhar",
            "guarda peças e materiais que podem ser úteis no futuro",
            "limpa cuidadosamente seus equipamentos antes de descansar"
    );

    private static final List<String> FEARS = List.of(
            "perder a habilidade de criar",
            "ver sua obra destruída",
            "ser esquecido como artesão",
            "falhar diante de um grande desafio técnico",
            "decepcionar seu antigo mestre",
            "produzir algo indigno de seu nome",
            "ficar sem ferramentas para exercer seu ofício",
            "ser obrigado a abandonar sua arte"
    );

    private static final List<String> GOALS = List.of(
            "criar uma obra-prima que sobreviva por gerações",
            "fundar sua própria oficina",
            "aprender técnicas esquecidas",
            "superar o legado de seu mestre",
            "construir algo que mude a vida das pessoas",
            "encontrar materiais lendários",
            "ser reconhecido como mestre em seu ofício",
            "deixar seu nome marcado na história"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.ARTISAN;
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