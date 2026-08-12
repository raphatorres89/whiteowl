package com.raphaowl.whiteowl.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SizeEnum {
    TINY,
    SMALL,
    MEDIUM,
    LARGE,
    HUGE,
    GARGANTUAN;

    @JsonValue
    public String jsonValue() {
        return name().toLowerCase();
    }

    @JsonCreator
    public static SizeEnum fromValue(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Size value cannot be null");
        }

        return SizeEnum.valueOf(value.trim().toUpperCase().replace("-", "_"));
    }
}
