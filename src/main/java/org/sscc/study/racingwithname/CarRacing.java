package org.sscc.study.racingwithname;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {
    private final Cars cars;
    private final int count;
    private final List<Record> recordResult = new ArrayList<>();

    public CarRacing(InputValues inputValues) {
        this.count = inputValues.getCount();
        cars = new Cars(inputValues.getNames());
    }

    public void raceStart(MoveStrategy moveStrategy) {
        for (int i = 0; i < count; i++) {
            cars.run(moveStrategy);
            recordResult.add(cars.getRecord());
        }
    }

    public List<Record> getProcess() {
        return recordResult;
    }

    public Record getResult(){
        return recordResult.get(count-1);
    }
}
