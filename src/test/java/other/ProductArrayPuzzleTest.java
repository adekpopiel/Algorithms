package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductArrayPuzzleTest {
    @Test
    public void testCase1() {
        int[] arr = {10, 3, 5, 6, 2};
        int[] expected = {180, 600, 360, 300, 900};

        int[] result = ProductArrayPuzzle.productExceptSelf(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testOneZero() {
        int[] arr = {12, 0, 13};
        int[] expected = {0, 156, 0};

        int[] result = ProductArrayPuzzle.productExceptSelf(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMoreThanOneZero() {
        int[] arr = {12, 0, 0};
        int[] expected = {0, 0, 0};

        int[] result = ProductArrayPuzzle.productExceptSelf(arr);

        assertArrayEquals(expected, result);
    }

}