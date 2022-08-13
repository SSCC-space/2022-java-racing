package racinggame;

public class Controller {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        InputValue inputValue = inputView.inputCar();

        RandomGo randomGo = new RandomGo();
        RacingGame racingGame = new RacingGame(inputValue);

        racingGame.runRace(randomGo);

        ResultView resultView = new ResultView();
        resultView.printRace(racingGame.getRecords());
    }
}
