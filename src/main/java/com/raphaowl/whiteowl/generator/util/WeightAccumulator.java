package com.raphaowl.whiteowl.generator.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightAccumulator<T> {

    private final Map<T, Integer> weights = new HashMap<>();

    public void add(List<? extends Weighted<T>> values) {

        if (values == null) {
            return;
        }

        for (Weighted<T> value : values) {
            weights.merge(
                    value.value(),
                    value.weight(),
                    Integer::sum
            );
        }

    }

    public List<SimpleWeighted<T>> toList() {

        return weights.entrySet()
                .stream()
                .map(e -> new SimpleWeighted<>(
                        e.getKey(),
                        e.getValue()
                ))
                .toList();
    }

}