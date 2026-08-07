package com.raphaowl.whiteowl.generator.name.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.name.RaceNames;

public final class ElfNames {

    private ElfNames() {
    }

    public static final List<String> MALE_NAMES =
            List.of("Aelar", "Aelrindel", "Aerendil", "Aeris", "Alarion", "Althor", "Anarion", "Aramil", "Arannis", "Aravel", "Ardan", "Arlen",
                    "Aust", "Belanor", "Beluar", "Caelion", "Carric", "Daeron", "Dayereth", "Eldrin", "Elarion", "Elros", "Eltharion", "Enialis",
                    "Erevan", "Faelar", "Faeranduil", "Fenian", "Fivin", "Galador", "Galather", "Haemir", "Iafalior", "Immeral", "Ivellios",
                    "Laucian", "Laurelin", "Leandor", "Lhoris", "Mythanar", "Naeris", "Nym", "Orist", "Phaendar", "Riardon", "Soveliss", "Theren",
                    "Thamior", "Varis", "Zaos");

    public static final List<String> FEMALE_NAMES =
            List.of("Adrie", "Aelene", "Aeris", "Alaisa", "Althaea", "Amakiir", "Anastrianna", "Aranel", "Ariawyn", "Aryllan", "Ashryn", "Ayla",
                    "Belmara", "Caelynn", "Celebrian", "Daenala", "Dara", "Drusilia", "Eilistra", "Elaith", "Elanil", "Elora", "Elyra", "Enna",
                    "Faelivrin", "Faelyn", "Felosial", "Gaelira", "Holone", "Ielenia", "Illyria", "Ilyana", "Ithilwen", "Keyleth", "Laerdya",
                    "Laurelin", "Leshanna", "Lia", "Lirael", "Meriele", "Myriil", "Naivara", "Nuala", "Quelenna", "Sariel", "Shava", "Sylvara",
                    "Thia", "Valanthe", "Xyrra");

    public static final List<String> TITLES =
            List.of("Andarilho das Florestas", "Guardião das Árvores Antigas", "Vigia do Bosque", "Caçador Silencioso", "Arqueiro da Lua",
                    "Filho " + "das Estrelas", "Portador da Aurora", "Sábio dos Rios", "Protetor dos Bosques", "Cantor das Folhas", "Senhor dos " +
                            "Cervos", "Sentinela da Fronteira", "Peregrino Élfico", "Mestre dos Ventos", "Observador das Constelações", "Defensor " +
                            "da Natureza", "Caminhante da Névoa", "Guardião dos Antigos Segredos", "Herdeiro da Corte Élfica", "Imortal Errante");

    public static final List<String> SURNAMES =
            List.of("Ashwood", "Silverbrook", "Moonbrook", "Ravencrest", "Brightwood", "Stormvale", "Oakheart", "Wintermere", "Dawnwhisper",
                    "Nightbreeze", "Greenhill", "Riverwind", "Blackthorn", "Sunmeadow", "Mistvale", "Highgrove", "Emberfield", "Fairwind",
                    "Whiteridge", "Starbrook", "Grayleaf", "Thornfield", "Windrunner", "Rosewood", "Deepvale", "Stonebrook", "Lightfoot",
                    "Ashenvale", "Falconcrest", "Goldenleaf");

    public static final RaceNames DATA = new RaceNames(MALE_NAMES, FEMALE_NAMES, SURNAMES, TITLES);
}
