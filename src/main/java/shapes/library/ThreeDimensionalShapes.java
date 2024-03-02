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

    public static class Pyramid {
        public static double getVolume(double baseLength, double baseWidth, double pyramidHeight) {
            return (baseLength * baseWidth * pyramidHeight) / (3.0);
        }

        public static double getBaseArea(double baseLength, double baseWidth) {
            return baseLength * baseWidth;
        }

        public static double getSurfaceArea(double baseLength, double baseWidth, double pyramidHeight) {
            return baseLength + baseWidth + baseLength * Math.sqrt(Math.pow(baseWidth / 2.0, 2.0) + Math.pow(pyramidHeight, 2.0)) + baseWidth * Math.sqrt(Math.pow(baseWidth / 2.0, 2.0) + Math.pow(pyramidHeight, 2.0));
        }

        public static double getLateralSurfaceArea(double baseLength, double baseWidth, double pyramidHeight) {
            return baseLength * Math.sqrt(Math.pow(baseWidth / 2.0, 2.0) + Math.pow(pyramidHeight, 2.0)) + baseWidth * Math.sqrt(Math.pow(baseLength / 2.0, 2.0) + Math.pow(pyramidHeight, 2.0));
        }
    }

    public static class Cone {
        public static double getVolume(double radius, double height) {
            return Math.PI * Math.pow(radius, 2.0) * (height / 3.0);
        }

        public static double getBaseArea(double radius) {
            return Math.PI * Math.pow(radius, 2.0);
        }

        public static double getSurfaceArea(double radius, double height) {
            return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2.0) + Math.pow(radius, 2.0)));
        }

        public static double getLateralSurfaceArea(double radius, double height) {
            return Math.PI * radius * Math.sqrt(Math.pow(height, 2.0) + Math.pow(radius, 2.0));
        }
    }

    public static class TriangularPrism {
        public static double getVolume(double baseSide1, double baseSide2, double baseSide3, double height) {
            return (1.0 / 4.0) * height * Math.sqrt(-Math.pow(baseSide1, 4.0) + 2.0 * Math.pow(baseSide1 * baseSide2, 2.0) + 2.0 * Math.pow(baseSide1 * baseSide3, 2.0) - Math.pow(baseSide2, 4.0) + 2.0 * Math.pow(baseSide2 * baseSide3, 2.0) - Math.pow(baseSide3, 4.0));
        }

        public static double getBaseArea(double baseSide1, double baseSide2, double baseSide3) {
            return (1.0 / 4.0) * Math.sqrt(-Math.pow(baseSide1, 4.0) + 2.0 * Math.pow(baseSide1 * baseSide2, 2.0) + 2.0 * Math.pow(baseSide1 * baseSide3, 2.0) - Math.pow(baseSide2, 4.0) + 2.0 * Math.pow(baseSide2 * baseSide3, 2.0) - Math.pow(baseSide3, 4.0));
        }

        public static double getSurfaceArea(double baseSide1, double baseSide2, double baseSide3, double height) {
            
        }

        public static double getLateralSurfaceArea(double baseSide1, double baseSide2, double baseSide3, double height) {
            return (baseSide1 + baseSide2 + baseSide3) * height;
        }
    }
}