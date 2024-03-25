package io.github.dylandevelops.simpleshapes;

/**
 * The class containing information and calculations relating
 * to three dimensional shapes.
 * 
 * @author Dylan Ravel
 * @since 0.1.0
 */
public class ThreeDimensionalShapes {
    /**
     * The class containing information and calculations relating
     * to the cube.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class Cube {
        /**
         * Calculates the surface area of the cube by accepting
         * a side length as a parameter.
         * 
         * @param sideLength A double representing the side length of the cube.
         * @return A double representing the surface area of the cube.
         */
        public static double getSurfaceArea(double sideLength) {
            return 6.0 * Math.pow(sideLength, 2.0);
        }

        /**
         * Calculates the volume of the cube by accepting
         * a side length as a parameter.
         * 
         * @param sideLength A double representing the side length of the cube.
         * @return A double representing the volume of the cube.
         */
        public static double getVolume(double sideLength) {
            return Math.pow(sideLength, 3.0);
        }

        /**
         * Calculates the solid diagonal length of the cube by accepting
         * a side length as a parameter.
         * 
         * @param sideLength A double representing the side length of the cube.
         * @return A double representing the solid diagonal length of the cube.
         */
        public static double getSolidDiagonal(double sideLength) {
            return Math.sqrt(3.0) * sideLength;
        }

