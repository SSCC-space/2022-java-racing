package org.sscc.study.racingwithname;

import java.util.StringTokenizer;

public class InputValues {
    private final int count;
    private final String names;

    public InputValues(String names, int count) {
        this.count = count;
        this.names = names;
    }

    public int getCount() {
        return count;
    }

    public StringTokenizer getNames() {
        return new StringTokenizer(names, ",");
    }
}
