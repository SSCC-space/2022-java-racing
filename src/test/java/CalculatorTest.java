import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void init(){
        calculator = new Calculator();
    }

    @DisplayName("add test")
    @Test
    public void addTest(){
        assertThat(10).isEqualTo(calculator.add(5, 5));
    }

    @DisplayName("subtract test")
    @Test
    public void subtractTest(){
        assertThat(0).isEqualTo(calculator.subtract(5, 5));
    }

    @DisplayName("multiply test")
    @Test
    public void multiplyTest(){
        assertThat(25).isEqualTo(calculator.multiply(5,5));
    }

    @DisplayName("divide test")
    @Test
    public void divideTest(){
        assertThat(1).isEqualTo(calculator.divide(5, 5));
    }

    @DisplayName("�Է� �� null/���� ���� test(toInt)")
    @Test
    public void inputNotExist() {
        assertThatThrownBy(() -> {
            calculator.toInt("");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("��Ģ���� ��ȣ�� �ƴ� ��� test(calculate)")
    @Test
    public void OperatorTest(){
        assertThatThrownBy(()->{
            calculator.calculate(1, '%', 2);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("��Ģ����(calculateFormuls) test")
    @Test
    public void resultTest(){
        String formula = "5 + 4 - 3 * 2 / 1";
        String[] formulaSplit = calculator.split(formula);
        assertThat(12).isEqualTo(calculator.calculateFormula(formulaSplit));
    }
}
