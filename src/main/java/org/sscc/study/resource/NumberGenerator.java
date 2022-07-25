package org.sscc.study.resource;

import java.util.Random;

public class NumberGenerator implements GameCondition {
    protected final int THRESHOLD = 4;
    private final Random random = new Random();
    private final int RANDOM_BOUND = 10;

    @Override
    public boolean isMovable() {
        return randomValue() >= THRESHOLD;
    }

    private int randomValue() {
        return random.nextInt(RANDOM_BOUND);
    }
}
