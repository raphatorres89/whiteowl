package com.raphaowl.whiteowl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CharacterClass(
        String name,
        String slug,
        String desc,

        @JsonProperty("hit_dice")
        String hitDice,

        @JsonProperty("hp_at_1st_level")
        String hpAt1stLevel,

        @JsonProperty("hp_at_higher_levels")
        String hpAtHigherLevels,

        @JsonProperty("prof_armor")
        String profArmor,

        @JsonProperty("prof_weapons")
        String profWeapons,

        @JsonProperty("prof_tools")
        String profTools,

        @JsonProperty("prof_saving_throws")
        String profSavingThrows,

        @JsonProperty("prof_skills")
        String profSkills,

        String equipment,
        String table,

        @JsonProperty("spellcasting_ability")
        String spellcastingAbility,

        @JsonProperty("subtypes_name")
        String subtypesName,

        List<Archetype> archetypes
) {
}