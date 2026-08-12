package com.raphaowl.whiteowl.model;

import com.raphaowl.whiteowl.enums.CategoryEnum;

public record ItemCategory(
        String name,
        CategoryEnum key
) {
}
