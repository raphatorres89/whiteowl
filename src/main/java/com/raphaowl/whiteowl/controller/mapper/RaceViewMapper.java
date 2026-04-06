package com.raphaowl.whiteowl.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.raphaowl.whiteowl.controller.view.RaceView;
import com.raphaowl.whiteowl.controller.view.SubraceView;
import com.raphaowl.whiteowl.model.AbilityScoreIncrease;
import com.raphaowl.whiteowl.model.Race;
import com.raphaowl.whiteowl.model.Subrace;
import com.raphaowl.whiteowl.util.AbilityScoreUtils;
import com.raphaowl.whiteowl.util.TextFormatter;
import com.raphaowl.whiteowl.util.TextNormalizer;
import com.raphaowl.whiteowl.util.TextSummaryUtils;

import org.springframework.stereotype.Component;

@Component
public class RaceViewMapper {

    public RaceView toView(Race race) {
        return new RaceView(
                race.name(),
                race.slug(),
                "/images/races/icons/" + race.slug() + ".png",
                "/images/races/characters/" + race.slug() + ".png",
                TextSummaryUtils.summarize(race.desc(), 180),

                format(race.desc()),
                format(race.asiDesc()),
                race.asi(),
                formatAsi(race.asi()),

                format(race.age()),
                format(race.alignment()),
                format(race.size()),
                race.sizeRaw(),

                race.speed(),
                format(race.speedDesc()),

                format(race.languages()),
                format(race.vision()),
                format(race.traits()),

                mapSubraces(race.subraces()),

                race.documentSlug(),
                race.documentTitle(),
                race.documentLicenseUrl(),
                race.documentUrl()
        );
    }

    private List<SubraceView> mapSubraces(List<Subrace> subraces) {
        if (subraces == null) {
            return List.of();
        }

        return subraces.stream()
                .map(this::toView)
                .toList();
    }

    private SubraceView toView(Subrace subrace) {
        return new SubraceView(
                subrace.name(),
                subrace.slug(),
                format(subrace.desc()),
                subrace.documentSlug(),
                subrace.documentTitle(),
                subrace.documentLicenseUrl(),
                subrace.documentUrl()
        );
    }

    private String format(String rawText) {
        return TextFormatter.toHtml(TextNormalizer.normalize(rawText));
    }

    private List<String> formatAsi(List<AbilityScoreIncrease> asi) {
        if (asi == null) {
            return List.of();
        }

        return asi.stream()
                .map(entry -> {
                    String attrs = entry.attributes().stream()
                            .map(AbilityScoreUtils::toPt)
                            .collect(Collectors.joining(", "));

                    String value = entry.value() > 0
                            ? "+" + entry.value()
                            : String.valueOf(entry.value());

                    return attrs + " " + value;
                })
                .toList();
    }
}
