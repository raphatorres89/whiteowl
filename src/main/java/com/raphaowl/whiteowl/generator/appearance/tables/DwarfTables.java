package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class DwarfTables {
    public static final List<String> BODY_TYPES = List.of(
            "baixo e extremamente robusto",
            "atarracado",
            "forte e musculoso",
            "corpulento",
            "de ombros largos",
            "compacto e poderoso",
            "de físico sólido",
            "robusto como uma rocha",
            "musculoso e resistente",
            "de aparência vigorosa"
    );

    public static final List<String> MOVEMENTS = List.of(
            "caminha com passos pesados e firmes",
            "mantém postura orgulhosa",
            "move-se com confiança inabalável",
            "anda como alguém acostumado ao trabalho pesado",
            "demonstra força em cada movimento",
            "caminha lentamente, mas com determinação",
            "transmite segurança ao andar",
            "move-se como um veterano de guerra",
            "parece nunca perder o equilíbrio",
            "mantém uma postura firme e disciplinada"
    );

    public static final List<String> SKIN = List.of(
            "pele bronzeada",
            "pele áspera pelo trabalho",
            "pele clara marcada pelo tempo",
            "pele morena",
            "pele coberta por pequenas cicatrizes",
            "pele enrugada pela idade",
            "pele avermelhada pelo calor das forjas",
            "pele resistente",
            "pele de aparência endurecida",
            "pele marcada pelo clima das montanhas"
    );

    public static final List<String> HAIR = List.of(
            "longa barba castanha cuidadosamente trançada",
            "barba grisalha ornamentada com argolas de ferro",
            "barba negra espessa",
            "barba ruiva muito longa",
            "barba branca impecavelmente penteada",
            "cabelos longos presos para trás",
            "cabelos castanhos desgrenhados",
            "cabelos grisalhos curtos",
            "barba curta bem aparada",
            "longa barba dourada adornada com runas metálicas"
    );

    public static final List<String> EYES = List.of(
            "olhos castanhos escuros",
            "olhos azul-acinzentados",
            "olhos verdes",
            "olhos cor de âmbar",
            "olhos negros",
            "olhos cinzentos",
            "olhos castanho-claros",
            "olhos azul-profundo",
            "olhos de olhar severo",
            "olhos atentos"
    );

    public static final List<String> TRAITS = List.of(
            "nariz largo",
            "mandíbula extremamente forte",
            "barba cuidadosamente ornamentada",
            "sobrancelhas espessas",
            "mãos grandes e calejadas",
            "voz grave e poderosa",
            "feições severas",
            "rostro marcado por décadas de trabalho",
            "barba presa por anéis metálicos",
            "presença intimidadora"
    );

    public static final List<String> MARKS = List.of(
            "uma antiga cicatriz na testa",
            "uma barba adornada com anéis de prata",
            "uma queimadura de forja no braço",
            "um dedo torto por antigas batalhas",
            "uma tatuagem do clã",
            "mãos cobertas por calos",
            "uma cicatriz profunda na bochecha",
            "um olho levemente fechado por uma antiga ferida",
            "uma marca de picareta na armadura",
            "uma trança ornamentada com símbolos familiares"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém um olhar sério",
            "transmite confiança",
            "demonstra orgulho evidente",
            "parece sempre desconfiado",
            "fala com poucas palavras",
            "mantém expressão determinada",
            "parece constantemente avaliando as pessoas",
            "demonstra calma diante do perigo",
            "possui um sorriso raro, mas sincero",
            "encara qualquer um sem hesitar"
    );

    public static final List<String> CLOTHES = List.of(
            "usa uma pesada armadura de placas",
            "traja grossas roupas de lã",
            "veste couro reforçado para mineração",
            "usa um avental de ferreiro sobre as roupas",
            "traja vestes ornamentadas com símbolos do clã",
            "usa uma capa de pele espessa",
            "veste uma cota de malha muito bem cuidada",
            "traja roupas resistentes de viajante",
            "usa uma túnica reforçada por couro",
            "veste uma armadura gravada com runas antigas"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega um pesado martelo de guerra",
            "usa um machado ancestral",
            "porta um escudo coberto por brasões familiares",
            "mantém um caneco de metal preso ao cinto",
            "usa um colar de runas anãs",
            "carrega ferramentas de ferreiro",
            "possui uma picareta cuidadosamente afiada",
            "usa um cinturão ornamentado em bronze",
            "carrega uma pedra rúnica da família",
            "mantém um cachimbo de madeira entalhada"
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
