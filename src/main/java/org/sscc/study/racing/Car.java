package org.sscc.study.racing;

public class Car {
    private int position;

    public Car(int position) {
        this.position = position;
    }

    public void move() {
        position++;
    }

    public int getPosition() {
        return position;
    }
}
