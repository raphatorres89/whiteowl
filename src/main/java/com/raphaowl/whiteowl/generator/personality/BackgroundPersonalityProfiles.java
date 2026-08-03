package com.raphaowl.whiteowl.generator.personality;

import java.util.Map;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

public final class BackgroundPersonalityProfiles {

    private BackgroundPersonalityProfiles() {
    }

    private static final Map<BackgroundEnum, PersonalityProfile> PROFILES = Map.ofEntries(
            Map.entry(BackgroundEnum.ACOLYTE,
            new PersonalityProfile(
                    PersonalityTables.CALM,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.HONEST,
                    PersonalityTables.SHY,
                    PersonalityTables.RELIGIOUS_HABITS,
                    PersonalityTables.SPIRITUAL_FEARS,
                    PersonalityTables.SERVICE_GOALS
            )),

            Map.entry(BackgroundEnum.ARTISAN,
            new PersonalityProfile(
                    PersonalityTables.DISCIPLINED,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.HONEST,
                    PersonalityTables.PRIDE,
                    PersonalityTables.CRAFT_HABITS,
                    PersonalityTables.COMMON_FEARS,
                    PersonalityTables.HONOR_GOALS

            )),

            Map.entry(BackgroundEnum.CHARLATAN,
            new PersonalityProfile(
                    PersonalityTables.CHARMING,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.CREATIVITY,
                    PersonalityTables.GREED,
                    PersonalityTables.DECEPTION_HABITS,
                    PersonalityTables.COMMON_FEARS,
                    PersonalityTables.WEALTH_GOALS
            )),

            Map.entry(BackgroundEnum.CRIMINAL,
            new PersonalityProfile(
                    PersonalityTables.CAUTIOUS,
                    PersonalityTables.RESERVED,
                    PersonalityTables.CUNNING,
                    PersonalityTables.GREED,
                    PersonalityTables.UNDERWORLD_HABITS,
                    PersonalityTables.COMMON_FEARS,
                    PersonalityTables.WEALTH_GOALS
            )),

            Map.entry(BackgroundEnum.ENTERTAINER,
            new PersonalityProfile(
                    PersonalityTables.CHEERFUL,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.CREATIVITY,
                    PersonalityTables.VANITY,
                    PersonalityTables.ARTISTIC_HABITS,
                    PersonalityTables.REJECTION_FEARS,
                    PersonalityTables.FAME_GOALS
            )),

            Map.entry(BackgroundEnum.EXILE,
            new PersonalityProfile(
                    PersonalityTables.CAUTIOUS,
                    PersonalityTables.RESERVED,
                    PersonalityTables.RESILIENCE,
                    PersonalityTables.DISTRUST,
                    PersonalityTables.SURVIVAL_HABITS,
                    PersonalityTables.REJECTION_FEARS,
                    PersonalityTables.REDEMPTION_GOALS
            )),

            Map.entry(BackgroundEnum.FARMER,
            new PersonalityProfile(
                    PersonalityTables.CALM,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.HARDWORK,
                    PersonalityTables.STUBBORN,
                    PersonalityTables.RURAL_HABITS,
                    PersonalityTables.COMMON_FEARS,
                    PersonalityTables.FAMILY_GOALS
            )),

            Map.entry(BackgroundEnum.FOLK_HERO,
            new PersonalityProfile(
                    PersonalityTables.CONFIDENT,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.COURAGE,
                    PersonalityTables.RECKLESS,
                    PersonalityTables.COMMUNITY_HABITS,
                    PersonalityTables.FAILURE_FEARS,
                    PersonalityTables.PROTECTOR_GOALS
            )),

            Map.entry(BackgroundEnum.GAMBLER,
            new PersonalityProfile(
                    PersonalityTables.IMPULSIVE,
                    PersonalityTables.CHARMING,
                    PersonalityTables.CREATIVITY,
                    PersonalityTables.GREED,
                    PersonalityTables.GAMBLING_HABITS,
                    PersonalityTables.POVERTY_FEARS,
                    PersonalityTables.WEALTH_GOALS
            )),

            Map.entry(BackgroundEnum.GUILD_MEMBER,
            new PersonalityProfile(
                    PersonalityTables.DISCIPLINED,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.HONEST,
                    PersonalityTables.PRIDE,
                    PersonalityTables.CRAFT_HABITS,
                    PersonalityTables.COMMON_FEARS,
                    PersonalityTables.SUCCESS_GOALS
            )),

            Map.entry(BackgroundEnum.HERMIT,
            new PersonalityProfile(
                    PersonalityTables.CALM,
                    PersonalityTables.RESERVED,
                    PersonalityTables.WISDOM,
                    PersonalityTables.SHY,
                    PersonalityTables.MEDITATION_HABITS,
                    PersonalityTables.COMMON_FEARS,
                    PersonalityTables.KNOWLEDGE_GOALS
            )),

            Map.entry(BackgroundEnum.MARAUDER,
            new PersonalityProfile(
                    PersonalityTables.AGGRESSIVE,
                    PersonalityTables.RESERVED,
                    PersonalityTables.COURAGE,
                    PersonalityTables.RECKLESS,
                    PersonalityTables.BATTLE_HABITS,
                    PersonalityTables.DEFEAT_FEARS,
                    PersonalityTables.GLORY_GOALS
            )),

            Map.entry(BackgroundEnum.OUTLANDER,
            new PersonalityProfile(
                    PersonalityTables.INDEPENDENT,
                    PersonalityTables.RESERVED,
                    PersonalityTables.COURAGE,
                    PersonalityTables.STUBBORN,
                    PersonalityTables.NATURE_HABITS,
                    PersonalityTables.NATURE_FEARS,
                    PersonalityTables.EXPLORATION_GOALS
            )),

            Map.entry(BackgroundEnum.SAGE,
            new PersonalityProfile(
                    PersonalityTables.CURIOUS,
                    PersonalityTables.RESERVED,
                    PersonalityTables.WISDOM,
                    PersonalityTables.ABSENT_MINDED,
                    PersonalityTables.STUDY_HABITS,
                    PersonalityTables.KNOWLEDGE_FEARS,
                    PersonalityTables.KNOWLEDGE_GOALS
            )),

            Map.entry(BackgroundEnum.SAILOR,
            new PersonalityProfile(
                    PersonalityTables.DISCIPLINED,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.COURAGE,
                    PersonalityTables.STUBBORN,
                    PersonalityTables.NAVIGATION_HABITS,
                    PersonalityTables.SEA_FEAR,
                    PersonalityTables.HONOR_GOALS
            )),

            Map.entry(BackgroundEnum.SCOUNDREL,
            new PersonalityProfile(
                    PersonalityTables.CAUTIOUS,
                    PersonalityTables.CHARMING,
                    PersonalityTables.CUNNING,
                    PersonalityTables.GREED,
                    PersonalityTables.UNDERWORLD_HABITS,
                    PersonalityTables.CAPTURE_FEARS,
                    PersonalityTables.WEALTH_GOALS
            )),

            Map.entry(BackgroundEnum.TRADER,
            new PersonalityProfile(
                    PersonalityTables.CURIOUS,
                    PersonalityTables.FRIENDLY,
                    PersonalityTables.NEGOTIATION,
                    PersonalityTables.AMBITION,
                    PersonalityTables.TRAVEL_HABITS,
                    PersonalityTables.BANKRUPTCY_FEARS,
                    PersonalityTables.PROSPERITY_GOALS
            )),

            Map.entry(BackgroundEnum.URCHIN,
            new PersonalityProfile(
                    PersonalityTables.INDEPENDENT,
                    PersonalityTables.RESERVED,
                    PersonalityTables.RESILIENCE,
                    PersonalityTables.DISTRUST,
                    PersonalityTables.STREET_HABITS,
                    PersonalityTables.ABANDONMENT_FEARS,
                    PersonalityTables.BELONGING_GOALS
            ))
    );

    public static PersonalityProfile get(BackgroundEnum background) {
        return PROFILES.get(background);
    }

}
