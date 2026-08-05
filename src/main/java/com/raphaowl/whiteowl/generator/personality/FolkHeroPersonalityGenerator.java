package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class FolkHeroPersonalityGenerator extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "corajoso",
            "confiante",
            "determinado",
            "carismático",
            "altruísta",
            "inspirador",
            "protetor",
            "otimista"
    );

    private static final List<String> SOCIAL = List.of(
            "inspira confiança naturalmente",
            "sempre defende os mais fracos",
            "assume a liderança quando necessário",
            "prefere dividir o mérito com seus companheiros",
            "escuta atentamente os problemas das pessoas",
            "gosta de incentivar quem perdeu a esperança",
            "faz amigos por onde passa",
            "enfrenta injustiças sem hesitar"
    );

    private static final List<String> VIRTUES = List.of(
            "coragem",
            "justiça",
            "honra",
            "compaixão",
            "lealdade",
            "sacrifício",
            "esperança",
            "responsabilidade"
    );

    private static final List<String> FLAWS = List.of(
            "assume responsabilidades demais",
            "arrisca a própria vida pelos outros",
            "tem dificuldade em recuar",
            "acredita que pode salvar todos",
            "confia demais nas boas intenções alheias",
            "carrega o peso dos próprios fracassos",
            "é impulsivo diante de injustiças",
            "cobra muito de si mesmo"
    );

    private static final List<String> HABITS = List.of(
            "cumprimenta todos com respeito",
            "ajuda espontaneamente quem encontra dificuldades",
            "treina diariamente para proteger os outros",
            "conta histórias de antigos heróis",
            "mantém suas armas sempre prontas",
            "observa constantemente quem precisa de ajuda",
            "agradece aqueles que lutam ao seu lado",
            "procura levantar o ânimo dos companheiros"
    );

    private static final List<String> FEARS = List.of(
            "falhar ao proteger inocentes",
            "decepcionar aqueles que acreditam nele",
            "ver sua comunidade destruída",
            "perder seus companheiros",
            "ser lembrado como um covarde",
            "chegar tarde demais para salvar alguém",
            "abandonar seus princípios",
            "tornar-se igual aos tiranos que combate"
    );

    private static final List<String> GOALS = List.of(
            "proteger seu povo",
            "inspirar outras pessoas a fazerem o bem",
            "derrotar um grande tirano",
            "deixar um legado de coragem",
            "restaurar a paz em sua terra",
            "garantir um futuro melhor para as próximas gerações",
            "ser digno da confiança que recebeu",
            "mostrar que qualquer pessoa pode se tornar um herói"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.FOLK_HERO;
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
