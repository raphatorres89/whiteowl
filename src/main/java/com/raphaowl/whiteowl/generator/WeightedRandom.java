package com.raphaowl.whiteowl.generator;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class WeightedRandom {

    private WeightedRandom() {
    }

    public static <T extends Weighted> T pick(List<T> values) {
        int totalWeight = values.stream()
                .mapToInt(Weighted::weight)
                .sum();

        int random = ThreadLocalRandom.current()
                .nextInt(totalWeight);

        int current = 0;

        for (T value : values) {

            current += value.weight();

            if (random < current) {
                return value;
            }

        }

        throw new IllegalStateException("Unable to pick weighted value.");
    }
}
