import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy{

    private final Random random = new Random();

    @Override
    public boolean isMoveAble() {
        return getRandomNumber() >= Constant.FORWARD_MIN;
    }

    private int getRandomNumber() {
        return random.nextInt(Constant.FORWARD_MAX);
    }
}
