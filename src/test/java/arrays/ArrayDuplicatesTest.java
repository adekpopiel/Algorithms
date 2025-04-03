 package arrays;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ArrayDuplicatesTest {

    private final ArrayDuplicates arrayDuplicates = new ArrayDuplicates();

    @Test
    void testArrayWithMultipleDuplicates() {
        // Test case 1: Array with multiple duplicates
        // Input: [2, 3, 1, 2, 3]
        // Expected: [2, 3]
        int[] input = {2, 3, 1, 2, 3};
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> result = arrayDuplicates.findDuplicates(input);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithNoDuplicates() {
        // Test case 2: Array with no duplicates
        // Input: [0, 3, 1, 2]
        // Expected: []
        int[] input = {0, 3, 1, 2};
        List<Integer> expected = Arrays.asList();
        List<Integer> result = arrayDuplicates.findDuplicates(input);
        assertEquals(expected, result);
    }

    @Test
    void testSingleElementArray() {
        // Test case 3: Array with single element
        // Input: [2]
        // Expected: []
        int[] input = {2};
        List<Integer> expected = Arrays.asList();
        List<Integer> result = arrayDuplicates.findDuplicates(input);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyArray() {
        // Test case 4: Empty array
        // Input: []
        // Expected: []
        int[] input = {};
        List<Integer> expected = Arrays.asList();
        List<Integer> result = arrayDuplicates.findDuplicates(input);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithAllSameElements() {
        // Test case 5: Array with all same elements
        // Input: [1, 1, 1, 1]
        // Expected: [1]
        int[] input = {1, 1, 1, 1};
        List<Integer> expected = Arrays.asList(1);
        List<Integer> result = arrayDuplicates.findDuplicates(input);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithMaxValue() {
        // Test case 6: Array with maximum allowed value (106)
        // Input: [106, 106, 1, 2]
        // Expected: [106]
        int[] input = {106, 106, 1, 2};
        List<Integer> expected = Arrays.asList(106);
        List<Integer> result = arrayDuplicates.findDuplicates(input);
        assertEquals(expected, result);
    }
}