package com.raphaowl.whiteowl.controller.view;

import java.util.List;

import com.raphaowl.whiteowl.model.AbilityScoreIncrease;
import com.raphaowl.whiteowl.model.Speed;

public record RaceView(
        String name,
        String slug,
        String iconPath,
        String imagePath,
        String summary,

        String descHtml,
        String asiDescHtml,
        List<AbilityScoreIncrease> asi,
        List<String> asiFormatted,

        String ageHtml,
        String alignmentHtml,
        String sizeHtml,
        String sizeRaw,

        Speed speed,
        String speedDescHtml,

        String languagesHtml,
        String visionHtml,
        String traitsHtml,

        List<SubraceView> subraces,

        String documentSlug,
        String documentTitle,
        String documentLicenseUrl,
        String documentUrl
) {
}
