import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(8,6);
    }

    @Test
    public void testAdd() {
        assertEquals(14, calculator.Add());
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.Subtract());
    }

    @Test
    public void testMultiply() {
        assertEquals(48, calculator.Multiply());
    }

    @Test
    public void testDivide() {
        assertEquals(1, calculator.Divide());
    }
}
