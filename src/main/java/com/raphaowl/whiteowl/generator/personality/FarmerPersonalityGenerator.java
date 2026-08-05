package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class FarmerPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "calmo",
            "humilde",
            "paciente",
            "trabalhador",
            "resiliente",
            "prático",
            "generoso",
            "otimista"
    );

    private static final List<String> SOCIAL = List.of(
            "recebe qualquer visitante com hospitalidade",
            "fala de maneira simples e sincera",
            "prefere resolver conflitos através do diálogo",
            "gosta de compartilhar histórias da infância",
            "valoriza profundamente a família e os amigos",
            "sempre oferece ajuda a quem precisa",
            "trata desconhecidos com respeito",
            "acredita que toda pessoa merece uma segunda chance"
    );

    private static final List<String> VIRTUES = List.of(
            "honestidade",
            "humildade",
            "perseverança",
            "compaixão",
            "generosidade",
            "lealdade",
            "responsabilidade",
            "paciência"
    );

    private static final List<String> FLAWS = List.of(
            "confia facilmente nas pessoas",
            "subestima os perigos do mundo",
            "tem dificuldade em abandonar suas raízes",
            "evita confrontos sempre que possível",
            "é ingênuo diante de pessoas manipuladoras",
            "coloca os outros antes de si mesmo",
            "resiste a mudanças",
            "carrega culpa por erros do passado"
    );

    private static final List<String> HABITS = List.of(
            "acorda antes do nascer do sol",
            "observa constantemente o clima",
            "assobia enquanto trabalha",
            "mantém as mãos sempre ocupadas",
            "gosta de cuidar de plantas e animais",
            "agradece pela comida antes das refeições",
            "costuma reparar ferramentas automaticamente",
            "aprecia momentos de silêncio ao amanhecer"
    );

    private static final List<String> FEARS = List.of(
            "perder sua família",
            "ver sua terra destruída",
            "passar fome novamente",
            "fracassar ao proteger quem ama",
            "não conseguir sustentar seus companheiros",
            "ser obrigado a abandonar seu lar",
            "ver inocentes sofrerem",
            "ser consumido pela guerra"
    );

    private static final List<String> GOALS = List.of(
            "construir uma vida tranquila",
            "proteger sua comunidade",
            "garantir um futuro melhor para sua família",
            "deixar um legado de bondade",
            "reconstruir sua antiga fazenda",
            "viver em paz após suas aventuras",
            "ajudar outras pessoas a prosperarem",
            "provar que pessoas simples podem mudar o mundo"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.FARMER;
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
