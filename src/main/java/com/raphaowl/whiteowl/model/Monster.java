package com.raphaowl.whiteowl.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Monster (
        String slug,
        String name,
        String size,
        String type,
        String subtype,
        String group,
        String alignment,
        @JsonProperty("img_main")
        String imgMain,
        @JsonProperty("armor_class")
        Integer armorClass,
        @JsonProperty("armor_desc")
        String armorDesc,
        @JsonProperty("hit_points")
        Integer hitPoints,
        @JsonProperty("hit_dice")
        String hitDice,
        Double cr,

        Speed speed,

        Integer strength,
        Integer dexterity,
        Integer constitution,
        Integer intelligence,
        Integer wisdom,
        Integer charisma,

        @JsonProperty("strength_save")
        Integer strengthSave,
        @JsonProperty("dexterity_save")
        Integer dexteritySave,
        @JsonProperty("constitution_save")
        Integer constitutionSave,
        @JsonProperty("intelligence_save")
        Integer intelligenceSave,
        @JsonProperty("wisdom_save")
        Integer wisdomSave,
        @JsonProperty("charisma_save")
        Integer charismaSave,

        Integer perception,
        Map<String, Integer> skills,

        @JsonProperty("damage_vulnerabilities")
        String damageVulnerabilities,
        @JsonProperty("damage_resistances")
        String damageResistances,
        @JsonProperty("damage_immunities")
        String damageImmunities,
        @JsonProperty("condition_immunities")
        String conditionImmunities,

        String senses,
        String languages,

        List<String> environments,
        String desc,
        @JsonProperty("legendary_desc")
        String legendaryDesc,

        List<Action> actions,
        @JsonProperty("legendary_actions")
        List<Action> legendaryActions,
        @JsonProperty("special_abilities")
        List<Action> specialAbilities
) {
}
