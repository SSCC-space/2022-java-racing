package org.sscc.study.racingwithname;

import java.util.List;

public class Winner {
    public List<String> getWinners(Record record) {
        return record.getNames(record.getMax());
    }
}
