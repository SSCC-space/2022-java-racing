import java.util.Scanner;

public class InputView {
    private String inputNames;
    private int tryCount;

    public void setUpRacingGame(){
        Scanner s = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        inputNames = s.nextLine();
        System.out.println("시도할 회수는 몇 회 인가요?");
        tryCount = s.nextInt();
    }

    public String getNames() {
        return inputNames;
    }

    public int getTryCount(){
        return tryCount;
    }
}
