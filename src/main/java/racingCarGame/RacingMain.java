package racingCarGame;

public class RacingMain {
    public static void main(String[] args){

        RacingGame racingGame = new RacingGame(3, 5);
        CarMoving carMoving = new CarMoving();
        RandomMove randomMove = new RandomMove();

        carMoving.carMove(racingGame, randomMove);
    }
}
