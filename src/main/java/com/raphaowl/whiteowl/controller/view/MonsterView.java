package com.raphaowl.whiteowl.controller.view;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.raphaowl.whiteowl.model.Action;
import com.raphaowl.whiteowl.model.Speed;

public record MonsterView(
        String slug,
        String name,
        String size,
        String type,
        String subtype,
        String group,
        String alignment,
        String imgMain,
        Integer armorClass,
        String armorDesc,
        Integer hitPoints,
        String hitDice,
        Double cr,

        Speed speed,

        Integer strength,
        Integer dexterity,
        Integer constitution,
        Integer intelligence,
        Integer wisdom,
        Integer charisma,

        Integer strengthSave,
        Integer dexteritySave,
        Integer constitutionSave,
        Integer intelligenceSave,
        Integer wisdomSave,
        Integer charismaSave,

        Integer perception,
        Map<String, Integer> skills,

        String damageVulnerabilities,
        String damageResistances,
        String damageImmunities,
        String conditionImmunities,

        String senses,
        String languages,

        List<String> environments,
        String desc,
        String legendaryDesc,

        List<ActionView> actions,
        List<ActionView> legendaryActions,
        List<ActionView> specialAbilities
) {
}
