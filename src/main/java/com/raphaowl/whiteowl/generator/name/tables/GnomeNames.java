package com.raphaowl.whiteowl.generator.name.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.name.RaceNames;

public final class GnomeNames {

    public static final List<String> MALE_NAMES =
            List.of("Alston", "Alvyn", "Boddynock", "Brocc", "Burgell", "Dimble", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo", "Gimble", "Glim",
                    "Jebeddo", "Kellen", "Namfoodle", "Orryn", "Roondar", "Seebo", "Sindri", "Warryn", "Wrenn", "Zook", "Fizzwick", "Nib", "Tobin",
                    "Perrin", "Dabble", "Fizz", "Nackle", "Bimble", "Rimple", "Whizzle", "Tinker", "Marn", "Pindle", "Gizzle", "Norin", "Fizzle",
                    "Wobble", "Kobble", "Tillo", "Dorin", "Nibbin", "Rumble", "Pock", "Zindle", "Bramble", "Mizzle", "Twick");

    public static final List<String> FEMALE_NAMES =
            List.of("Bimpnottin", "Breena", "Caramip", "Carlin", "Donella", "Duvamil", "Ella", "Ellyjoybell", "Lilli", "Loopmottin", "Lorilla",
                    "Mardnab", "Nissa", "Nyx", "Oda", "Orla", "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna", "Poppy", "Willow", "Mira", "Nixie",
                    "Tilly", "Brina", "Pippa", "Merry", "Fina", "Bell", "Daisy", "Luna", "Rosie", "Mina", "Vivi", "Kiri", "Nori", "Twila", "Hazel",
                    "Tessa", "Bree", "Molly", "Winnie", "Clover", "Faye", "Junia", "Luma", "Nella", "Penny");

    public static final List<String> TITLES =
            List.of("O Inventor", "A Mente Brilhante", "O Engenhoso", "O Curioso", "Mestre das Engrenagens", "O Alquimista", "Guardião dos " +
                    "Segredos", "O Explorador", "Colecionador de Maravilhas", "O Incansável", "Construtor de Maravilhas", "O Astuto", "O " +
                    "Improvisador", "Mestre das Bugigangas", "O Sonhador", "O Experimentador", "O Inovador", "O Excêntrico", "O Pequeno Gênio", "O " +
                    "Descobridor");

    public static final List<String> SURNAMES =
            List.of("Cogspinner", "Geargrin", "Copperpot", "Brightspark", "Tinkertop", "Quickfingers", "Nackle", "Murnig", "Folkor", "Cobblewhistle");

    public static final RaceNames DATA = new RaceNames(MALE_NAMES, FEMALE_NAMES, SURNAMES, TITLES);
}
