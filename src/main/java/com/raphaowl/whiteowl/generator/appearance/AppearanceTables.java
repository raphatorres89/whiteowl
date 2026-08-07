package com.raphaowl.whiteowl.generator.appearance;

import java.util.List;

public record AppearanceTables(
        List<String> bodyTypes,
        List<String> movements,
        List<String> skin,
        List<String> hair,
        List<String> eyes,
        List<String> traits,
        List<String> marks,
        List<String> expressions,
        List<String> clothes,
        List<String> accessories
) {}
