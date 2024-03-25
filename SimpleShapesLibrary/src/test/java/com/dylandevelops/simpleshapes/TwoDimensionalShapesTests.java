package com.dylandevelops.simpleshapes;

import org.junit.jupiter.api.Test;

import io.github.dylandevelops.simpleshapes.TwoDimensionalShapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDimensionalShapesTests {
    // Square
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

    // Rectangle
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

    // Circle
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

    // Right Triangle
    @Test
    public void testGetRightTriangleArea() {
        double x = 10.0;
        double y = 20.0;
        double e = 100.0;
        double a = TwoDimensionalShapes.RightTriangle.getArea(x, y);
        assertEquals(e, a, "The area of the right triangle was incorrect.");
    }

    @Test
    public void testGetRightTriangleHypotenuse() {
        double x = 10.0;
        double y = 20.0;
        double e = 22.360679774997898;
        double a = TwoDimensionalShapes.RightTriangle.getHypotenuse(x, y);
        assertEquals(e, a, "The hypotenuse of the right triangle was incorrect.");
    }

    @Test
    public void testGetRightTrianglePerimeter() {
        double x = 10.0;
        double y = 20.0;
        double e = 52.3606797749979;
        double a = TwoDimensionalShapes.RightTriangle.getPerimeter(x, y);
        assertEquals(e, a, "The perimeter of the right triangle was incorrect.");
    }

    @Test
    public void testGetRightTriangleLegLength() {
        double x = 10.0;
        double y = 60.0;
        double e = 24.0;
        double a = TwoDimensionalShapes.RightTriangle.getLegLength(x, y);
        assertEquals(e, a, "The leg length of the right triangle was incorrect.");
    }

    // Triangle
    @Test
    public void testGetTriangleArea() {
        double x = 10.0;
        double y = 20.0;
        double e = 100.0;
        double a = TwoDimensionalShapes.Triangle.getArea(x, y);
        assertEquals(e, a, "The area of the triangle was incorrect.");
    }

    @Test
    public void testGetTrianglePerimeter() {
        double x = 10.0;
        double y = 25.0;
        double z = 20.0;
        double e = 55.0;
        double a = TwoDimensionalShapes.Triangle.getPerimeter(x, y, z);
        assertEquals(e, a, "The perimeter of the triangle was incorrect.");
    }

    @Test
    public void testGetTriangleHeight() {
        double x = 10.0;
        double y = 50.0;
        double e = 10.0;
        double a = TwoDimensionalShapes.Triangle.getHeight(x, y);
        assertEquals(e, a, "The height of the triangle was incorrect.");
    }

    @Test
    public void testGetTriangleBase() {
        double x = 50.0;
        double y = 25.0;
        double e = 1.0;
        double a = TwoDimensionalShapes.Triangle.getBase(x, y);
        assertEquals(e, a, "The base of the triangle was incorrect.");
    }
}
