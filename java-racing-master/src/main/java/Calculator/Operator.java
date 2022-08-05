package Calculator;

import java.util.function.BiFunction;

public enum Operator {
    ADD("+", (n1, n2) -> n1 + n2),
    SUBTRACT("-", (n1, n2) -> n1 - n2),
    MULTIPLY("*", (n1, n2) -> n1 * n2),
    DIVIDE("/", (n1, n2) -> {
        if (n2 == 0)
            throw new ArithmeticException();
        return (n1 / n2);
    });

    private final String symbol;
    private final BiFunction<Integer, Integer, Integer> operation;

    Operator(String symbol, BiFunction<Integer, Integer, Integer> operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public int calculate(int n1, int n2) {
        return operation.apply(n1, n2);
    }

    public static Operator findOperator(String symbol) {
        for (Operator operator : Operator.values()) {
            if (symbol.equals(operator.symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다.");
    }
}
