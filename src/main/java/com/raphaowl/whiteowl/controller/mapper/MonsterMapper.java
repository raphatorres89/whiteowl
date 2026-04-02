package com.raphaowl.whiteowl.controller.mapper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.raphaowl.whiteowl.controller.view.ActionView;
import com.raphaowl.whiteowl.controller.view.MonsterView;
import com.raphaowl.whiteowl.model.Action;
import com.raphaowl.whiteowl.model.Monster;
import com.raphaowl.whiteowl.util.MonsterSkillUtils;
import com.raphaowl.whiteowl.util.TextFormatter;
import com.raphaowl.whiteowl.util.TextNormalizer;

import org.springframework.stereotype.Component;

@Component
public class MonsterMapper {

    public static MonsterView toView(Monster monster) {
        return new MonsterView(
                monster.slug(),
                monster.name(),
                monster.size(),
                monster.type(),
                monster.subtype(),
                monster.group(),
                monster.alignment(),
                monster.imgMain(),
                monster.armorClass(),
                monster.armorDesc(),
                monster.hitPoints(),
                monster.hitDice(),
                monster.cr(),
                monster.speed(),
                monster.strength(),
                monster.dexterity(),
                monster.constitution(),
                monster.intelligence(),
                monster.wisdom(),
                monster.charisma(),
                monster.strengthSave(),
                monster.dexteritySave(),
                monster.constitutionSave(),
                monster.intelligenceSave(),
                monster.wisdomSave(),
                monster.charismaSave(),
                monster.perception(),
                mapSkills(monster.skills()),
                monster.damageVulnerabilities(),
                monster.damageResistances(),
                monster.damageImmunities(),
                monster.conditionImmunities(),
                monster.senses(),
                monster.languages(),
                monster.environments(),
                TextFormatter.toHtml(TextNormalizer.normalize(monster.desc())),
                TextFormatter.toHtml(TextNormalizer.normalize(monster.legendaryDesc())),
                mapActions(monster.actions()),
                mapActions(monster.legendaryActions()),
                mapActions(monster.specialAbilities())
        );
    }

    private static Map<String, Integer> mapSkills(Map<String, Integer> skills) {
        return skills.entrySet().stream()
                .collect(Collectors.toMap((skill) -> MonsterSkillUtils.formatSkill(skill.getKey()), Map.Entry::getValue));
    }

    private static List<ActionView> mapActions(List<Action> actions) {
        if (actions == null) {
            return List.of();
        }

        return actions.stream()
                .map(MonsterMapper::toActionView)
                .toList();
    }

    private static ActionView toActionView(Action action) {
        return new ActionView(
                action.name(),
                TextFormatter.toHtml(TextNormalizer.normalize(action.desc())),
                action.attackBonus(),
                action.damageDice(),
                action.damageBonus()
        );
    }
}
