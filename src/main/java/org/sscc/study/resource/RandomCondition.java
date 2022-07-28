package org.sscc.study.resource;

import java.util.Random;

public class RandomCondition implements GameCondition {
    private final static int THRESHOLD = 4;
    private final static int RANDOM_BOUND = 10;
    private final Random random = new Random();

    @Override
    public boolean isMovable() {
        return randomValue() >= THRESHOLD;
    }

    private int randomValue() {
        return random.nextInt(RANDOM_BOUND);
    }
}
