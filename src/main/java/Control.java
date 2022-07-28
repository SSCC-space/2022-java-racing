public class Control {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        inputView.setUpRacingGame();

        ResultView resultView = new ResultView();

        RacingGame racingGame = new RacingGame(inputView.getNames());
        racingGame.startGame(inputView.getTryCount());
        racingGame.endGame();
        resultView.showRacingResult(inputView.getTryCount());
        resultView.showWinner();

    }
}
