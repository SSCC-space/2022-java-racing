package racingCarGame;

import java.util.Scanner;

public class InputView {

    private int carCount;
    private int numberCount;

    public void setCarCount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        carCount = scanner.nextInt();
    }

    public int getCarCount(){
        return carCount;
    }

    public void setNumberCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 횟수는 몇 회 인가요?");
        numberCount = scanner.nextInt();
    }

    public int getNumberCount(){
        return numberCount;
    }
}
