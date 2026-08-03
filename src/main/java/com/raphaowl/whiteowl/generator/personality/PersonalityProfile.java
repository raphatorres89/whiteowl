package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

public record PersonalityProfile(
        List<String> temperaments,
        List<String> socialBehaviors,
        List<String> virtues,
        List<String> flaws,
        List<String> habits,
        List<String> fears,
        List<String> goals
) {
}
