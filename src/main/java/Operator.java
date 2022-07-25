import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    ADD("+", (n1, n2) -> n1 + n2),
    SUBTRACT("-", (n1, n2) -> n1 - n2),
    MULTIPLY("*", (n1, n2) -> n1 * n2),
    DIVIDE("/", (n1, n2) -> {
        if (n2 == 0.0)
            throw new ArithmeticException();
        return (n1 / n2);
    });

    private final String symbol;
    private final BiFunction<Float, Float, Float> operation;

    Operator(String symbol, BiFunction<Float, Float, Float> operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public float calculate(float n1, float n2) {
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

