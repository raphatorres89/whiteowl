package com.raphaowl.whiteowl.controller.mapper;

import org.springframework.stereotype.Component;

import com.raphaowl.whiteowl.model.Background;
import com.raphaowl.whiteowl.util.TextFormatter;
import com.raphaowl.whiteowl.util.TextNormalizer;
import com.raphaowl.whiteowl.util.TextSummaryUtils;
import com.raphaowl.whiteowl.controller.view.BackgroundView;

@Component
public class BackgroundMapper {

    public BackgroundView toView(Background background) {
        return new BackgroundView(
                background.name(),
                background.slug(),
                "/images/backgrounds/" + background.slug() + ".png",
                "/images/backgrounds/characters/" + background.slug() + ".png",
                TextSummaryUtils.summarize(background.desc(), 180),

                format(background.desc()),
                background.skillProficiencies(),
                background.toolProficiencies(),
                background.languages(),
                background.equipment(),
                background.feature(),
                format(background.featureDesc()),
                format(background.suggestedCharacteristics()),

                background.documentSlug(),
                background.documentTitle(),
                background.documentLicenseUrl(),
                background.documentUrl()
        );
    }

    private String format(String rawText) {
        return TextFormatter.toHtml(TextNormalizer.normalize(rawText));
    }
}
