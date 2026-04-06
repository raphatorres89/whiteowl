package com.raphaowl.whiteowl.model;

import java.util.List;

public record AbilityScoreIncrease(
        List<String> attributes,
        Integer value
) {
}