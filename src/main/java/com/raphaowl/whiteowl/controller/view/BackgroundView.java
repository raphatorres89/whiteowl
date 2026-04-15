package com.raphaowl.whiteowl.controller.view;

public record BackgroundView(
        String name,
        String slug,
        String iconPath,
        String imagePath,
        String summary,

        String descHtml,
        String skillProficiencies,
        String toolProficiencies,
        String languages,
        String equipment,
        String feature,
        String featureDescHtml,
        String suggestedCharacteristicsHtml,

        String documentSlug,
        String documentTitle,
        String documentLicenseUrl,
        String documentUrl
) {
}
