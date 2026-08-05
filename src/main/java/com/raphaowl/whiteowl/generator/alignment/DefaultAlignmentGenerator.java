package com.raphaowl.whiteowl.generator.alignment;

import com.raphaowl.whiteowl.enums.AlignmentEnum;
import com.raphaowl.whiteowl.enums.BackgroundEnum;
import com.raphaowl.whiteowl.enums.ClassEnum;
import com.raphaowl.whiteowl.enums.RaceEnum;
import com.raphaowl.whiteowl.generator.old.background.BackgroundAlignmentWeights;
import com.raphaowl.whiteowl.generator.old.classes.ClassAlignmentWeights;
import com.raphaowl.whiteowl.generator.util.WeightAccumulator;
import com.raphaowl.whiteowl.generator.util.WeightedRandom;

import org.springframework.stereotype.Service;

@Service
public class DefaultAlignmentGenerator implements AlignmentGenerator {

    @Override
    public AlignmentEnum generate(RaceEnum race, ClassEnum clazz, BackgroundEnum background) {

        WeightAccumulator<AlignmentEnum> accumulator = new WeightAccumulator<>();

        accumulator.add(RaceAlignmentWeights.get(race));
        accumulator.add(ClassAlignmentWeights.get(clazz));
        accumulator.add(BackgroundAlignmentWeights.get(background));

        return WeightedRandom.pick(accumulator.toList());

    }

}
