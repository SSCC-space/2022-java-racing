package org.sscc.study.racingwithname;

import java.util.List;

public class Controller {
    public static void main(String[] args) {
        InputView input = new InputView();
        InputValues inputValues = input.getValue();

        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new RandomMove());
        List<Record> records = carRacing.getProcess();
        ResultView resultView = new ResultView();
        resultView.printResult(records);

        Winner winner = new Winner();
        List<String> winners = winner.getWinners(carRacing.getResult());
        resultView.printWinners(winners);
    }
}