package com.raphaowl.whiteowl.controller.mapper;

import java.util.List;

import com.raphaowl.whiteowl.controller.view.ArchetypeView;
import com.raphaowl.whiteowl.controller.view.CharacterClassSummaryView;
import com.raphaowl.whiteowl.controller.view.CharacterClassView;
import com.raphaowl.whiteowl.model.Archetype;
import com.raphaowl.whiteowl.model.CharacterClass;
import com.raphaowl.whiteowl.util.MarkdownTableFormatter;
import com.raphaowl.whiteowl.util.TextFormatter;
import com.raphaowl.whiteowl.util.TextNormalizer;
import com.raphaowl.whiteowl.util.TextSummaryUtils;

import org.springframework.stereotype.Component;

@Component
public class CharacterClassMapper {

    public CharacterClassView toView(CharacterClass characterClass) {
        return new CharacterClassView(
                characterClass.name(),
                characterClass.slug(),
                format(characterClass.desc()),
                characterClass.hitDice(),
                characterClass.hpAt1stLevel(),
                characterClass.hpAtHigherLevels(),
                characterClass.profArmor(),
                characterClass.profWeapons(),
                characterClass.profTools(),
                characterClass.profSavingThrows(),
                characterClass.profSkills(),
                format(characterClass.equipment()),
                MarkdownTableFormatter.toHtml(characterClass.table()),
                characterClass.spellcastingAbility(),
                characterClass.subtypesName(),
                mapArchetypes(characterClass.archetypes())
        );
    }

    public CharacterClassSummaryView toSummaryView(CharacterClass characterClass) {
        return new CharacterClassSummaryView(
                characterClass.name(),
                characterClass.slug(),
                TextSummaryUtils.summarize(characterClass.desc(), 180),
                characterClass.hitDice(),
                characterClass.profSavingThrows(),
                characterClass.spellcastingAbility(),
                characterClass.subtypesName()
        );
    }

    private List<ArchetypeView> mapArchetypes(List<Archetype> archetypes) {
        if (archetypes == null) {
            return List.of();
        }

        return archetypes.stream()
                .map(this::toView)
                .toList();
    }

    private ArchetypeView toView(Archetype archetype) {
        return new ArchetypeView(
                archetype.name(),
                archetype.slug(),
                format(archetype.desc()),
                archetype.documentSlug(),
                archetype.documentTitle(),
                archetype.documentLicenseUrl(),
                archetype.documentUrl()
        );
    }

    private String format(String rawText) {
        return TextFormatter.toHtml(TextNormalizer.normalize(rawText));
    }
}