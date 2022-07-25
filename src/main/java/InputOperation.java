import java.util.Scanner;

public class InputOperation {
    static Scanner scanner;
    static String input;
    static CheckOperation calculator;

    public static void main(String[] args) {
        inputOperation();
        print();
    }

    // 계산식을 직접 입력
    static void inputOperation() {
        scanner = new Scanner(System.in);
        input = scanner.nextLine();
        calculator = new CheckOperation();
    }

    // 계산 결과를 출력
    static void print() {
        try {
            calculator.printResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
