package org.sscc.study.racingwithname;

import java.util.Random;

public class RandomMove implements MoveStrategy {
    private static final int MAX_BOUND = 9;
    private static final int MOVABLE_MIN = 4;
    private final Random random = new Random();

    @Override
    public boolean isMoveAble() {
        return random.nextInt(MAX_BOUND) >= MOVABLE_MIN;
    }
}