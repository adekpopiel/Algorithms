package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckEqualArraysTest {

    @Test
    void testEqualArraysWithDifferentOrder() {
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};
        assertTrue(CheckEqualArrays.checkEqual(a, b));
    }

    @Test
    void testDifferentArrays() {
        int[] a = {1, 2, 5};
        int[] b = {2, 4, 15};
        assertFalse(CheckEqualArrays.checkEqual(a, b));
    }

    @Test
    void testArraysWithDuplicates() {
        int[] a = {1, 2, 2, 3, 3, 3};
        int[] b = {3, 2, 1, 3, 2, 3};
        assertTrue(CheckEqualArrays.checkEqual(a, b));
    }

    @Test
    void testArraysWithDifferentDuplicates() {
        int[] a = {1, 2, 2, 3, 3};
        int[] b = {1, 2, 3, 3, 3};
        assertFalse(CheckEqualArrays.checkEqual(a, b));
    }

    @Test
    void testEmptyArrays() {
        int[] a = {};
        int[] b = {};
        assertTrue(CheckEqualArrays.checkEqual(a, b));
    }

    @Test
    void testSingleElementArrays() {
        int[] a = {1};
        int[] b = {1};
        assertTrue(CheckEqualArrays.checkEqual(a, b));
    }

    @Test
    void testArraysWithMaxValues() {
        int[] a = {Integer.MAX_VALUE, 1, 2};
        int[] b = {1, Integer.MAX_VALUE, 2};
        assertTrue(CheckEqualArrays.checkEqual(a, b));
    }

    @Test
    void testArraysWithZeroValues() {
        int[] a = {0, 0, 0};
        int[] b = {0, 0, 0};
        assertTrue(CheckEqualArrays.checkEqual(a, b));
    }

    @Test
    void testArraysWithDifferentSizes() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2};
        assertFalse(CheckEqualArrays.checkEqual(a, b));
    }
}