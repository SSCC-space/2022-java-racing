package org.sscc.study.resource;

import org.sscc.study.util.Constants;

import java.util.Random;

public class RandomCondition implements GameCondition {
    private final Random random = new Random();

    @Override
    public boolean isMovable() {
        return randomValue() >= Constants.THRESHOLD.value();
    }

    private int randomValue() {
        return random.nextInt(Constants.RANDOM_BOUND.value());
    }
}
