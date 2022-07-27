import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy{

    private final Random random = new Random();

    @Override
    public boolean isMoveAble() {
        if(getRandomNumber() >= 4){
            return true;
        }
        return false;
    }

    private int getRandomNumber() {
        return random.nextInt(10);
    }
}
