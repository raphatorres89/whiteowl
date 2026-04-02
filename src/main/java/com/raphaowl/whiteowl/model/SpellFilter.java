package com.raphaowl.whiteowl.model;

public record SpellFilter(
        String name,
        Integer level,
        String school,
        Boolean ritual,
        Boolean concentration
) {
}