package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class HalflingTables {
    public static final List<String> BODY_TYPES = List.of(
            "baixo e rechonchudo",
            "pequeno e ágil",
            "de físico compacto",
            "leve e veloz",
            "de constituição robusta",
            "pequeno, mas vigoroso",
            "de aparência simpática",
            "esbelto para um halfling",
            "bem proporcionado",
            "de porte modesto"
    );

    public static final List<String> MOVEMENTS = List.of(
            "move-se com passos leves",
            "caminha com alegria contagiante",
            "transmite tranquilidade ao andar",
            "move-se com surpreendente agilidade",
            "parece sempre confortável onde está",
            "anda assobiando baixinho",
            "gesticula bastante enquanto conversa",
            "move-se discretamente entre as pessoas",
            "caminha com confiança despreocupada",
            "parece sempre curioso sobre o ambiente"
    );

    public static final List<String> SKIN = List.of(
            "pele clara",
            "pele bronzeada",
            "pele morena clara",
            "pele dourada",
            "pele rosada",
            "pele coberta por sardas",
            "pele suave",
            "pele levemente queimada de sol",
            "pele saudável",
            "pele de aparência jovial"
    );

    public static final List<String> HAIR = List.of(
            "cabelos castanhos cacheados",
            "cabelos loiros ondulados",
            "cabelos ruivos encaracolados",
            "cabelos negros curtos",
            "cabelos grisalhos bem penteados",
            "cabelos castanhos desgrenhados",
            "cabelos longos presos para trás",
            "cabelos dourados cacheados",
            "cabelos castanhos claros",
            "cabelos volumosos e encaracolados"
    );

    public static final List<String> EYES = List.of(
            "olhos castanhos calorosos",
            "olhos verdes brilhantes",
            "olhos azul-claros",
            "olhos cor de mel",
            "olhos âmbar",
            "olhos negros curiosos",
            "olhos cinzentos",
            "olhos azul-profundo",
            "olhos verde-musgo",
            "olhos vivos e expressivos"
    );

    public static final List<String> TRAITS = List.of(
            "bochechas arredondadas",
            "sorriso acolhedor",
            "rosto amigável",
            "orelhas discretamente pontudas",
            "mãos pequenas e habilidosas",
            "pés largos característicos",
            "nariz pequeno",
            "olhar sempre curioso",
            "voz alegre",
            "expressão simpática"
    );

    public static final List<String> MARKS = List.of(
            "algumas sardas no rosto",
            "um cachimbo preso ao cinto",
            "um chapéu gasto de viajante",
            "uma pequena cicatriz no joelho",
            "uma pulseira feita à mão",
            "um lenço colorido no pescoço",
            "um broche de trevo",
            "uma mochila muito bem organizada",
            "um colar simples de madeira",
            "uma pequena tatuagem da família"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém um sorriso constante",
            "transmite simpatia imediata",
            "parece sempre bem-humorado",
            "observa tudo com curiosidade",
            "fala com entusiasmo",
            "ri com facilidade",
            "parece sempre relaxado",
            "demonstra grande gentileza",
            "transmite enorme confiança",
            "parece encontrar alegria nas pequenas coisas"
    );

    public static final List<String> CLOTHES = List.of(
            "usa roupas simples e confortáveis",
            "veste um colete muito bem costurado",
            "traja roupas coloridas",
            "usa uma capa leve de viajante",
            "veste tecidos macios e resistentes",
            "usa roupas cuidadosamente remendadas",
            "traja uma túnica confortável",
            "veste couro leve",
            "usa roupas típicas do interior",
            "traja vestes práticas para longas caminhadas"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega uma panela de viagem",
            "mantém um cachimbo de madeira",
            "usa um colar de trevos",
            "carrega uma mochila cheia de provisões",
            "possui uma pequena flauta",
            "leva um livro de receitas",
            "carrega um estilingue cuidadosamente feito",
            "usa um relógio de bolso",
            "mantém um cantil ornamentado",
            "carrega uma cesta repleta de pequenas utilidades"
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
