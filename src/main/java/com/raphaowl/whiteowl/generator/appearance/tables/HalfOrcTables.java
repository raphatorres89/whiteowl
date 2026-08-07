package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class HalfOrcTables {
    public static final List<String> BODY_TYPES = List.of(
            "alto e musculoso",
            "extremamente robusto",
            "de físico imponente",
            "atlético",
            "corpulento",
            "de ombros largos",
            "forte como um guerreiro veterano",
            "de aparência intimidadora",
            "musculoso e resistente",
            "de constituição poderosa"
    );

    public static final List<String> MOVEMENTS = List.of(
            "move-se com passos firmes",
            "caminha como um guerreiro experiente",
            "transmite confiança ao andar",
            "mantém postura vigilante",
            "move-se com surpreendente agilidade",
            "parece sempre preparado para lutar",
            "anda de maneira determinada",
            "mantém os ombros erguidos",
            "move-se como um caçador",
            "demonstra força em cada movimento"
    );

    public static final List<String> SKIN = List.of(
            "pele verde-oliva",
            "pele cinza-esverdeada",
            "pele bronzeada",
            "pele morena",
            "pele escura",
            "pele marcada por antigas cicatrizes",
            "pele grossa e resistente",
            "pele de tom oliva",
            "pele acinzentada",
            "pele castigada pelo tempo"
    );

    public static final List<String> HAIR = List.of(
            "cabelos negros curtos",
            "cabelos longos presos em tranças",
            "cabelos castanhos desgrenhados",
            "cabelos raspados nas laterais",
            "cabelos presos em um rabo de cavalo",
            "cabelos grisalhos curtos",
            "cabelos grossos e escuros",
            "cabelos longos e desalinhados",
            "cabelos curtos bem aparados",
            "cabelos trançados com contas de osso"
    );

    public static final List<String> EYES = List.of(
            "olhos amarelos",
            "olhos âmbar",
            "olhos castanhos profundos",
            "olhos verdes escuros",
            "olhos negros",
            "olhos cinzentos",
            "olhos avermelhados",
            "olhos dourados",
            "olhos verde-musgo",
            "olhos intensos"
    );

    public static final List<String> TRAITS = List.of(
            "presas inferiores discretamente aparentes",
            "mandíbula larga",
            "sobrancelhas espessas",
            "nariz largo",
            "rosto marcado por antigas batalhas",
            "mãos calejadas",
            "voz grave",
            "olhar intimidador",
            "cicatrizes antigas espalhadas pelo corpo",
            "presença naturalmente dominante"
    );

    public static final List<String> MARKS = List.of(
            "uma cicatriz atravessando o rosto",
            "marcas de antigas batalhas",
            "uma tatuagem tribal",
            "um brinco de osso",
            "uma antiga queimadura",
            "cortes cicatrizados nos braços",
            "uma marca de clã no ombro",
            "um nariz quebrado que nunca cicatrizou direito",
            "cicatrizes nas mãos",
            "um colar feito de presas"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém expressão séria",
            "fala pouco",
            "parece constantemente atento",
            "observa os outros com desconfiança",
            "transmite autocontrole",
            "raramente sorri",
            "mantém um olhar firme",
            "parece sempre pronto para agir",
            "demonstra calma inesperada",
            "encara qualquer um sem hesitação"
    );

    public static final List<String> CLOTHES = List.of(
            "usa armadura de couro reforçado",
            "veste peles de animais",
            "traja roupas resistentes de viajante",
            "usa uma armadura de escamas gasta",
            "veste roupas simples adaptadas para combate",
            "usa uma pesada capa de pele",
            "traja roupas reforçadas por placas metálicas",
            "veste couro ornamentado com símbolos tribais",
            "usa uma armadura marcada por antigas batalhas",
            "traja vestes funcionais e resistentes"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega um enorme machado de guerra",
            "usa um colar feito de presas",
            "porta um martelo de combate",
            "carrega um escudo gasto",
            "usa braceletes de couro reforçado",
            "mantém um amuleto herdado",
            "carrega uma espada larga",
            "usa um cinturão ornamentado com troféus",
            "porta uma mochila cheia de equipamentos",
            "carrega um velho estandarte tribal"
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
