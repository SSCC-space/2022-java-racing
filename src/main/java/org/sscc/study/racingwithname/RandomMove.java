package org.sscc.study.racingwithname;

import java.util.Random;

public class RandomMove implements MoveStrategy {
    private final Random random = new Random();

    @Override
    public boolean isMoveAble() {
        return random.nextInt(10) >= 4;
    }
}