package org.sscc.study.util;

public enum Constants {
    MAX_NAME_SIZE(5),
    THRESHOLD(4),
    RANDOM_BOUND(10);

    private final int value;

    Constants(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
