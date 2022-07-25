public class CheckOperation {
    String[] stringArray;
    float output;

    private void checkOperation(String input) throws Exception {
        validationCheck(input);
    }

    private void validationCheck(String input) throws Exception {
        judgeLength();
        checkNullOrEmpty(input);
        checkOperator();
        checkOperand();
    }

    // 입력값이 null이거나 빈 공백 문자일 경우 예외 처리
    public void checkNullOrEmpty(String input) throws Exception {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("입력값이 공백입니다.");
        }
        setStringArray(input);
    }

    // 입력받은 계산식으로 배열 생성
    public void setStringArray(String input) {
        stringArray = input.split("");
    }

    // 배열의 길이가 홀수인지 판정
    public void judgeLength() throws Exception {
        int length = stringArray.length;
        if (length % 2 == 0)
            throw new IllegalArgumentException("배열의 길이가 홀수입니다.");
    }

    // 사칙연산 기호가 아닌 경우 예외 처리
    public void checkOperator() throws Exception {
        int i = 1;
        if (findInvalidOperator(i))
            throw new IllegalArgumentException();
    }

    // 배열의 홀수번째 index가 사칙연산 기호인지 판정
    public boolean findInvalidOperator(int i) {
        if (i >= stringArray.length)
            return false;
        if (stringArray[i].matches("[+*-/]"))
            return findInvalidOperator(i + 2);
        return true;
    }

    // 실수가 아닌 경우 예외 처리
    public void checkOperand() throws Exception {
        for (int i = 0; i < stringArray.length; i += 2) {
            findInvalidOperand(i);
        }
    }

    // 배열의 짝수번째 index가 실수인지 판정
    public void findInvalidOperand(int i) throws Exception {
        try {
            Float.parseFloat(stringArray[i]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 피연산자입니다.");
        }
    }

    private void calculator() throws Exception {
        output = Float.parseFloat(stringArray[0]);
        for (int i = 0; i < stringArray.length - 1; i += 2) {
            output = calculate(output, stringArray[i + 1],
                    Float.parseFloat(stringArray[i + 2]));
        }
    }

    private float calculate(float n1, String symbol, float n2) throws Exception {
        Operator operator = Operator.findOperator(symbol);
        return operator.calculate(n1,n2);
    }

    public void printResult() {
        System.out.println(output);
    }
}

