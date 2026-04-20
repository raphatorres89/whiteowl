package com.raphaowl.whiteowl.controller.mapper;

import com.raphaowl.whiteowl.controller.view.SpellView;
import com.raphaowl.whiteowl.model.Spell;
import com.raphaowl.whiteowl.util.TextFormatter;
import com.raphaowl.whiteowl.util.TextNormalizer;

import org.springframework.stereotype.Component;

@Component
public class SpellMapper {

    public static SpellView toView(Spell spell) {
        return new SpellView(
                spell.slug(),
                spell.name(),
                TextFormatter.toHtml(TextNormalizer.normalize(spell.desc())),
                TextFormatter.toHtml(TextNormalizer.normalize(spell.higherLevel())),
                spell.page(),
                spell.range(),
                spell.targetRangeSort(),
                spell.components(),
                spell.requiresVerbalComponents(),
                spell.requiresSomaticComponents(),
                spell.requiresMaterialComponents(),
                spell.material(),
                spell.canBeCastAsRitual(),
                spell.ritual(),
                spell.duration(),
                spell.concentration(),
                spell.requiresConcentration(),
                spell.castingTime(),
                spell.level(),
                spell.levelInt(),
                spell.spellLevel(),
                spell.school(),
                spell.dndClass(),
                spell.spellLists(),
                spell.archetype(),
                spell.circles());
    }
}
