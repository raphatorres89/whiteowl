package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class HumanTables {
    public static final List<String> BODY_TYPES = List.of(
            "alto e musculoso",
            "alto e magro",
            "baixo e robusto",
            "de estatura mediana",
            "atlético",
            "corpulento",
            "esbelto",
            "forte e largo de ombros",
            "magro",
            "de físico comum"
    );

    public static final List<String> MOVEMENTS = List.of(
            "caminha com passos firmes",
            "move-se com naturalidade",
            "mantém postura confiante",
            "anda de forma cautelosa",
            "tem gestos rápidos",
            "parece sempre atento",
            "move-se como alguém acostumado ao trabalho pesado",
            "mantém uma postura relaxada",
            "demonstra disciplina ao caminhar",
            "move-se com energia"
    );

    public static final List<String> SKIN = List.of(
            "pele muito clara",
            "pele clara",
            "pele bronzeada",
            "pele morena",
            "pele escura",
            "pele marcada pelo sol",
            "pele levemente enrugada",
            "pele com pequenas sardas",
            "pele de aparência saudável",
            "pele áspera pelo trabalho"
    );

    public static final List<String> HAIR = List.of(
            "cabelos castanhos curtos",
            "cabelos negros ondulados",
            "cabelos loiros",
            "cabelos ruivos",
            "cabelos grisalhos",
            "cabelos castanho-claros",
            "cabelos longos presos",
            "cabelos raspados",
            "cabelos cacheados",
            "cabelos escuros penteados para trás"
    );

    public static final List<String> EYES = List.of(
            "olhos castanhos",
            "olhos verdes",
            "olhos azuis",
            "olhos cinzentos",
            "olhos cor de mel",
            "olhos negros",
            "olhos azul-claros",
            "olhos castanho-escuros",
            "olhos âmbar",
            "olhos verde-oliva"
    );

    public static final List<String> TRAITS = List.of(
            "rosto expressivo",
            "mandíbula marcada",
            "nariz largo",
            "maçãs do rosto salientes",
            "barba bem aparada",
            "barba espessa",
            "barba por fazer",
            "queixo forte",
            "rosto fino",
            "feições comuns"
    );

    public static final List<String> MARKS = List.of(
            "uma cicatriz na bochecha",
            "uma cicatriz na sobrancelha",
            "algumas sardas",
            "uma barba cuidadosamente aparada",
            "uma tatuagem simples no braço",
            "mãos calejadas",
            "uma queimadura antiga",
            "uma marca de nascença",
            "alguns fios grisalhos",
            "um pequeno corte no queixo"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "transmite confiança",
            "mantém um olhar sério",
            "sorri com facilidade",
            "parece desconfiado",
            "observa tudo atentamente",
            "demonstra tranquilidade",
            "mantém expressão determinada",
            "parece sempre cansado",
            "demonstra entusiasmo",
            "tem um olhar acolhedor"
    );

    public static final List<String> CLOTHES = List.of(
            "usa roupas simples de viajante",
            "veste roupas de couro resistentes",
            "traja vestes de mercador",
            "usa um manto surrado",
            "veste roupas bem cuidadas",
            "traja uma túnica simples",
            "usa uma armadura de couro",
            "veste roupas de boa qualidade",
            "usa um casaco pesado",
            "traja roupas típicas de um aventureiro"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega uma mochila bem organizada",
            "usa um medalhão de família",
            "mantém uma adaga presa ao cinto",
            "carrega um velho cantil",
            "usa um anel de prata",
            "leva uma bolsa de couro",
            "possui um rosário de madeira",
            "carrega uma espada bem conservada",
            "usa um chapéu de viajante",
            "mantém um pequeno amuleto da sorte"
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
