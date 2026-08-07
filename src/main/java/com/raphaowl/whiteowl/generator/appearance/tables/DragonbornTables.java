package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class DragonbornTables {
    public static final List<String> BODY_TYPES = List.of(
            "alto e extremamente musculoso",
            "imponente",
            "robusto",
            "de físico poderoso",
            "largo de ombros",
            "atlético e intimidador",
            "corpulento",
            "forte como uma muralha",
            "de postura dominante",
            "massivo"
    );

    public static final List<String> MOVEMENTS = List.of(
            "move-se com passos pesados e confiantes",
            "mantém uma postura imponente",
            "caminha com disciplina militar",
            "transmite autoridade ao caminhar",
            "move-se com surpreendente agilidade para seu tamanho",
            "mantém o peito sempre erguido",
            "demonstra força em cada movimento",
            "parece sempre preparado para o combate",
            "anda como um predador seguro de sua força",
            "move-se com calma e autocontrole"
    );

    public static final List<String> SKIN = List.of(
            "escamas vermelhas brilhantes",
            "escamas douradas",
            "escamas prateadas",
            "escamas negras reluzentes",
            "escamas azuis profundas",
            "escamas verdes escuras",
            "escamas acobreadas",
            "escamas de bronze",
            "escamas brancas",
            "escamas cinzentas"
    );

    public static final List<String> HAIR = List.of(
            "não possui cabelos",
            "não possui pelos aparentes",
            "uma crista óssea percorre o topo da cabeça",
            "pequenos espinhos percorrem a nuca",
            "uma fileira de espinhos ornamenta o pescoço",
            "uma curta crista escamada acompanha a cabeça",
            "espinhos discretos substituem os cabelos",
            "uma crista robusta acompanha o crânio",
            "chifres curtos e espinhosos adornam a cabeça",
            "uma elegante crista dracônica substitui os cabelos"
    );

    public static final List<String> EYES = List.of(
            "olhos dourados",
            "olhos âmbar",
            "olhos vermelhos intensos",
            "olhos azul-elétrico",
            "olhos verdes penetrantes",
            "olhos prateados",
            "olhos negros profundos",
            "olhos cor de cobre",
            "olhos laranja brilhantes",
            "olhos amarelos reptilianos"
    );

    public static final List<String> TRAITS = List.of(
            "grandes chifres curvados",
            "pequenos chifres voltados para trás",
            "mandíbula poderosa",
            "presas discretamente aparentes",
            "cauda longa e musculosa",
            "garras extremamente afiadas",
            "escamas perfeitamente alinhadas",
            "crista óssea pronunciada",
            "voz grave e ressonante",
            "presença naturalmente intimidadora"
    );

    public static final List<String> MARKS = List.of(
            "uma escama rachada sobre o olho",
            "cicatrizes de antigas batalhas",
            "um dos chifres parcialmente quebrado",
            "escamas marcadas pelo fogo",
            "uma antiga tatuagem tribal",
            "garras desgastadas pelo combate",
            "uma cicatriz atravessando o focinho",
            "marcas rituais gravadas nas escamas",
            "uma corrente de bronze presa ao pescoço",
            "um símbolo de clã gravado na armadura"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém uma expressão séria",
            "observa tudo com imponência",
            "transmite honra e disciplina",
            "parece constantemente vigilante",
            "raramente demonstra emoções",
            "encara os outros sem hesitação",
            "demonstra orgulho evidente",
            "fala com autoridade",
            "mantém um olhar firme",
            "transmite confiança absoluta"
    );

    public static final List<String> CLOTHES = List.of(
            "usa uma armadura de placas impecavelmente polida",
            "traja pesadas vestes militares",
            "veste couro reforçado adaptado às suas escamas",
            "usa um manto cerimonial sobre a armadura",
            "traja roupas ornamentadas com símbolos de clã",
            "veste armadura de escamas cuidadosamente trabalhada",
            "usa vestes de viajante resistentes",
            "traja roupas de couro adornadas com metais",
            "usa uma capa presa por um broche dracônico",
            "veste armadura reforçada digna de um campeão"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega uma espada ancestral",
            "usa um medalhão de seu clã",
            "porta um machado de guerra ornamentado",
            "carrega um escudo marcado por inúmeras batalhas",
            "usa braceletes de bronze",
            "possui um colar feito de dentes de dragão",
            "mantém um estandarte dobrado preso à mochila",
            "carrega um martelo de guerra finamente forjado",
            "usa um amuleto representando Bahamut",
            "carrega um antigo troféu de guerra"
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
