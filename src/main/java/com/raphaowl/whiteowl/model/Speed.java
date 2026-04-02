package com.raphaowl.whiteowl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Speed(
        String walk,
        String fly,
        String swim,
        String climb,
        String burrow,
        Boolean hover,
        String notes
) {
}
