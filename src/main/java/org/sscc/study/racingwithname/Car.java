package org.sscc.study.racingwithname;

public class Car {
    private int position;
    private final String name;

    public Car(String name) {
        this.position = 0;
        this.name = name;
    }

    public void move() {
        position++;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
