package com.raphaowl.whiteowl.generator.name.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.name.RaceNames;

public final class TieflingNames {
    public static final List<String> MALE_NAMES =
            List.of("Akmenos", "Amnon", "Barakas", "Damakos", "Ekemon", "Iados", "Kairon", "Leucis", "Melech", "Mordai", "Morthos", "Pelaios",
                    "Skamos", "Therai", "Azael", "Belial", "Cassiel", "Dorian", "Erebus", "Kaelos", "Lucien", "Malek", "Nerezza", "Orion", "Raze",
                    "Samael", "Vael", "Zephan", "Azriel", "Varek");

    public static final List<String> FEMALE_NAMES =
            List.of("Akta", "Anakis", "Bryseis", "Criella", "Damaia", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", "Orianna", "Phelaia",
                    "Rieta", "Thera", "Astra", "Lilith", "Nyx", "Selene", "Vesper", "Zafira", "Morrigan", "Seraphine", "Azra", "Bellatrix",
                    "Lyssandra", "Ophelia", "Raven", "Velora", "Xanthe", "Zyrella");

    public static final List<String> SURNAMES =
            List.of("Ashborn", "Blackflame", "Nightshade", "Hellscar", "Duskwalker", "Shadowhorn", "Emberveil", "Darkwhisper", "Bloodmoon",
                    "Infernis", "Soulfire", "Grimveil", "Stormscar", "Voidwalker", "Ashen", "Crowley", "Nightbloom", "Dreadmoor", "Ebonheart",
                    "Flameborn");

    public static final List<String> TITLES =
            List.of("O Portador da Chama", "A Filha das Sombras", "O Diabo de Sorriso Gentil", "O Colecionador de Segredos", "O Arauto do " +
                    "Crepúsculo", "A Voz do Abismo", "O Caminhante da Penumbra", "O Olhar Escarlate", "A Chama Silenciosa", "O Guardião dos Pactos"
                    , "A Rosa Negra", "O Senhor das Cinzas", "A Dama Rubra", "O Filho do Crepúsculo", "A Portadora do Destino", "O Vigia da Noite",
                    "A Tecelã das Sombras", "O Último Herege", "A Guardiã dos Segredos", "O Sussurro Infernal");

    public static final RaceNames DATA = new RaceNames(MALE_NAMES, FEMALE_NAMES, SURNAMES, TITLES);

}
