package com.raphaowl.whiteowl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Property(
        String name,
        String type,
        @JsonProperty("desc")
        String description
) {
}
