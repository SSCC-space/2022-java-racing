package Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    static Calculator calculator = new Calculator();

    @ParameterizedTest
    @DisplayName("올바르지 않은 입력값으로 테스트")
    @ValueSource(strings = {"", "9  + 1 , 10",
            "3 ? 7 * 4, -1", "9 + 2 - a, 10"})
    void exceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculator();
        });
    }

    @ParameterizedTest
    @DisplayName("올바른 입력값으로 테스트")
    @CsvSource({"5 + 3 / 4, 2", "12 - 3 * 3, 27",
            "10 / 3 + 2, 5", "7 / 2 + 8, 11"})
    void calculationTest(String testInput, String testAnswer) throws Exception {
        calculator.validationCheck(testInput);
        assertThat(calculator.calculator()).isEqualTo(Integer.parseInt(testAnswer));
    }
}