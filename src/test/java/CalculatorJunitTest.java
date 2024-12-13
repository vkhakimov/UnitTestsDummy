import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorJunitTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(5, 7), 12);
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtract(7, 2), 5);
    }

    @Test
    public void multipleTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(7, 2), 14);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.divide(6, 2), 3.0, 1);
    }
}
