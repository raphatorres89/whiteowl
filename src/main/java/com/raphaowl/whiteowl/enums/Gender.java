package com.raphaowl.whiteowl.enums;

import lombok.Getter;

@Getter
public enum Gender implements LabeledEnum {
    MALE("Masculino"),
    FEMALE("Feminino");

    private final String label;

    Gender(String label) {
        this.label = label;
    }
}
