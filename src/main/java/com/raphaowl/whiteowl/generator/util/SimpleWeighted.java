package com.raphaowl.whiteowl.generator.util;

public record SimpleWeighted<T>(
        T value,
        int weight
) implements Weighted<T> {
}
