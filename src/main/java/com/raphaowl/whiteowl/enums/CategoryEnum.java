package com.raphaowl.whiteowl.enums;

import lombok.Getter;

@Getter
public enum CategoryEnum {
    ADVENTURING_GEAR("Equipamento de Aventura"),
    AMMUNITION("Munição"),
    ARMOR("Armadura"),
    DRAWN_VEHICLE("Veículo Puxado"),
    POISON("Veneno"),
    RING("Anel"),
    ROD("Cajado"),
    SHIELD("Escudo"),
    TOOLS("Ferramentas"),
    TRADE_GOOD("Bem Comercial"),
    WAND("Varinha"),
    WATERBORNE_VEHICLE("Veículo Aquático"),
    WEAPON("Arma"),
    LAND_VEHICLE("Veículo Terrestre");

    private final String label;

    CategoryEnum(String label) {
        this.label = label;
    }

    public String slug() {
        return name().toLowerCase().replace("_", "-");
    }

}
