package tests;

import org.junit.Test;
import shapes.RegularTriangle;
import shapes.Triangle;

import static org.junit.Assert.assertEquals;

class TriangleTest {

    @Test
    void testValidTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.getArea(), 0.001);
        assertEquals(12, triangle.getPerimeter(), 0.001);
    }

    @Test
    void testRegularTriangle() {
        Triangle equilateral = new RegularTriangle(6);
        assertEquals((Math.sqrt(3) / 4) * 6 * 6, equilateral.getArea(), 0.001);
        assertEquals(18, equilateral.getPerimeter(), 0.001);
    }

    @Test
    void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 3)); // Нарушает неравенство треугольника
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-1, 2, 3)); // Нельзя отрицательные стороны
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 2, 2)); // Нельзя стороны = 0
    }
}