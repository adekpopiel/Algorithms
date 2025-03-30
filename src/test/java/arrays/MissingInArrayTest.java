package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingInArrayTest {

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 5};
        int expected = 4;

        MissingInArray toTest = new MissingInArray();
        int result = toTest.missingNumber(arr);

        assertEquals(expected, result);
    }

    @Test
    public void unsortedArray() {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int expected = 6;

        MissingInArray toTest = new MissingInArray();
        int result = toTest.missingNumber(arr);

        assertEquals(expected, result);
    }

    @Test
    public void singleElementArray() {
        int[] arr = {1};
        int expected = 2;

        MissingInArray toTest = new MissingInArray();
        int result = toTest.missingNumber(arr);

        assertEquals(expected, result);
    }

}