package com.raphaowl.whiteowl.generator.util;

import java.util.List;
import java.util.Random;

public final class RandomUtils {

    private static final Random RANDOM = new Random();

    private RandomUtils() {
    }

    public static <T> T pick(List<T> values) {
        return values.get(RANDOM.nextInt(values.size()));
    }
}
