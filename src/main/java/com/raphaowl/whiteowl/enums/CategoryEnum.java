package com.raphaowl.whiteowl.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;

@Getter
public enum CategoryEnum {
    ADVENTURING_GEAR("adventuring-gear", "Equipamentos de Aventura"),
    ARMOR("armor", "Armaduras"),
    TOOLS("tools", "Ferramentas"),
    TRADE_GOOD("trade-good", "Bens Comerciais"),
    WEAPON("weapon", "Armas"),
    VEHICLE("vehicle", "Veículos");

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
