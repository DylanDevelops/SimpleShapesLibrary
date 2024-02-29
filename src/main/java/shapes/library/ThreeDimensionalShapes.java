package shapes.library;

public class ThreeDimensionalShapes {
    public static class Cube {
        public static double getSurfaceArea(double sideLength) {
            return 6.0 * Math.pow(sideLength, 2.0);
        }

        public static double getVolume(double sideLength) {
            return Math.pow(sideLength, 3.0);
        }

        public static double getSolidDiagonal(double sideLength) {
            return Math.sqrt(3.0) * sideLength;
        }

        public static double getSideLength(double surfaceArea) {
            return Math.sqrt(surfaceArea / 6.0);
        }
    }

    public static class RectangularPrism {
        public static double getSurfaceArea(double length, double width, double height) {
            return 2 * ((width * length) + (height * length) + (height * width));
        }

        public static double getVolume(double length, double width, double height) {
            return width * height * length;
        }

        public static double getSolidDiagonal(double length, double width, double height) {
            return Math.sqrt(Math.pow(length, 2.0) + Math.pow(width, 2.0) + Math.pow(height, 2.0));
        }
    }

    public static class Sphere {
        public static double getSurfaceArea(double radius) {
            return 4.0 * Math.PI * Math.pow(radius, 2.0);
        }
    
        public static double getDiameterFromRadius(double radius) {
            return 2.0 * radius;
        }

        public static double getRadiusFromDiameter(double diameter) {
            return diameter / 2.0;
        }

        public static double getVolume(double radius) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
        }
    }
}