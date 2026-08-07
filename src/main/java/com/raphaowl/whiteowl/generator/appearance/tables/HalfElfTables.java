package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class HalfElfTables {
    public static final List<String> BODY_TYPES = List.of(
            "alto e esbelto",
            "de físico atlético",
            "elegante",
            "de porte refinado",
            "esguio",
            "bem proporcionado",
            "de aparência graciosa",
            "atlético e ágil",
            "de constituição leve",
            "de postura nobre"
    );

    public static final List<String> MOVEMENTS = List.of(
            "move-se com natural elegância",
            "caminha com confiança tranquila",
            "mantém postura impecável",
            "transmite leveza ao caminhar",
            "move-se silenciosamente",
            "anda com passos seguros",
            "demonstra grande equilíbrio",
            "observa atentamente o ambiente",
            "parece sempre atento aos detalhes",
            "combina graça e firmeza em seus movimentos"
    );

    public static final List<String> SKIN = List.of(
            "pele clara",
            "pele levemente bronzeada",
            "pele dourada",
            "pele oliva",
            "pele morena clara",
            "pele lisa",
            "pele delicada",
            "pele de aparência saudável",
            "pele suave",
            "pele pálida"
    );

    public static final List<String> HAIR = List.of(
            "cabelos longos castanhos",
            "cabelos loiros até os ombros",
            "cabelos negros lisos",
            "cabelos ruivos ondulados",
            "cabelos castanhos cacheados",
            "cabelos prateados",
            "cabelos dourados",
            "cabelos curtos bem penteados",
            "cabelos longos cuidadosamente trançados",
            "cabelos escuros presos para trás"
    );

    public static final List<String> EYES = List.of(
            "olhos verde-esmeralda",
            "olhos azul-claros",
            "olhos castanhos",
            "olhos âmbar",
            "olhos cinzentos",
            "olhos violeta",
            "olhos verde-musgo",
            "olhos azul-profundo",
            "olhos dourados",
            "olhos mel"
    );

    public static final List<String> TRAITS = List.of(
            "orelhas discretamente pontudas",
            "traços delicados",
            "rosto harmonioso",
            "maçãs do rosto altas",
            "nariz fino",
            "olhar expressivo",
            "sorriso acolhedor",
            "voz agradável",
            "feições elegantes",
            "presença naturalmente cativante"
    );

    public static final List<String> MARKS = List.of(
            "uma pequena cicatriz na sobrancelha",
            "algumas sardas discretas",
            "um colar de família",
            "uma tatuagem delicada",
            "um brinco de prata",
            "uma pequena pinta próxima ao olho",
            "uma pulseira de couro gasta",
            "uma marca de nascimento discreta",
            "uma antiga cicatriz na mão",
            "um pingente élfico herdado"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém um sorriso discreto",
            "transmite serenidade",
            "parece sempre observador",
            "demonstra confiança",
            "possui um olhar acolhedor",
            "parece constantemente refletindo",
            "fala de forma calma",
            "transmite simpatia",
            "mantém expressão tranquila",
            "encara os outros com gentileza"
    );

    public static final List<String> CLOTHES = List.of(
            "usa roupas elegantes de viajante",
            "veste uma túnica bem confeccionada",
            "traja couro leve ornamentado",
            "usa um manto simples",
            "veste roupas refinadas em tons naturais",
            "usa vestes inspiradas na moda élfica",
            "traja roupas resistentes de explorador",
            "usa um casaco longo",
            "veste tecidos leves cuidadosamente costurados",
            "traja roupas discretas e bem cuidadas"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega um arco bem trabalhado",
            "usa um medalhão herdado",
            "possui um anel de prata",
            "carrega uma adaga ornamentada",
            "usa braceletes de couro",
            "mantém um pequeno grimório preso ao cinto",
            "carrega uma bolsa elegante",
            "usa um broche em forma de folha",
            "mantém um pingente élfico",
            "carrega um amuleto de família"
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
