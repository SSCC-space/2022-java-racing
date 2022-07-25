package org.sscc.study.racing;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private final List<Integer> positions = new ArrayList<>();

    public Record(List<Car> cars) {
        for (Car car : cars) {
            positions.add(car.getPosition());
        }
    }

    public List<Integer> getPositions() {
        return positions;
    }
}
