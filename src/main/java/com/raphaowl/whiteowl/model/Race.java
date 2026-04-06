package com.raphaowl.whiteowl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Race(
        String name,
        String slug,
        String desc,

        @JsonProperty("asi_desc")
        String asiDesc,

        List<AbilityScoreIncrease> asi,

        String age,
        String alignment,
        String size,

        @JsonProperty("size_raw")
        String sizeRaw,

        Speed speed,

        @JsonProperty("speed_desc")
        String speedDesc,

        String languages,
        String vision,
        String traits,

        List<Subrace> subraces,

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