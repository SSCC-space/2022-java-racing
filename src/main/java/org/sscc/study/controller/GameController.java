package org.sscc.study.controller;

import org.sscc.study.resource.Cars;
import org.sscc.study.view.InputView;
import org.sscc.study.view.ResultView;

public class GameController {
    private final Cars cars;
    private final ResultView resultView;

    public GameController(InputView inputView) {
        this.resultView = new ResultView();
        this.cars = new Cars(inputView.contenderNames(), inputView.roundNumber());
    }

    public void play() {
        printResult(cars);
    }

    private void printResult(Cars cars) {
        for (int i = 0; i < cars.roundCount(); i++) {
            cars.move();
            resultView.printRoundResult(cars);
            resultView.lineFeed();
        }

        resultView.printWinner(cars.winner());
    }

    private void printWinner(Cars cars) {
        resultView.printWinner(cars.winner());
    }
}
