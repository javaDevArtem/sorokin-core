package tests;

import org.junit.Test;
import shapes.Rectangle;
import shapes.Square;

import static org.junit.Assert.assertEquals;

class RectangleTest {

    @Test
    void testValidRectangle() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea(), 0.001);
        assertEquals(30, rect.getPerimeter(), 0.001);
    }

    @Test
    void testSquare() {
        Rectangle square = new Square(4);
        assertEquals(16, square.getArea(), 0.001);
        assertEquals(16, square.getPerimeter(), 0.001);
    }

    @Test
    void testInvalidRectangle() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 5));
    }
}