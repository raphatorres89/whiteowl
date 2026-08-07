package com.raphaowl.whiteowl.generator.name.tables;

import java.util.List;

import com.raphaowl.whiteowl.generator.name.RaceNames;

public class HalflingNames {
    public static final List<String> MALE_NAMES =
            List.of("Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich", "Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn",
                    "Perrin", "Reed", "Roscoe", "Wellby", "Tobin", "Wilcome", "Bingo", "Fosco", "Drogo", "Samwise", "Hamson", "Hob", "Pip", "Robin"
                    , "Jory", "Ned", "Tomlin", "Bram", "Edric", "Harry", "Jasper", "Odo", "Rollo", "Silas", "Theo", "Ulric", "Waldo", "Bennet",
                    "Coby", "Derry", "Emmett", "Felix", "Gavin", "Harlan", "Jonas", "Micah", "Rowan");

    public static final List<String> FEMALE_NAMES =
            List.of("Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia",
                    "Seraphina", "Shaena", "Trym", "Vani", "Verna", "Willow", "Ruby", "Poppy", "Rosie", "Mabel", "Hazel", "Millie", "Daisy", "Elsie"
                    , "Faye", "Greta", "Holly", "Ivy", "June", "Lucy", "Maisie", "Nora", "Olive", "Pearl", "Sally", "Tessa", "Violet", "Winnie",
                    "Bella", "Clara", "Edith", "Flora", "Grace", "Hanna", "Iris", "Lily", "Molly");

    public static final List<String> SURNAMES =
            List.of("Brushgather", "Goodbarrel", "Greenbottle", "Hilltopple", "Highhill", "Leagallow", "Tealeaf", "Thorngage", "Underbough",
                    "Appleblossom", "Brandybuck", "Cotton", "Gardner", "Hayward", "Meadowfoot", "Oakbottom", "Proudfoot", "Softstep", "Warmbread",
                    "Willowbrook");

    public static final List<String> TITLES =
            List.of("O Bom Vizinho", "Dos Pés Ligeiros", "O Contador de Histórias", "Amigo de Todos", "O Andarilho", "Mestre dos Banquetes", "O " +
                    "Pequeno Destemido", "Guardião da Colina", "O Viajante Alegre", "O Cozinheiro", "O Aventureiro", "O Curioso", "O Sortudo", "O " +
                    "Gentil", "O Hospitaleiro", "O Explorador", "O Colecionador", "O Cantador", "O Otimista", "Filho do Vale");

    public static final RaceNames DATA = new RaceNames(MALE_NAMES, FEMALE_NAMES, SURNAMES, TITLES);
}
