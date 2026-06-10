package com.raphaowl.whiteowl.enums;

import java.util.Arrays;

import lombok.Getter;

@Getter
public enum RaceEnum implements LabeledEnum {
    DRAGONBORN("dragonborn", "Draconato"),
    DWARF("dwarf", "Anão"),
    ELF("elf", "Elfo"),
    GNOME("gnome", "Gnomo"),
    HALF_ELF("half-elf", "Meio-Elfo"),
    HALF_ORC("half-orc", "Meio-Orc"),
    HALFLING("halfling", "Halfling"),
    HUMAN("human", "Humano"),
    TIEFLING("tiefling", "Tiefling");

    private final String slug;
    private final String label;

    RaceEnum(String slug, String label) {
        this.slug = slug;
        this.label = label;
    }

    public static RaceEnum fromSlug(String slug) {
        return Arrays.stream(values())
                .filter(race -> race.slug.equalsIgnoreCase(slug))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown race slug: " + slug));
    }
}
