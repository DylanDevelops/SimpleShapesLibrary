package com.dylandevelops.simpleshapes;

import org.junit.jupiter.api.Test;

import io.github.dylandevelops.simpleshapes.ThreeDimensionalShapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeDimensionalShapesTests {
    // Cube
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

    // Rectangular Prism
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

    // Sphere
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

    // Pyramid
    @Test
    public void testGetPyramidVolume() {
        double x = 10.0;
        double y = 20.0;
        double z = 30.0;
        double e = 2000.0;
        double a = ThreeDimensionalShapes.Pyramid.getVolume(x, y, z);
        assertEquals(e, a, "The volume of the pyramid is incorrect.");
    }

    @Test
    public void testGetPyramidBaseArea() {
        double x = 10.0;
        double y = 20.0;
        double e = 200.0;
        double a = ThreeDimensionalShapes.Pyramid.getBaseArea(x, y);
        assertEquals(e, a, "The base area of the pyramid is incorrect.");
    }

    @Test
    public void testGetPyramidSurfaceArea() {
        double x = 10.0;
        double y = 20.0;
        double z = 30.0;
        double e = 1124.5040190466598;
        double a = ThreeDimensionalShapes.Pyramid.getSurfaceArea(x, y, z);
        assertEquals(e, a, "The surface area of the pyramid is incorrect.");
    }

    @Test
    public void testGetPyramidLateralSufaceArea() {
        double x = 10.0;
        double y = 20.0;
        double z = 30.0;
        double e = 924.5040190466599;
        double a = ThreeDimensionalShapes.Pyramid.getLateralSurfaceArea(x, y, z);
        assertEquals(e, a, "The lateral surface area is incorrect.");
    }

    // Cone
    @Test
    public void testGetConeVolume() {
        double x = 10.0;
        double y = 30.0;
        double e = 3141.5926535897934;
        double a = ThreeDimensionalShapes.Cone.getVolume(x, y);
        assertEquals(e, a, "The volume of the cone is incorrect.");
    }

    @Test
    public void testGetConeBaseArea() {
        double x = 10.0;
        double e = 314.1592653589793;
        double a = ThreeDimensionalShapes.Cone.getBaseArea(x);
        assertEquals(e, a, "The base are of the cone is incorrect.");
    }

    @Test
    public void testGetSurfaceArea() {
        double x = 10.0;
        double y = 20.0;
        double e = 1016.640738463052;
        double a = ThreeDimensionalShapes.Cone.getSurfaceArea(x, y);
        assertEquals(e, a, "The surface area of the cone is incorrect.");
    }

    @Test
    public void testGetLateralSurfaceArea() {
        double x = 10.0;
        double y = 20.0;
        double e = 702.4814731040726;
        double a = ThreeDimensionalShapes.Cone.getLateralSurfaceArea(x, y);
        assertEquals(e, a, "The lateral surface area of the cone is incorrect.");
    }

    // Triangular Prism
    @Test
    public void testGetTriangularPrismVolume() {
        double x = 10.0;
        double y = 15.0;
        double z = 20.0;
        double xX = 30.0;
        double e = 2178.5531322416723;
        double a = ThreeDimensionalShapes.TriangularPrism.getVolume(x, y, z, xX);
        assertEquals(e, a, "The volume of the triangular prism is incorrect.");
    }

    @Test
    public void testGetTriangularPrismBaseArea() {
        double x = 40.0;
        double y = 20.0;
        double z = 30.0;
        double e = 290.4737509655563;
        double a = ThreeDimensionalShapes.TriangularPrism.getBaseArea(x, y, z);
        assertEquals(e, a, "The base area of the triangular prism is incorrect.");
    }

    @Test
    public void testGetTriangularPrismLateralSurfaceArea() {
        double x = 10.0;
        double y = 15.0;
        double z = 20.0;
        double xX = 30.0;
        double e = 1350.0;
        double a = ThreeDimensionalShapes.TriangularPrism.getLateralSurfaceArea(x, y, z, xX);
        assertEquals(e, a, "The lateral surface area of the triangular prism is incorrect.");
    }
}
