package org.sscc.study.racingwithname;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Record {
    private final Map<String, Integer> positions = new LinkedHashMap<>();

    public Record(List<Car> cars) {
        for (Car car : cars) {
            this.positions.put(car.getName(), car.getPosition());
        }
    }

    public Set<String> getKeys() {
        return positions.keySet();
    }

    public int getValue(String key) {
        return positions.get(key);
    }

    public int getMax() {
        return positions.values()
                .stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0);
    }

    public List<String> getNames(int max) {
        return positions.keySet()
                .stream()
                .filter(key -> positions.get(key) == max)
                .collect(Collectors.toList());
    }
}
