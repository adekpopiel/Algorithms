package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnionOfArraysWithDuplicatesTest {

    @Test
    void testExample1() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
        assertEquals(5, UnionOfArraysWithDuplicates.findUnion(a, b));
    }

    @Test
    void testExample2() {
        int[] a = {85, 25, 1, 32, 54, 6};
        int[] b = {85, 2};
        assertEquals(7, UnionOfArraysWithDuplicates.findUnion(a, b));
    }

    @Test
    void testExample3() {
        int[] a = {1, 2, 1, 1, 2};
        int[] b = {2, 2, 1, 2, 1};
        assertEquals(2, UnionOfArraysWithDuplicates.findUnion(a, b));
    }

    @Test
    void testEmptyArrays() {
        int[] a = {};
        int[] b = {};
        assertEquals(0, UnionOfArraysWithDuplicates.findUnion(a, b));
    }

    @Test
    void testOneEmptyArray() {
        int[] a = {1, 2, 3};
        int[] b = {};
        assertEquals(3, UnionOfArraysWithDuplicates.findUnion(a, b));
    }

    @Test
    void testAllSameElements() {
        int[] a = {1, 1, 1, 1};
        int[] b = {1, 1, 1};
        assertEquals(1, UnionOfArraysWithDuplicates.findUnion(a, b));
    }

    @Test
    void testNoCommonElements() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        assertEquals(6, UnionOfArraysWithDuplicates.findUnion(a, b));
    }

    @Test
    void testWithZero() {
        int[] a = {0, 1, 2};
        int[] b = {0, 3, 4};
        assertEquals(5, UnionOfArraysWithDuplicates.findUnion(a, b));
    }

    @Test
    void testWithMaxValue() {
        int[] a = {100000, 99999};
        int[] b = {100000, 99998};
        assertEquals(3, UnionOfArraysWithDuplicates.findUnion(a, b));
    }
} 