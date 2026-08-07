package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class ElfTables {

    public static final List<String> BODY_TYPES =
            List.of("alto e esguio", "esbelto", "atlético", "robusto para um elfo", "magro", "delicado", "imponente", "refinado", "gracioso", "de " +
                    "porte elegante");

    public static final List<String> MOVEMENTS =
            List.of("move-se com extrema elegância", "caminha em completo silêncio", "mantém uma postura impecável", "tem gestos calmos e precisos"
                    , "transmite leveza em cada movimento", "move-se como um caçador experiente", "demonstra confiança ao caminhar", "desliza pelo " +
                            "ambiente quase sem fazer ruído", "mantém movimentos suaves e controlados", "parece sempre atento ao ambiente ao redor");

    public static final List<String> SKIN = List.of(
            "pele muito clara",
            "pele clara e lisa",
            "pele levemente bronzeada",
            "pele dourada",
            "pele pálida",
            "pele de tom oliva claro",
            "pele suave sem imperfeições",
            "pele de aparência jovem",
            "pele delicada",
            "pele luminosa"
    );

    public static final List<String> HAIR = List.of(
            "cabelos longos prateados",
            "cabelos dourados até os ombros",
            "cabelos negros lisos",
            "cabelos castanhos ondulados",
            "cabelos ruivos trançados",
            "cabelos brancos longos",
            "cabelos grisalhos presos em um coque",
            "cabelos curtos castanhos",
            "cabelos loiros cuidadosamente penteados",
            "cabelos negros presos por uma trança"
    );

    public static final List<String> EYES = List.of(
            "olhos verde-esmeralda",
            "olhos azul-gelo",
            "olhos dourados",
            "olhos castanhos profundos",
            "olhos violeta",
            "olhos âmbar",
            "olhos cinzentos",
            "olhos azul-claros",
            "olhos verde-musgo",
            "olhos prateados"
    );

    public static final List<String> TRAITS = List.of(
            "orelhas longas e elegantes",
            "traços faciais delicados",
            "maçãs do rosto altas",
            "rosto fino e harmonioso",
            "olhar sereno",
            "movimentos extremamente graciosos",
            "feições aristocráticas",
            "nariz fino e delicado",
            "voz suave e melodiosa",
            "aparência quase etérea"
    );

    public static final List<String> MARKS = List.of(
            "uma fina cicatriz na sobrancelha",
            "uma pequena tatuagem élfica no pescoço",
            "sardas discretas",
            "uma pinta abaixo do olho",
            "uma cicatriz no queixo",
            "runas delicadas nos braços",
            "brincos de prata nas orelhas",
            "uma marca de nascimento em forma de folha",
            "uma tatuagem inspirada na natureza",
            "pequenas cicatrizes nas mãos"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém um sorriso discreto",
            "raramente demonstra emoções",
            "parece constantemente atento",
            "observa tudo com curiosidade",
            "transmite serenidade",
            "mantém um olhar distante",
            "demonstra confiança",
            "possui um olhar acolhedor",
            "parece sempre em contemplação",
            "encara as pessoas com tranquilidade"
    );

    public static final List<String> CLOTHES = List.of(
            "usa um manto verde bordado",
            "veste roupas finas em tons claros",
            "traja roupas de couro bem cuidadas",
            "usa uma túnica azul ornamentada",
            "veste um casaco de viagem elegante",
            "traja vestes simples de explorador",
            "usa armadura de couro trabalhada",
            "veste roupas ornamentadas com fios de prata",
            "usa um manto escuro com capuz",
            "traja roupas típicas da nobreza élfica"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega um broche em forma de folha",
            "usa um colar de âmbar",
            "possui um pingente de prata",
            "carrega um arco finamente entalhado",
            "usa braceletes élficos ornamentados",
            "traz um grimório preso ao cinto",
            "carrega uma espada de lâmina delicada",
            "usa um anel com uma esmeralda",
            "mantém um medalhão de família",
            "carrega uma bolsa de couro ricamente decorada"
    );

    public static final AppearanceTables DATA = new AppearanceTables(
            BODY_TYPES,
            MOVEMENTS,
            SKIN,
            HAIR,
            EYES,
            TRAITS,
            MARKS,
            EXPRESSIONS,
            CLOTHES,
            ACCESSORIES
    );
}
