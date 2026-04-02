package com.raphaowl.whiteowl.controller.view;

public record ArchetypeView(
        String name,
        String slug,
        String descHtml,
        String documentSlug,
        String documentTitle,
        String documentLicenseUrl,
        String documentUrl
) {
}
