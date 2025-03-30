package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class ArrayLeadersTest {

    @Test
    void testLeadersWithMixedValues() {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> expected = Arrays.asList(17, 5, 2);
        assertEquals(expected, ArrayLeaders.leaders(arr));
    }

    @Test
    void testLeadersWithEqualElements() {
        int[] arr = {10, 4, 2, 4, 1};
        List<Integer> expected = Arrays.asList(10, 4, 4, 1);
        assertEquals(expected, ArrayLeaders.leaders(arr));
    }

    @Test
    void testLeadersWithIncreasingOrder() {
        int[] arr = {5, 10, 20, 40};
        List<Integer> expected = Arrays.asList(40);
        assertEquals(expected, ArrayLeaders.leaders(arr));
    }

    @Test
    void testLeadersWithNonIncreasingOrder() {
        int[] arr = {30, 10, 10, 5};
        List<Integer> expected = Arrays.asList(30, 10, 10, 5);
        assertEquals(expected, ArrayLeaders.leaders(arr));
    }

    @Test
    void testLeadersWithSingleElement() {
        int[] arr = {5};
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, ArrayLeaders.leaders(arr));
    }

    @Test
    void testLeadersWithAllEqualElements() {
        int[] arr = {5, 5, 5, 5};
        List<Integer> expected = Arrays.asList(5, 5, 5, 5);
        assertEquals(expected, ArrayLeaders.leaders(arr));
    }
} 