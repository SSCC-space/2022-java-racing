package org.sscc.study.resource;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(RandomCondition randomCondition) {
        if (randomCondition.isMovable()) {
            position++;
        }
    }

    public int currentPosition() {
        return position;
    }

    public String name() {
        return name;
    }
}