        /**
         * Calculates the length of each edge (side length) of the cube by 
         * accepting the surface area as a parameter.
         * 
         * @param surfaceArea A double representing the surface area of the cube.
         * @return A double representing the side length of the cube.
         */
        public static double getSideLength(double surfaceArea) {
            return Math.sqrt(surfaceArea / 6.0);
        }
    }

    /**
     * The class containing information and calculations relating
     * to the rectangular prism.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class RectangularPrism {
        /**
         * Calculates the surface area of the rectangular prism by 
         * accepting a side length as a parameter.
         *  
         * @param length A double representing the length of the rectangular prism.
         * @param width A double representing the width of the rectangular prism.
         * @param height A double representing the height of the rectangular prism.
         * @return A double representing the surface area of the rectangular prism.
         */
        public static double getSurfaceArea(double length, double width, double height) {
            return 2 * ((width * length) + (height * length) + (height * width));
        }

        /**
         * Calculates the volume of the rectangular prism by accepting
         * a side length as a parameter.
         *  
         * @param length A double representing the length of the rectangular prism.
         * @param width A double representing the width of the rectangular prism.
         * @param height A double representing the height of the rectangular prism.
         * @return A double representing the volume of the rectangular prism.
         */
        public static double getVolume(double length, double width, double height) {
            return width * height * length;
        }

        /**
         * Calculates the solid diagonal length of the rectangular prism by 
         * accepting a side length as a parameter.
         *  
         * @param length A double representing the length of the rectangular prism.
         * @param width A double representing the width of the rectangular prism.
         * @param height A double representing the height of the rectangular prism.
         * @return A double representing the diagonal length of the rectangular prism.
         */
        public static double getSolidDiagonal(double length, double width, double height) {
            return Math.sqrt(Math.pow(length, 2.0) + Math.pow(width, 2.0) + Math.pow(height, 2.0));
        }
    }

    /**
     * The class containing information and calculations relating
     * to the sphere.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class Sphere {
        /**
         * Calculates the surface area of the sphere by 
         * accepting the radius as a parameter.
         * 
         * @param radius A double representing the radius of the sphere.
         * @return A double representing the side length of the cube.
         */
        public static double getSurfaceArea(double radius) {
            return 4.0 * Math.PI * Math.pow(radius, 2.0);
        }
    
        /**
         * Calculates the diameter of the sphere by
         * accepting the radius as a parameter.
         * 
         * @param radius A double representing the radius of the sphere.
         * @return A double representing the diameter of the sphere.
         */
        public static double getDiameterFromRadius(double radius) {
            return 2.0 * radius;
        }

        /**
         * Calculates the radius of the sphere by
         * accepting the diameter as a parameter.
         * 
         * @param diameter A double representing the diameter of the sphere.
         * @return A double representing the radius of the sphere.
         */
        public static double getRadiusFromDiameter(double diameter) {
            return diameter / 2.0;
        }

        /**
         * Calculates the volume of the sphere by
         * accepting the radius as a parameter.
         * 
         * @param radius A double representing the radius of the sphere.
         * @return A double representing the volume of the sphere.
         */
        public static double getVolume(double radius) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
        }
    }

    /**
     * The class containing information and calculations relating
     * to the pyramid.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class Pyramid {
        /**
         * Calculates the volume of the pyramid by
         * accepting the base length, base width and
         * pyramid height as a parameter.
         * 
         * @param baseLength A double representing the base length of the pyramid.
         * @param baseWidth A double representing the base width of the pyramid.
         * @param pyramidHeight A double representing the height of the pyramid.
         * @return A double representing the volume of the pyramid.
         */
        public static double getVolume(double baseLength, double baseWidth, double pyramidHeight) {
            return (getBaseArea(baseLength, baseWidth) * pyramidHeight) / (3.0);
        }

        /**
         * Calculates the base area of the pyramid by
         * accepting the base length and base width as
         * a parameter.
         * 
         * @param baseLength A double representing the base length of the pyramid.
         * @param baseWidth A double representing the base width of the pyramid.
         * @return A double representing the base area of the pyramid.
         */
        public static double getBaseArea(double baseLength, double baseWidth) {
            return baseLength * baseWidth;
        }

        /**
         * Calculates the surface area of the pyramid by
         * accepting the base length, base width and
         * pyramid height as a parameter.
         * 
         * @param baseLength A double representing the base length of the pyramid.
         * @param baseWidth A double representing the base width of the pyramid.
         * @param pyramidHeight A double representing the height of the pyramid.
         * @return A double representing the surface area of the pyramid.
         */
        public static double getSurfaceArea(double baseLength, double baseWidth, double pyramidHeight) {
            return getLateralSurfaceArea(baseLength, baseWidth, pyramidHeight) + getBaseArea(baseLength, baseWidth);
        }

        /**
         * Calculates the lateral surface area of the 
         * pyramid by accepting the base length, base 
         * width and pyramid height as a parameter.
         * 
         * @param baseLength A double representing the base length of the pyramid.
         * @param baseWidth A double representing the base width of the pyramid.
         * @param pyramidHeight A double representing the height of the pyramid.
         * @return A double representing the lateral surface area of the pyramid.
         */
        public static double getLateralSurfaceArea(double baseLength, double baseWidth, double pyramidHeight) {
            return baseLength * Math.sqrt(Math.pow(baseWidth / 2.0, 2.0) + Math.pow(pyramidHeight, 2.0)) + baseWidth * Math.sqrt(Math.pow(baseLength / 2.0, 2.0) + Math.pow(pyramidHeight, 2.0));
        }
    }

    /**
     * The class containing information and calculations relating
     * to the cone.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class Cone {
        /**
         * Calculates the volume of the cone by
         * accepting the radius and height as a
         * parameter.
         * 
         * @param radius A double representing the radius of the cone.
         * @param height A double representing the height of the cone.
         * @return A double representing the volume of the cone.
         */
        public static double getVolume(double radius, double height) {
            return getBaseArea(radius) * (height / 3.0);
        }

        /**
         * Calculates the base area of the cone by
         * accepting the radius and height as a
         * parameter.
         * 
         * @param radius A double representing the radius of the cone.
         * @return A double representing the base area of the cone.
         */
        public static double getBaseArea(double radius) {
            return Math.PI * Math.pow(radius, 2.0);
        }

        /**
         * Calculates the surface area of the cone by
         * accepting the radius and height as a
         * parameter.
         * 
         * @param radius A double representing the radius of the cone.
         * @param height A double representing the height of the cone.
         * @return A double representing the surface area of the cone.
         */
        public static double getSurfaceArea(double radius, double height) {
            return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2.0) + Math.pow(radius, 2.0)));
        }

        /**
         * Calculates the lateral surface area of the 
         * cone by accepting the radius and height as a
         * parameter.
         * 
         * @param radius A double representing the radius of the cone.
         * @param height A double representing the height of the cone.
         * @return A double representing the lateral surface area of the cone.
         */
        public static double getLateralSurfaceArea(double radius, double height) {
            return Math.PI * radius * Math.sqrt(Math.pow(height, 2.0) + Math.pow(radius, 2.0));
        }
    }

    /**
     * The class containing information and calculations relating
     * to the triangular prism.
     * 
     * @author Dylan Ravel
     * @since 1.0
     */
    public static class TriangularPrism {
        /**
         * Calculates the volume of the triangular
         * prism by accepting the 3 base sides and
         * height as a parameter.
         * 
         * @param baseSide1 A double representing a base side of the triangular prism.
         * @param baseSide2 A double representing a base side of the triangular prism.
         * @param baseSide3 A double representing a base side of the triangular prism.
         * @param height A double representing the height of the triangular prism.
         * @return A double representing the volume of the triangular prism.
         */
        public static double getVolume(double baseSide1, double baseSide2, double baseSide3, double height) {
            return (1.0 / 4.0) * height * Math.sqrt(-Math.pow(baseSide1, 4.0) + 2.0 * Math.pow(baseSide1 * baseSide2, 2.0) + 2.0 * Math.pow(baseSide1 * baseSide3, 2.0) - Math.pow(baseSide2, 4.0) + 2.0 * Math.pow(baseSide2 * baseSide3, 2.0) - Math.pow(baseSide3, 4.0));
        }

        /**
         * Calculates the base area of the triangular
         * prism by accepting the 3 base sides as a
         * parameter.
         * 
         * @param baseSide1 A double representing a base side of the triangular prism.
         * @param baseSide2 A double representing a base side of the triangular prism.
         * @param baseSide3 A double representing a base side of the triangular prism.
         * @return A double representing the base area of the triangular prism.
         */
        public static double getBaseArea(double baseSide1, double baseSide2, double baseSide3) {
            return (1.0 / 4.0) * Math.sqrt(-Math.pow(baseSide1, 4.0) + 2.0 * Math.pow(baseSide1 * baseSide2, 2.0) + 2.0 * Math.pow(baseSide1 * baseSide3, 2.0) - Math.pow(baseSide2, 4.0) + 2.0 * Math.pow(baseSide2 * baseSide3, 2.0) - Math.pow(baseSide3, 4.0));
        }

        /**
         * Calculates the lateral surface area of 
         * the triangular prism by accepting the 
         * three base sides and height as a 
         * parameter.
         * 
         * @param baseSide1 A double representing a base side of the triangular prism.
         * @param baseSide2 A double representing a base side of the triangular prism.
         * @param baseSide3 A double representing a base side of the triangular prism.
         * @param height A double representing the height of the triangular prism.
         * @return A double representing the lateral surface area of the triangular prism.
         */
        public static double getLateralSurfaceArea(double baseSide1, double baseSide2, double baseSide3, double height) {
            return (baseSide1 + baseSide2 + baseSide3) * height;
        }
    }
}