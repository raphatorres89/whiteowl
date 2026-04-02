package com.raphaowl.whiteowl.model;

public record MonsterFilter(
        String name,
        String type,
        Double cr,
        String environment,
        String alignment,
        Boolean legendary
) {
}
