package Calculator;

import java.util.Scanner;

public class CalculatorMain {
    private static Scanner scanner;
    public static String input;
    public static int result;
    static Calculator cal = new Calculator();

    public static void main(String[] args) throws Exception {
        inputOperation();
        cal.validationCheck(input);
        cal.calculator();
        printResult();
    }

    // 계산식을 직접 입력
    public static void inputOperation() {
        scanner = new Scanner(System.in);
        input = scanner.nextLine();
    }

    // 결과를 출력
    private static void printResult() throws Exception {
        result = cal.calculator();
        System.out.println(result);
    }
}