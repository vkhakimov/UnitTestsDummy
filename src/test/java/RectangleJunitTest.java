import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleJunitTest {

    @Test
    public void lengthTest() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(rectangle.length, 5, 1);
    }

    @Test
    public void widthTest() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(rectangle.width, 10, 1);
    }

    @Test
    public void setLengthTest() {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setLength(6);
        assertEquals(rectangle.length, 6, 1);
    }

    @Test
    public void setWidthTest() {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setWidth(11);
        assertEquals(rectangle.width, 11, 1);
    }

    @Test
    public void areaTest() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(rectangle.getArea(), 50, 1);
    }
}
