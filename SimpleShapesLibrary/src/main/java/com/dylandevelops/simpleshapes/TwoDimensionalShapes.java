package com.dylandevelops.simpleshapes;

/**
 * The class containing information and calculations relating
 * to two dimensional shapes.
 * 
 * @author Dylan Ravel
 * @since 0.1.0
 */
public class TwoDimensionalShapes {
    /**
     * The class containing information and calculations relating
     * to the square.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class Square {
        /**
         * Calculates the area of the square by accepting
         * a side length as a parameter.
         * 
         * @param sideLength A double representing the side length of the square.
         * @return A double representing the area of the square.
         */
        public static double getArea(double sideLength) {
            return sideLength * sideLength;
        }

        /**
         * Calculates the perimeter of the square by accepting
         * a side length as a parameter.
         * 
         * @param sideLength A double representing the side length of the square.
         * @return A double representing the perimeter of the square.
         */
        public static double getPerimeter(double sideLength) {
            return 4.0 * sideLength;
        }

        /**
         * Calculates the side length of the square by accepting
         * the diagonal length as a parameter.
         * 
         * @param diagonalLength A double representing the diagonal length of the square.
         * @return A double representing the side length of the square.
         */
        public static double getSide(double diagonalLength) {
            return Math.sqrt(2.0) * (diagonalLength / 2.0);
        }

        /**
         * Calculates the side length of the square by accepting
         * the diagonal length as a parameter.
         * 
         * @param sideLength A double representing the side length of the square.
         * @return A double representing the diagonal length of the square.
         */
        public static double getDiagonalLength(double sideLength) {
            return Math.sqrt(2.0) * sideLength;
        }
    }

    /**
     * The class containing information and calculations relating
     * to the square.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class Rectangle {
        /**
         * Represents a rectangle shape.
         */
        
        /**
         * Calculates the area of a rectangle by accepting
         * the length and width as parameters.
         * 
         * @param length A double representing the length of the rectangle.
         * @param width A double representing the width of the rectangle.
         * @return A double representing the area of the rectangle.
         */
        public static double getArea(double width, double length) {
            return width * length;
        }

        /**
         * Calculates the perimeter of a rectangle by accepting
         * the length and width as parameters.
         * 
         * @param length A double representing the length of the rectangle.
         * @param width A double representing the width of the rectangle.
         * @return A double representing the perimeter of the rectangle.
         */
        public static double getPerimeter(double width, double length) {
            return 2.0 * (length + width);
        }

        /**
         * Calculates the diagonal length of a rectangle by accepting
         * the length and width as parameters.
         * 
         * @param length A double representing the length of the rectangle.
         * @param width A double representing the width of the rectangle.
         * @return A double representing the diagonal length of the rectangle.
         */
        public static double getDiagonalLength(double width, double length) {
            return Math.sqrt(Math.pow(width, 2.0) + Math.pow(length, 2.0));
        }
        
        /**
         * Calculates the length of a rectangle by accepting
         * the width and area as parameters.
         * 
         * @param width A double representing the width of the rectangle.
         * @param area A double representing the area of the rectangle.
         * @return A double representing the length of the rectangle.
         */
        public static double getLength(double width, double area) {
            return area / width;
        }

        /**
         * Calculates the width of a rectangle by accepting
         * the length and area as parameters.
         * 
         * @param length A double representing the length of the rectangle.
         * @param area A double representing the area of the rectangle.
         * @return A double representing the width of the rectangle.
         */
        public static double getWidth(double length, double area) {
            return area / length;
        }
    }

    /**
     * The class containing information and calculations relating
     * to the circle.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class Circle {
        /**
         * Calculates the diameter of a circle given its radius.
         *
         * @param radius The radius of the circle
         * @return The diameter of the circle
         */
        public static double getDiameterFromRadius(double radius) {
            return radius * 2.0;
        }

        /**
         * Calculates the radius of a circle given its diameter.
         *
         * @param diameter The diameter of the circle
         * @return The radius of the circle
         */
        public static double getRadiusFromDiameter(double diameter) {
            return diameter / 2.0;
        }

        /**
         * Calculates the area of a circle given its radius.
         *
         * @param radius The radius of the circle
         * @return The area of the circle
         */
        public static double getArea(double radius) {
            return Math.PI * Math.pow(radius, 2.0);
        }

        /**
         * Calculates the circumference of a circle given its radius.
         *
         * @param radius The radius of the circle
         * @return The circumference of the circle
         */
        public static double getCircumference(double radius) {
            return 2.0 * Math.PI * radius;
        }
    }

    /**
     * The class containing information and calculations relating
     * to the right triangle.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class RightTriangle {
        /**
         * Calculates the area of a right triangle.
         *
         * @param leg1 The length of the first leg of the right triangle.
         * @param leg2 The length of the second leg of the right triangle.
         * @return The area of the right triangle.
         */
        public static double getArea(double leg1, double leg2) {
            return (leg1 * leg2) / 2.0;
        }

        /**
         * Calculates the hypotenuse of a right triangle using the Pythagorean theorem.
         *
         * @param leg1 The length of the first leg of the right triangle.
         * @param leg2 The length of the second leg of the right triangle.
         * @return The length of the hypotenuse.
         */
        public static double getHypotenuse(double leg1, double leg2) {
            return Math.sqrt(Math.pow(leg1, 2.0) + Math.pow(leg2, 2.0));
        }

        /**
         * Calculates the perimeter of a right triangle.
         *
         * @param leg1 The length of the first leg of the right triangle.
         * @param leg2 The length of the second leg of the right triangle.
         * @return The perimeter of the right triangle.
         */
        public static double getPerimeter(double leg1, double leg2) {
            return leg1 + leg2 + Math.sqrt(Math.pow(leg1, 2.0) + Math.pow(leg2, 2.0));
        }

        /**
         * Calculates the length of the missing leg of a right triangle.
         *
         * @param leg1 The length of one of the legs of the right triangle.
         * @param perimeter The perimeter of the right triangle.
         * @return The length of the missing leg.
         */
        public static double getLegLength(double leg1, double perimeter) {
            return perimeter * ((perimeter - (2.0 * leg1)) / (2.0 * (perimeter - leg1)));
        }
    }

    /**
     * The class containing information and calculations relating
     * to the triangle.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class Triangle {
        /**
         * Calculates the area of a triangle.
         *
         * @param base The length of the base of the triangle
         * @param height The height of the triangle
         * @return The area of the triangle
         */
        public static double getArea(double base, double height) {
            return (height * base) / (2.0);
        }

        /**
         * Calculates the perimeter of a triangle.
         *
         * @param side1 The length of side 1 of the triangle
         * @param side2 The length of side 2 of the triangle
         * @param base  The length of the base of the triangle
         * @return The perimeter of the triangle
         */
        public static double getPerimeter(double side1, double side2, double base) {
            return side1 + side2 + base;
        }

        /**
         * Calculates the height of a triangle.
         *
         * @param base The length of the base of the triangle
         * @param area The area of the triangle
         * @return The height of the triangle
         */
        public static double getHeight(double base, double area) {
            return 2.0 * (area / base);
        }

        /**
         * Calculates the base of a triangle.
         *
         * @param height The height of the triangle
         * @param area The area of the triangle
         * @return The base of the triangle
         */
        public static double getBase(double height, double area) {
            return 2.0 * (area / height);
        }
    }
}