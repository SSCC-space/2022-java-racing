package Calculator;

public class Calculator {
    public int output;
    public String[] stringArray;

    public void validationCheck(String input) throws Exception {
        checkNullOrEmpty(input);
        judgeLength();
        checkOperator();
        checkOperand();
    }

    // 입력값이 공백인 경우 예외 처리
    public void checkNullOrEmpty(String input) throws Exception {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("입력값이 공백입니다.");
        }
        setStringArray(input);
    }

    // 배열 생성
    public void setStringArray(String input) {
        stringArray = input.split(" ");
    }

    // 배열의 길이가 짝수인 경우 예외 처리
    public void judgeLength() throws Exception {
        int length = stringArray.length;
        if (length % 2 == 0)
            throw new IllegalArgumentException("배열의 길이가 짝수입니다.");
    }

    // 사칙연산자가 아닐 경우 예외 처리
    public void checkOperator() throws Exception {
        int i = 1;
        if (findInvalidOperator(i))
            throw new IllegalArgumentException("잘못된 연산자입니다.");
    }

    public boolean findInvalidOperator(int i) {
        if (i >= stringArray.length)
            return false;
        if (stringArray[i].matches("[+*-/]"))
            return findInvalidOperator(i + 2);
        return true;
    }

    // 정수가 아닐 경우 예외 처리
    public void checkOperand() throws Exception {
        for (int i = 0; i < stringArray.length; i += 2) {
            findInvalidOperand(i);
        }
    }

    public void findInvalidOperand(int i) throws Exception {
        try {
            Integer.parseInt(stringArray[i]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 피연산자입니다.");
        }
    }

    public int calculator() throws Exception {
        output = Integer.parseInt(stringArray[0]);
        for (int i = 0; i < stringArray.length - 1; i += 2) {
            output = calculate(output, stringArray[i + 1],
                    Integer.parseInt(stringArray[i + 2]));
        }
        return output;
    }

    public int calculate(int n1, String symbol, int n2) throws Exception {
        Operator operator = Operator.findOperator(symbol);
        return operator.calculate(n1, n2);
    }
}