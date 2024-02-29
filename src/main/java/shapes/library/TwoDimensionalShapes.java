package shapes.library;

public class TwoDimensionalShapes {
    public static class Square {
        public static double getArea(double sideLength) {
            return sideLength * sideLength;
        }

        public static double getPerimeter(double sideLength) {
            return 4.0 * sideLength;
        }

        public static double getSide(double diagonalLength) {
            return Math.sqrt(2.0) * (diagonalLength / 2.0);
        }

        public static double getDiagonalLength(double sideLength) {
            return Math.sqrt(2) * sideLength;
        }
    }

    public static class Rectangle {
        public static double getArea(double width, double height) {
            return width * height;
        }

        public static double getPerimeter(double width, double height) {
            return (2.0 * width) + (2.0 * height);
        }
    }

    public static class Circle {
        public static double getDiameterFromRadius(double radius) {
            return radius * 2.0;
        }

        public static double getRadiusFromDiameter(double diameter) {
            return diameter / 2.0;
        }

        public static double getArea(double radius) {
            return Math.PI * Math.pow(radius, 2.0);
        }
    
        public static double getCircumference(double radius) {
            return 2.0 * Math.PI * radius;
        }
    }
}