package com.raphaowl.whiteowl.generator.appearance.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.appearance.AppearanceTables;

public final class GnomeTables {
    public static final List<String> BODY_TYPES = List.of(
            "baixo e esguio",
            "pequeno e ágil",
            "compacto",
            "de físico delicado",
            "surpreendentemente robusto",
            "leve e veloz",
            "de baixa estatura",
            "pequeno, mas cheio de energia",
            "de constituição resistente",
            "miúdo e ágil"
    );

    public static final List<String> MOVEMENTS = List.of(
            "move-se com incrível agilidade",
            "caminha com passos rápidos",
            "parece incapaz de ficar parado",
            "gesticula constantemente enquanto fala",
            "move-se com entusiasmo contagiante",
            "observa tudo ao redor com curiosidade",
            "anda com energia inesgotável",
            "mantém movimentos rápidos e precisos",
            "parece sempre procurando algo interessante",
            "transmite entusiasmo em cada movimento"
    );

    public static final List<String> SKIN = List.of(
            "pele clara",
            "pele levemente bronzeada",
            "pele rosada",
            "pele morena clara",
            "pele coberta por pequenas sardas",
            "pele suave",
            "pele marcada por pequenas rugas de expressão",
            "pele de aparência jovem",
            "pele dourada",
            "pele pálida"
    );

    public static final List<String> HAIR = List.of(
            "cabelo castanho",
            "cabelo loiro",
            "cabelo ruivo",
            "cabelo preto",
            "cabelo grisalho",
            "cabelo encaracolado",
            "cabelo liso",
            "cabelo ondulado",
            "cabelo curto e bagunçado",
            "cabelo longo e bem cuidado"
    );

    public static final List<String> EYES = List.of(
            "olhos azuis brilhantes",
            "olhos verdes vivos",
            "olhos castanhos curiosos",
            "olhos violeta",
            "olhos dourados",
            "olhos cinzentos",
            "olhos âmbar",
            "olhos negros atentos",
            "olhos verde-esmeralda",
            "olhos azul-claros"
    );

    public static final List<String> TRAITS = List.of(
            "orelhas levemente pontudas",
            "nariz arredondado",
            "grandes sobrancelhas expressivas",
            "sorriso fácil",
            "olhar extremamente curioso",
            "dedos ágeis",
            "rosto amigável",
            "expressão sempre divertida",
            "bigode cuidadosamente aparado",
            "barba curta bem cuidada"
    );

    public static final List<String> MARKS = List.of(
            "óculos de inventor",
            "manchas de tinta nas mãos",
            "uma pequena cicatriz na testa",
            "algumas sardas",
            "uma tatuagem discreta",
            "ferramentas presas ao cinto",
            "um relógio de bolso ornamentado",
            "uma pequena queimadura causada por experimentos",
            "bolsos cheios de bugigangas",
            "um broche em forma de engrenagem"
    );

    public static final List<String> EXPRESSIONS = List.of(
            "mantém um sorriso contagiante",
            "parece sempre curioso",
            "observa tudo com entusiasmo",
            "fala com enorme empolgação",
            "demonstra grande inteligência",
            "parece constantemente distraído por novas ideias",
            "transmite simpatia",
            "mantém um olhar divertido",
            "parece fascinado por qualquer novidade",
            "sorri mesmo diante do perigo"
    );

    public static final List<String> CLOTHES = List.of(
            "usa roupas coloridas cuidadosamente costuradas",
            "veste um avental de inventor",
            "traja roupas confortáveis de viajante",
            "usa um casaco cheio de bolsos",
            "veste uma túnica ornamentada",
            "traja roupas simples, porém muito bem cuidadas",
            "usa um colete elegante",
            "veste couro leve para facilitar os movimentos",
            "traja roupas repletas de pequenos compartimentos",
            "usa um chapéu excêntrico"
    );

    public static final List<String> ACCESSORIES = List.of(
            "carrega diversas ferramentas de precisão",
            "usa um pequeno monóculo",
            "mantém um diário cheio de anotações",
            "carrega um estranho dispositivo mecânico",
            "usa um colar repleto de pequenas engrenagens",
            "possui uma mochila cheia de invenções",
            "carrega uma lupa ornamentada",
            "mantém um conjunto de ferramentas preso ao cinto",
            "usa um pingente em forma de cogumelo",
            "carrega uma pequena caixa repleta de curiosidades"
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
