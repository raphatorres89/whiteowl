package com.raphaowl.whiteowl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Archetype(
        String name,
        String slug,
        String desc,

        @JsonProperty("document__slug")
        String documentSlug,

        @JsonProperty("document__title")
        String documentTitle,

        @JsonProperty("document__license_url")
        String documentLicenseUrl,

        @JsonProperty("document__url")
        String documentUrl
) {
}