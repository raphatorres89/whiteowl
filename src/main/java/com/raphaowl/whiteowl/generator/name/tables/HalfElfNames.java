package com.raphaowl.whiteowl.generator.name.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.name.RaceNames;

public final class HalfElfNames {
    public static final List<String> MALE_NAMES =
            List.of("Aiden", "Alaric", "Arlen", "Caelan", "Cassian", "Corin", "Darian", "Eamon", "Edric", "Elian", "Evander", "Finnan", "Gareth",
                    "Hadrian", "Kael", "Leoric", "Lucan", "Lorian", "Marek", "Nerian", "Orin", "Rowan", "Rylan", "Soren", "Sylas", "Theron",
                    "Tristan", "Valen", "Varian", "Wystan", "Aeris", "Faelar", "Riordan", "Thalion", "Eldric", "Alric", "Calian", "Toren", "Bren",
                    "Cyran", "Kieran", "Lysander", "Merric", "Orion", "Perrin", "Roderic", "Tavian", "Varyn", "Zephan", "Alen");

    public static final List<String> FEMALE_NAMES =
            List.of("Aelia", "Alina", "Amara", "Aria", "Auriel", "Caelynn", "Celia", "Daphne", "Elara", "Elena", "Elora", "Evelyn", "Fiona",
                    "Illyra", "Ilyana", "Kaela", "Lia", "Liora", "Lyra", "Maris", "Meriel", "Naia", "Nerissa", "Rhiannon", "Rowena", "Sariel",
                    "Selene", "Seraphine", "Sylva", "Thalia", "Valeria", "Valyn", "Vesper", "Ysolda", "Adria", "Brienna", "Cassia", "Daria",
                    "Elaine", "Helena", "Isolde", "Lysandra", "Miriel", "Nadia", "Orla", "Roselyn", "Talia", "Vivian", "Zara", "Ariana");

    public static final List<String> TITLES =
            List.of("O Diplomata", "O Errante", "O Andarilho", "Filho de Dois Mundos", "A Voz da Harmonia", "O Mediador", "Guardião das Fronteiras"
                    , "O Observador", "O Viajante", "O Pacificador", "A Ponte entre Povos", "O Adaptável", "O Sábio", "O Explorador", "O Leal", "O " +
                            "Vigilante", "O Peregrino", "O Sereno", "O Destemido", "O Companheiro");

    public static final List<String> SURNAMES =
            List.of("Ashwood", "Silverbrook", "Moonbrook", "Ravencrest", "Brightwood", "Stormvale", "Oakheart", "Wintermere", "Dawnwhisper",
                    "Nightbreeze", "Greenhill", "Riverwind", "Blackthorn", "Sunmeadow", "Mistvale", "Highgrove", "Emberfield", "Fairwind",
                    "Whiteridge", "Starbrook", "Grayleaf", "Thornfield", "Windrunner", "Rosewood", "Deepvale", "Stonebrook", "Lightfoot",
                    "Ashenvale", "Falconcrest", "Goldenleaf");

    public static final RaceNames DATA = new RaceNames(MALE_NAMES, FEMALE_NAMES, SURNAMES, TITLES);
}
