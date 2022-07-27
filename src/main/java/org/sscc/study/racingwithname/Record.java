package org.sscc.study.racingwithname;

import java.util.*;

public class Record {
    private final Map<String, Integer> positions = new LinkedHashMap<>();

    public Record(List<Car> cars) {
        for (Car car : cars) {
            this.positions.put(car.getName(), car.getPosition());
        }
    }

    public Set<String> getKeys(){
        return positions.keySet();
    }

    public int getValue(String key){
        return positions.get(key);
    }

    public Collection<Integer> getValues(){
        return positions.values();
    }
}
