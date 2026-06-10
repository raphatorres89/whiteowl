package com.raphaowl.whiteowl.enums;

import java.util.Arrays;

import lombok.Getter;

@Getter
public enum BackgroundEnum implements LabeledEnum {
    ACOLYTE("acolyte", "Acólito"),
    ARTISAN("artisan", "Artesão"),
    CHARLATAN("charlatan", "Charlatão"),
    CRIMINAL("criminal", "Criminoso"),
    ENTERTAINER("entertainer", "Artista"),
    EXILE("exile", "Exilado"),
    FARMER("farmer", "Fazendeiro"),
    FOLK_HERO("folk_hero", "Herói do Povo"),
    GAMBLER("gambler", "Apostador"),
    GUILD_MEMBER("guild_member", "Membro de Guilda"),
    HERMIT("hermit", "Eremita"),
    MARAUDER("marauder", "Saqueador"),
    OUTLANDER("outlander", "Forasteiro"),
    SAGE("sage", "Sábio"),
    SAILOR("sailor", "Marinheiro"),
    SCOUNDREL("scoundrel", "Trapaceiro"),
    TRADER("trader", "Comerciante"),
    URCHIN("urchin", "Órfão de Rua");

    private final String slug;
    private final String label;

    BackgroundEnum(String slug, String label) {
        this.slug = slug;
        this.label = label;
    }

    public static BackgroundEnum fromSlug(String slug) {
        return Arrays.stream(values())
                .filter(type -> type.slug.equalsIgnoreCase(slug))
                .findFirst()
                .orElseThrow(() ->
                                     new IllegalArgumentException("Unknown background slug: " + slug));
    }
}