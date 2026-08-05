package com.raphaowl.whiteowl.generator.util;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class WeightedRandom {

    private WeightedRandom() {
    }

    public static <T> T pick(List<? extends Weighted<T>> values) {

        int totalWeight = values.stream().mapToInt(Weighted::weight).sum();
        int random = ThreadLocalRandom.current().nextInt(totalWeight);

        int current = 0;

        for (Weighted<T> value : values) {
            current += value.weight();

            if (random < current) {
                return value.value();
            }
        }

        throw new IllegalStateException("Unable to pick weighted value.");
    }

}
