package org.sscc.study.controller;

import org.sscc.study.resource.Cars;
import org.sscc.study.resource.RandomCondition;
import org.sscc.study.resource.Round;
import org.sscc.study.resource.Winner;
import org.sscc.study.view.InputView;
import org.sscc.study.view.ResultView;

public class GameController {
    private static final RandomCondition randomCondition = new RandomCondition();
    private final Cars cars;
    private final ResultView resultView;
    private final Round rounds;

    public GameController(InputView inputView) {
        this.resultView = new ResultView();
        this.cars = new Cars(inputView.contenderNames());
        this.rounds = new Round(inputView.roundNumber());
    }

    public void play() {
        printResult(cars);
    }

    private void printResult(Cars cars) {
        for (int i = 0; i < rounds.roundCount(); i++) {
            cars.move(randomCondition);
            resultView.printRoundResult(cars);
            resultView.lineFeed();
        }

        resultView.printWinner(new Winner(cars).getWinnersList());
    }
}
