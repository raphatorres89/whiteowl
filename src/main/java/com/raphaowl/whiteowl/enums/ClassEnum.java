package com.raphaowl.whiteowl.enums;

import lombok.Getter;

@Getter
public enum ClassEnum implements LabeledEnum {
    BARBARIAN("Bárbaro"),
    BARD("Bardo"),
    CLERIC("Clérigo"),
    DRUID("Druida"),
    FIGHTER("Guerreiro"),
    MONK("Monge"),
    PALADIN("Paladino"),
    RANGER("Patrulheiro"),
    ROGUE("Ladino"),
    SORCERER("Feiticeiro"),
    WARLOCK("Bruxo"),
    WIZARD("Mago");

    private final String label;

    ClassEnum(String label) {
        this.label = label;
    }
}
