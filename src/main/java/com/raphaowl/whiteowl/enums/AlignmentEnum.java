package com.raphaowl.whiteowl.enums;

import lombok.Getter;

@Getter
public enum AlignmentEnum implements LabeledEnum {
    LAWFUL_GOOD("Leal e Bom"),
    NEUTRAL_GOOD("Neutro e Bom"),
    CHAOTIC_GOOD("Caótico e Bom"),
    LAWFUL_NEUTRAL("Leal e Neutro"),
    TRUE_NEUTRAL("Neutro"),
    CHAOTIC_NEUTRAL("Caótico e Neutro"),
    LAWFUL_EVIL("Leal e Mau"),
    NEUTRAL_EVIL("Neutro e Mau"),
    CHAOTIC_EVIL("Caótico e Mau");

    private final String label;

    AlignmentEnum(String label) {
        this.label = label;
    }
}
