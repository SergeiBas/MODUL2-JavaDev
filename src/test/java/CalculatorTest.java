import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void calc(){
        calculator = new Calculator();
    }

    @Test
    public void calculatorOne(){
        assertEquals(1,calculator.sumNumbers(1));
    }

    @Test
    public void calculatorFive(){
        assertEquals(15,calculator.sumNumbers(5));
    }
    @Test
    public void calculatorTen(){
        assertEquals(55,calculator.sumNumbers(10));
    }

    @Test
    public void calculatorException(){
        assertThrows(IllegalArgumentException.class,() -> calculator.sumNumbers(0));
    }
}
