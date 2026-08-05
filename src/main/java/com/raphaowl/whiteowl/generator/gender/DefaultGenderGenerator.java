package com.raphaowl.whiteowl.generator.gender;

import com.raphaowl.whiteowl.enums.Gender;
import com.raphaowl.whiteowl.util.EnumUtils;

import org.springframework.stereotype.Service;

@Service
public class DefaultGenderGenerator implements GenderGenerator {

    @Override
    public Gender generate(Gender filter) {

        if (filter != null) {
            return filter;
        }

        return EnumUtils.random(Gender.class);

    }

}
