package com.raphaowl.whiteowl.generator.name.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.name.RaceNames;

public final class DwarfNames {
    public static final List<String> MALE_NAMES =
            List.of("Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint",
                    "Gardain", "Harbek", "Kildrak", "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Travok",
                    "Ulfgar", "Veit", "Vondal", "Brom", "Durik", "Kazrik", "Korin", "Balin", "Dwalin", "Fundin", "Gimli", "Kargan", "Thorgar",
                    "Rognar", "Torgrim", "Hargin", "Durgran", "Morin", "Baelor", "Grimnir", "Korgrim", "Borin", "Durgan", "Rurikar", "Thrain");

    public static final List<String> FEMALE_NAMES =
            List.of("Amber", "Artin", "Audhild", "Bardryn", "Diesa", "Eldeth", "Falkrunn", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin",
                    "Kathra", "Kristryd", "Ilde", "Liftrasa", "Riswynn", "Sannl", "Torbera", "Vistra", "Brynja", "Dagny", "Freydis", "Inga", "Runa"
                    , "Sigrid", "Astrid", "Yrsa", "Hilda", "Brenna", "Kara", "Olga", "Thyra", "Eira", "Helga", "Ragnhild", "Gudrun", "Svala", "Alva"
                    , "Birna", "Eydis", "Frida", "Liv", "Solveig", "Torhild", "Ylva", "Brynhild", "Kelda", "Runaa", "Thora");

    public static final List<String> TITLES =
            List.of("Martelo de Ferro", "Barba de Aço", "Guardião da Montanha", "Senhor da Forja", "Escudo do Clã", "Filho das Profundezas",
                    "Mestre Ferreiro", "O Inabalável", "O Resistente", "Quebra-Rochas", "Guardião dos Túneis", "Defensor do Salão", "O Incansável",
                    "Barba Longa", "Mão de Ferro", "O Honrado", "Guardião das Runas", "Escudo de Pedra", "Mestre das Bigornas", "Filho do Martelo");

    public static final List<String> CLAN_NAMES =
            List.of("Ironfist", "Stonehammer", "Deepdelver", "Bronzebeard", "Oakenshield", "Fireforge", "Goldfinder", "Graniteheart", "Strongaxe",
                    "Battlehammer", "Stonebeard", "Ironshield", "Deepstone", "Runehammer", "Steelvein", "Coppervein", "Rockseeker", "Silverpick",
                    "Blackanvil", "Hammerfall");

    public static final RaceNames DATA = new RaceNames(MALE_NAMES, FEMALE_NAMES, CLAN_NAMES, TITLES);
}
