package shapes.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeDimensionalShapesTests {
    @Test
    public void testSquareArea() {
        double sideLength = 5.0;
        double expectedArea = 25.0;
        double actualArea = TwoDimensionalShapes.Square.getArea(sideLength);
        assertEquals(expectedArea, actualArea, "The area of the square is incorrect.");
    }

    // TODO: ADD MORE TEST CASES
}
