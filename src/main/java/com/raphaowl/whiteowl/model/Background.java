package com.raphaowl.whiteowl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Background (
        String name,
        String desc,
        String slug,
        @JsonProperty("skill_proficiencies")
        String skillProficiencies,
        @JsonProperty("tool_proficiencies")
        String toolProficiencies,
        String languages,
        String equipment,
        String feature,
        @JsonProperty("feature_desc")
        String featureDesc,
        @JsonProperty("suggested_characteristics")
        String suggestedCharacteristics,
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
