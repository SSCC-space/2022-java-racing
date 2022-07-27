package org.sscc.study.racingwithname;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Winner {
    private final List<String> winners;

    public Winner() {
        winners = new ArrayList<>();
    }

    public List<String> getWinners(Record record) {
        Set<String> keys = record.getKeys();
        int max = getMax(record);
        keys.stream()
                .filter(key -> record.getValue(key) == max)
                .forEach(winners::add);
        return winners;
    }

    private int getMax(Record record) {
        return record.getValues()
                .stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0);
    }
}
