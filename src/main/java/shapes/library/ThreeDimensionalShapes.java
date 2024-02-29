package shapes.library;

public class ThreeDimensionalShapes {
    public static class Cube {
        public static double getSurfaceArea(double edgeLength) {
            return 6.0 * Math.pow(edgeLength, 2.0);
        }

        public static double getVolume(double edgeLength) {
            return Math.pow(edgeLength, 3.0);
        }

        public static double getSpaceDiagonal(double edgeLength) {
            return Math.sqrt(3.0) * edgeLength;
        }

        public static double getEdgeLength(double surfaceArea) {
            return Math.sqrt(surfaceArea / 6.0);
        }
    }

    public static class RightRectangularPrism {
        public static double getSurfaceArea(double length, double width, double height) {
            return 2 * ((width * length) + (height * length) + (height * width));
        }

        public static double getVolume(double length, double width, double height) {
            return width * height * length;
        }

        public static double getSpaceDiagonal(double length, double width, double height) {
            return Math.sqrt(Math.pow(length, 2.0) + Math.pow(width, 2.0) + Math.pow(height, 2.0));
        }

        public static double getLength(double width, double height, double spaceDiagonal) {
            return Math.sqrt(Math.pow(spaceDiagonal, 2.0) - Math.pow(height, 2.0) - Math.pow(width, 2.0));
        }

        public static double getWidth(double length, double height, double spaceDiagonal) {
            return Math.sqrt(Math.pow(spaceDiagonal, 2.0) - Math.pow(height, 2.0) - Math.pow(length, 2.0));
        }
        
        public static double getHeight(double length, double width, double spaceDiagonal) {
            return Math.sqrt(Math.pow(spaceDiagonal, 2.0) - Math.pow(length, 2.0) - Math.pow(width, 2.0));
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