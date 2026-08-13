package com.raphaowl.whiteowl.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;

@Getter
public enum CategoryEnum {
    ADVENTURING_GEAR("adventuring-gear", "Equipamento de Aventura"),
    AMMUNITION("ammunition", "Munição"),
    ARMOR("armor", "Armadura"),
    DRAWN_VEHICLE("drawn-vehicle", "Veículo Puxado"),
    POISON("poison", "Veneno"),
    RING("ring", "Anel"),
    ROD("rod", "Cajado"),
    STAFF("staff", "Vara"),
    TOOLS("tools", "Ferramentas"),
    TRADE_GOOD("trade-good", "Bem Comercial"),
    WAND("wand", "Varinha"),
    WATERBORNE_VEHICLE("waterborne-vehicle", "Veículo Aquático"),
    WEAPON("weapon", "Arma"),
    LAND_VEHICLE("land-vehicle", "Veículo Terrestre");

    private final String key;
    private final String label;

    CategoryEnum(String key, String label) {
        this.key = key;
        this.label = label;
    }

    @JsonValue
    public String jsonValue() {
        return key;
    }

    @JsonCreator
    public static CategoryEnum fromValue(String value) {
        return Arrays.stream(values())
                .filter(type -> type.key.equalsIgnoreCase(value) || type.name().equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown category value: " + value));
    }

    public static CategoryEnum fromKey(String key) {
        return Arrays.stream(values())
                .filter(type -> type.key.equalsIgnoreCase(key))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown category key: " + key));
    }

}
