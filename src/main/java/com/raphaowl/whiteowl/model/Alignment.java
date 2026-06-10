package com.raphaowl.whiteowl.model;

import java.util.List;

public record Alignment(
        String slug,
        String code,
        String name,
        String description,
        List<String> examples
)
{
}
