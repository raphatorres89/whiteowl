package com.raphaowl.whiteowl.generator.alignment;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.model.AlignmentWeight;

import org.springframework.stereotype.Component;

@Component
public class AlignmentGenerator {

    public AlignmentEnum generate(List<AlignmentWeight> weights) {
        int totalWeight = weights.stream()
                .mapToInt(AlignmentWeight::weight)
                .sum();


        int random = ThreadLocalRandom.current().nextInt(totalWeight);

        int current = 0;

        for (AlignmentWeight weight : weights) {

            current += weight.weight();

            if (random < current) {
                return weight.alignment();
            }
        }

        return AlignmentEnum.TRUE_NEUTRAL;
    }
}
