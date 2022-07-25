package org.sscc.study.racing;

import java.util.List;

public class Controller {
    public static void main(String[] args) {
        InputView input = new InputView();
        InputValues inputValues = input.getValue();
        CarRacing carRacing = new CarRacing(inputValues);
        carRacing.raceStart(new RandomMove());
        List<Record> record = carRacing.getResult();
        ResultView resultView = new ResultView();
        resultView.printResult(record);
    }
}