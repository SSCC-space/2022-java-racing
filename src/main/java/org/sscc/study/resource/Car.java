package org.sscc.study.resource;

import java.util.Random;

public class Car {
    private int position;

    public Car(Car that) {
        this.position = that.currentPosition();
    }

    public Car() {
        this(0);
    }

    public Car(int position) {
        this.position = position;
    }

    public void move(NumberGenerator someNumber) {
        if (someNumber.isMovable()) {
            position++;
        }
    }

    public int currentPosition() {
        return position;
    }
}
