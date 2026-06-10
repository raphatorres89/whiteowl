package com.raphaowl.whiteowl.util;

import java.util.Arrays;
import java.util.Random;

import com.raphaowl.whiteowl.enums.LabeledEnum;

public final class EnumUtils {

    private static final Random RANDOM = new Random();

    private EnumUtils() {
    }

    public static <T extends Enum<T>> T pick(T value, Class<T> enumClass) {
        return value != null ? value : random(enumClass);
    }

    public static <T extends Enum<T>> T random(Class<T> enumClass) {
        T[] values = enumClass.getEnumConstants();

        return values[RANDOM.nextInt(values.length)];
    }

    public static <T extends Enum<T> & LabeledEnum> T fromLabel(String label, Class<T> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants()).filter(value -> value.getLabel().equalsIgnoreCase(label)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown label '%s' for enum %s".formatted(label, enumClass.getSimpleName())));
    }
}
