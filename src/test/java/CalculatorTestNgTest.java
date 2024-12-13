import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTestNgTest {
    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(5, 7), 12);
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(7, 2), 5);
    }

    @Test
    public void multipleTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(5, 2), 10);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(6, 2), 3);
    }
}
