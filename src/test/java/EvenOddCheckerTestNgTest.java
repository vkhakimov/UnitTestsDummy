import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOddCheckerTestNgTest {

    @Test
    public void evenTest() {
       Assert.assertEquals(EvenOddChecker.check(10), true);
    }

    @Test
    public void oddTest() {
        Assert.assertEquals(EvenOddChecker.check(5), false);
    }
}
