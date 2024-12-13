import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class EvenOddCheckerJunitTest {

    @Test
    public void evenTest() {
        assertEquals(EvenOddChecker.check(10), true);
    }

    @Test
    public void oddTest() {
        assertEquals(EvenOddChecker.check(5), false);
    }
}
