package shapes.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeDimensionalShapesTests {
    @Test
    public void testGetCubeSurfaceArea() {
        double x = 5.0;
        double e = 150.0;
        double a = ThreeDimensionalShapes.Cube.getSurfaceArea(x);
        assertEquals(e, a, "The surface area of the cube is incorrect.");
    }

    @Test
    public void testGetCubeVolume() {
        double x = 5.0;
        double e = 125.0;
        double a = ThreeDimensionalShapes.Cube.getVolume(x);
        assertEquals(e, a, "The volume of the cube is incorrect.");
    }

    @Test
    public void testGetCubeSpaceDiagonal() {
        double x = 5.0;
        double e = 8.660254037844386;
        double a = ThreeDimensionalShapes.Cube.getSolidDiagonal(x);
        assertEquals(e, a, "The solid diagonal of the cube is incorrect.");
    }

    @Test
    public void testGetCubeSideLength() {
        double x = 125.0;
        double e = 4.564354645876384;
        double a = ThreeDimensionalShapes.Cube.getSideLength(x);
        assertEquals(e, a, "The side length of the cube is incorrect.");
    }


    @Test
    public void testGetRectangularPrismSurfaceArea() {
        double x = 25.0;
        double y = 10.0;
        double z = 15.0;
        double e = 1550.0;
        double a = ThreeDimensionalShapes.RectangularPrism.getSurfaceArea(x, y, z);
        assertEquals(e, a, "The side length of the cube is incorrect.");
    }

    @Test
    public void testGetRectangularPrismVolume() {
        double x = 25.0;
        double y = 10.0;
        double z = 15.0;
        double e = 3750.0;
        double a = ThreeDimensionalShapes.RectangularPrism.getVolume(x, y, z);
        assertEquals(e, a, "The side length of the cube is incorrect.");
    }

    @Test
    public void testGetRectangularPrismSolidDiagonal() {
        double x = 25.0;
        double y = 10.0;
        double z = 15.0;
        double e = 30.822070014844883;
        double a = ThreeDimensionalShapes.RectangularPrism.getSolidDiagonal(x, y, z);
        assertEquals(e, a, "The side length of the cube is incorrect.");
    }


    @Test
    public void testGetSphereSurfaceArea() {
        double x = 10.0;
        double e = 1256.6370614359173;
        double a = ThreeDimensionalShapes.Sphere.getSurfaceArea(x);
        assertEquals(e, a, "The surface area of the sphere is incorrect.");
    }

    @Test
    public void testGetSphereDiameterFromRadius() {
        double x = 10.0;
        double e = 20.0;
        double a = ThreeDimensionalShapes.Sphere.getDiameterFromRadius(x);
        assertEquals(e, a, "The diameter of the sphere is incorrect.");
    }

    @Test
    public void testGetSphereRadiusFromDiameter() {
        double x = 20;
        double e = 10;
        double a = ThreeDimensionalShapes.Sphere.getRadiusFromDiameter(x);
        assertEquals(e, a, "The radius of the sphere is incorrect.");
    }

    @Test
    public void testGetSphereVolume() {
        double x = 10.0;
        double e = 4188.790204786391;
        double a = ThreeDimensionalShapes.Sphere.getVolume(x);
        assertEquals(e, a, "The volume of the sphere is incorrect.");
    }
}
