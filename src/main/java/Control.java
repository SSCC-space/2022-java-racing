import java.util.List;

public class Control {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        inputView.setUpRacingGame();

        ResultView resultView = new ResultView();

        MoveStrategy strategy = new RandomMoveStrategy();
        RacingGame racingGame = new RacingGame(inputView.getCarCount(),strategy);
        racingGame.startGame(inputView.getTryCount());
        List<Integer> result = racingGame.getResult();
        resultView.showCarPosition(result);

    }
}
