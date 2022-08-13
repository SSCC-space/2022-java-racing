package racinggame;

import java.util.Random;

public class RandomGo implements MoveCase {
    private final Random random;

    public RandomGo() {
        this.random = new Random();
    }

    @Override
    public boolean isMovable() {
        return (random.nextInt(10) >= 4);
    }
}
