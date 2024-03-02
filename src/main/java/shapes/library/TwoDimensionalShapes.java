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

    public static class RightTriangle {
        public static double getArea(double leg1, double leg2) {
            return (leg1 * leg2) / 2.0;
        }

        public static double getHypotenuse(double leg1, double leg2) {
            return Math.sqrt(Math.pow(leg1, 2.0) + Math.pow(leg2, 2.0));
        }

        public static double getPerimeter(double leg1, double leg2) {
            return leg1 + leg2 + Math.sqrt(Math.pow(leg1, 2.0) + Math.pow(leg2, 2.0));
        }

        public static double getLegLength(double leg1, double perimeter) {
            return perimeter * ((perimeter - (2.0 * leg1))/(2.0 * (perimeter - leg1)));
        }
    }

    public static class Triangle {
        public static double getArea(double base, double height) {
            return (height * base) / (2.0);
        }

        public static double getPerimeter(double side1, double side2, double base) {
            return side1 + side2 + base;
        }

        public static double getHeight(double base, double area) {
            return 2.0 * (area / base);
        }

        public static double getBase(double height, double area) {
            return 2.0 * (area / height);
        }
    }
}