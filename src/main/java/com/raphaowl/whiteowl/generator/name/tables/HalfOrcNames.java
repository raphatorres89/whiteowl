package com.raphaowl.whiteowl.generator.name.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.name.RaceNames;

public final class HalfOrcNames {
    public static final List<String> MALE_NAMES =
            List.of("Dench", "Feng", "Gell", "Henk", "Holg", "Imsh", "Keth", "Krusk", "Mhurren", "Ront", "Shump", "Thokk", "Brug", "Drog", "Gor",
                    "Karg", "Morg", "Rugor", "Thar", "Vor", "Drak", "Grom", "Korag", "Nazg", "Orgul", "Rogar", "Tagh", "Urgash", "Varok", "Zug",
                    "Brog", "Durn", "Grash", "Harg", "Kor", "Murg", "Narg", "Ruk", "Thorg", "Urg", "Varg", "Wurg", "Yarg", "Zarg", "Brakka",
                    "Drogan", "Gorash", "Morkar", "Ragor", "Thurg");

    public static final List<String> FEMALE_NAMES =
            List.of("Baggi", "Emen", "Engong", "Kansif", "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Sutha", "Vola", "Volen", "Yevelda", "Grisha"
                    , "Brakka", "Thura", "Gorga", "Korga", "Marga", "Roga", "Shara", "Urga", "Vasha", "Yarga", "Zura", "Drakka", "Morgha", "Khorga"
                    , "Rukka", "Vorgha", "Torga", "Norga", "Harga", "Borga", "Grakka", "Orga", "Thorga", "Vorga", "Kragga", "Murka", "Dorga",
                    "Sharga", "Ursha", "Varsha", "Zhura", "Khara", "Rusha", "Targa", "Vorra", "Grura");

    public static final List<String> SURNAMES =
            List.of("Ironhide", "Stonefist", "Wolfscar", "Bloodaxe", "Grimjaw", "Stormbreaker", "Blacktusk", "Ashbreaker", "Rageborn", "Darkblade",
                    "Steelarm", "Oakcrusher", "Strongheart", "Redfang", "Skullbreaker", "Hammerfall", "Greywolf", "Fireblood", "Stoneborn",
                    "Ironmaw");

    public static final List<String> TITLES =
            List.of("O Inquebrável", "Punho de Ferro", "O Sobrevivente", "Filho da Tempestade", "Quebra-Escudos", "O Incansável", "O Indomável", "O" +
                    " Protetor", "Sangue Forte", "O Guerreiro Cinzento", "Guardião da Tribo", "O Destemido", "O Resistente", "Martelo de Guerra",
                    "O Silencioso", "O Implacável", "Caçador das Planícies", "O Honrado", "Lobo Solitário", "O Último em Pé");

    public static final RaceNames DATA = new RaceNames(MALE_NAMES, FEMALE_NAMES, SURNAMES, TITLES);
}
