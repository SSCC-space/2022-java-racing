package org.sscc.study.racingwithname;

public class Car {
    private int position;
    private final String name;
    private static final int NAME_LENGTH=5;

    public Car(String name) {
        this.position = 0;
        this.name = checkLength(name);
    }

    private String checkLength(String name){
        if(name.length()>NAME_LENGTH){
            throw new IllegalArgumentException("자동차 이름은 5자를 넘을 수 없습니다.");
        }
        return name;
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
