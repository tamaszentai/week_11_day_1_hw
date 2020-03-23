import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(14, calculator.Add(8,6));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.Subtract(8,6));
    }

    @Test
    public void testMultiply() {
        assertEquals(48, calculator.Multiply(8,6));
    }

    @Test
    public void testDivide() {
        assertEquals(1, calculator.Divide(8,6));
    }
}
