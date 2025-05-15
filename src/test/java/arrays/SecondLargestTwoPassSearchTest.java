package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondLargestTwoPassSearchTest {

    @Test
    public void testRandomArray() {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int expected = 34;

        SecondLargestTwoPassSearch toTest = new SecondLargestTwoPassSearch();
        int result = toTest.getSecondLargest(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] arr = {10, 5, 10};
        int expected = 5;

        SecondLargestTwoPassSearch toTest = new SecondLargestTwoPassSearch();
        int result = toTest.getSecondLargest(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testArrayWithSameElements() {
        int[] arr = {10, 10, 10};
        int expected = -1;

        SecondLargestTwoPassSearch toTest = new SecondLargestTwoPassSearch();
        int result = toTest.getSecondLargest(arr);

        assertEquals(expected, result);
    }
}