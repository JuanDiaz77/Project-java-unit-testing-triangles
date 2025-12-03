import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DemoTest {

    // -------------------------------
    // Tests existentes (válidos)
    // -------------------------------

    @Test
    void testValidTriangle() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    void testInvalidTriangle() {
        assertFalse(Demo.isTriangle(1, 2, 10));
    }

    @Test
    void testEquilateralTriangle() {
        assertTrue(Demo.isTriangle(5, 5, 5));
    }

    @Test
    void testIsoscelesTriangle() {
        assertTrue(Demo.isTriangle(5, 5, 3));
    }


    // -------------------------------
    // Nuevos tests agregados (SIN duplicados y con llaves correctas)
    // -------------------------------

    @Test
    void testDegenerateTriangleEqualSides() {
        assertFalse(Demo.isTriangle(1, 2, 3));
    }

    @Test
    void testNegativeSides() {
        assertFalse(Demo.isTriangle(-3, 4, 5));
    }

    @Test
    void testZeroSideCase1() {
        assertFalse(Demo.isTriangle(0, 5, 5));
    }

    @Test
    void testPermutationInvalidTriangle() {
        assertFalse(Demo.isTriangle(10, 2, 1));
    }

    @Test
    void testPermutationValidTriangle() {
        assertTrue(Demo.isTriangle(5, 4, 3));
    }

    @Test
    void testLargeNumbers() {
        assertTrue(Demo.isTriangle(100000, 100000, 150000));
    }

    @Test
    void testOneNegativeSide() {
        assertFalse(Demo.isTriangle(-1, 5, 5));
    }

    @Test
    void testZeroSideCase2() {
        assertFalse(Demo.isTriangle(0, 4, 4));
    }

    @Test
    void testOneSideTooLarge() {
        assertFalse(Demo.isTriangle(10, 2, 2));
    }

}
