package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class TieflingTables {
    public static final List<String> BODY_TYPES = List.of(
            "alto e esguio",
            "de físico elegante",
            "atlético",
            "esbelto",
            "de postura impecável",
            "de constituição delicada",
            "magro",
            "de aparência refinada",
            "gracioso",
            "de presença intimidadora"
    );

    public static final List<String> MOVEMENTS = List.of(
            "move-se com elegância natural",
            "caminha lentamente observando tudo ao redor",
            "mantém postura confiante",
            "transmite serenidade em seus movimentos",
            "move-se como um predador silencioso",
            "anda com extrema discrição",
            "parece sempre no controle da situação",
            "desliza pelo ambiente com leveza",
            "mantém gestos calculados",
            "move-se com uma confiança quase sobrenatural"
    );

    public static final List<String> SKIN = List.of(
            "pele vermelho-escura",
            "pele vermelho-vinho",
            "pele púrpura",
            "pele azul-acinzentada",
            "pele azul-escura",
            "pele cinza",
            "pele negra de brilho sutil",
            "pele cobre-avermelhada",
            "pele lilás",
            "pele cor de obsidiana"
    );

    public static final List<String> HAIR = List.of(
            "cabelos negros longos",
            "cabelos brancos lisos",
            "cabelos prateados",
            "cabelos vermelho-escuros",
            "cabelos grisalhos",
            "cabelos curtos bem penteados",
            "cabelos presos em uma trança",
            "cabelos ondulados escuros",
            "cabelos longos azulados",
            "cabelos negros presos para trás"
    );

    public static final List<String> EYES = List.of(
            "olhos dourados sem pupilas",
            "olhos completamente negros",
            "olhos vermelho-rubi",
            "olhos âmbar brilhantes",
            "olhos prateados",
            "olhos violeta intensos",
            "olhos azul-elétrico",
            "olhos de brilho escarlate",
            "olhos branco-leitosos",
            "olhos verde-esmeralda luminosos"
    );

    public static final List<String> TRAITS = List.of(
            "chifres longos e curvados para trás",
            "chifres semelhantes aos de um carneiro",
            "pequenos chifres retos",
            "uma longa cauda fina",
            "presas discretamente aparentes",
            "orelhas levemente pontudas",
            "traços faciais extremamente marcantes",
            "voz surpreendentemente suave",
            "um sorriso enigmático",
            "uma presença quase sobrenatural"
    );

    public static final List<String> MARKS = List.of(
            "uma tatuagem arcana no pescoço",
            "cicatrizes antigas nos braços",
            "runas gravadas na pele",
            "um anel negro ornamentado",
            "um colar de obsidiana",
            "piercings nos chifres",
            "uma corrente prateada envolvendo um dos chifres",
            "uma cicatriz atravessando o olho",
            "uma marca de nascimento incomum",
            "um pingente em forma de estrela de oito pontas"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém um sorriso misterioso",
            "parece constantemente analisando as pessoas",
            "transmite confiança absoluta",
            "raramente demonstra emoções",
            "fala com extrema calma",
            "mantém um olhar penetrante",
            "parece esconder inúmeros segredos",
            "transmite charme natural",
            "mantém expressão serena",
            "encara qualquer pessoa sem hesitar"
    );

    public static final List<String> CLOTHES = List.of(
            "usa roupas escuras elegantemente confeccionadas",
            "veste um longo casaco ornamentado",
            "traja uma túnica negra bordada",
            "usa couro fino muito bem trabalhado",
            "veste roupas em tons vinho e preto",
            "traja vestes nobres discretas",
            "usa um manto com capuz",
            "veste roupas adornadas com detalhes dourados",
            "usa um casaco de viagem refinado",
            "traja roupas de excelente qualidade"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega um grimório antigo",
            "usa um medalhão de obsidiana",
            "porta uma adaga ornamentada",
            "mantém diversos anéis de prata",
            "usa braceletes ricamente trabalhados",
            "carrega uma bolsa de couro elegante",
            "usa um cajado entalhado",
            "mantém um frasco de cristal preso ao cinto",
            "carrega um pingente infernal",
            "usa brincos de ouro negro"
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
