package shapes.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDimensionalShapesTests {
    @Test
    public void testGetSquareArea() {
        double x = 5.0;
        double e = 25.0;
        double a = TwoDimensionalShapes.Square.getArea(x);
        assertEquals(e, a, "The area of the square is incorrect.");
    }

    @Test
    public void testGetSquarePerimeter() {
        double x = 5.0;
        double e = 20.0;
        double a = TwoDimensionalShapes.Square.getPerimeter(x);
        assertEquals(e, a, "The perimeter of the square is incorrect.");
    }

    @Test
    public void testGetSquareSide() {
        double x = 10.0;
        double e = 7.0710678118654755;
        double a = TwoDimensionalShapes.Square.getSide(x);
        assertEquals(e, a, "The side length of the square is incorrect.");
    }

    @Test
    public void testGetDiagonalLength() {
        double x = 12.0;
        double e = 16.970562748477143;
        double a = TwoDimensionalShapes.Square.getDiagonalLength(x);
        assertEquals(e, a, "The diagonal length of the square is incorrect.");
    }


    @Test
    public void testGetRectangleArea() {
        double x = 10.0;
        double y = 5.0;
        double e = 50.0;
        double a = TwoDimensionalShapes.Rectangle.getArea(x, y);
        assertEquals(e, a, "The area of the rectangle was incorrect.");
    }

    @Test
    public void testGetRectanglePerimeter() {
        double x = 10.0;
        double y = 5.0;
        double e = 30.0;
        double a = TwoDimensionalShapes.Rectangle.getPerimeter(x, y);
        assertEquals(e, a, "The perimeter of the rectangle was incorrect.");
    }


    @Test
    public void testGetCircleDiameterFromRadius() {
        double x = 10.0;
        double e = 20.0;
        double a = TwoDimensionalShapes.Circle.getDiameterFromRadius(x);
        assertEquals(e, a, "The diameter of the circle was incorrect.");
    }

    @Test
    public void testGetCircleRadiusFromDiameter() {
        double x = 20.0;
        double e = 10.0;
        double a = TwoDimensionalShapes.Circle.getRadiusFromDiameter(x);
        assertEquals(e, a, "The radius of the circle was incorrect.");
    }

    @Test
    public void testGetCircleArea() {
        double x = 10.0;
        double e = 314.1592653589793;
        double a = TwoDimensionalShapes.Circle.getArea(x);
        assertEquals(e, a , "The area of the circle was incorrect.");
    }

    @Test
    public void testGetCircleCircumference() {
        double x = 10.0;
        double e = 62.83185307179586;
        double a = TwoDimensionalShapes.Circle.getCircumference(x);
        assertEquals(e, a, "The circumference of the circle was incorrect.");
    }
}
