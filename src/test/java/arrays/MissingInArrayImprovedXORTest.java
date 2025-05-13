package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingInArrayImprovedXORTest {

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 5};
        int expected = 4;

        MissingInArrayImprovedXOR toTest = new MissingInArrayImprovedXOR();
        int result = toTest.missingNum(arr);

        assertEquals(expected, result);
    }

    @Test
    public void unsortedArray() {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int expected = 6;

        MissingInArrayImprovedXOR toTest = new MissingInArrayImprovedXOR();
        int result = toTest.missingNum(arr);

        assertEquals(expected, result);
    }

    @Test
    public void singleElementArray() {
        int[] arr = {1};
        int expected = 2;

        MissingInArrayImprovedXOR toTest = new MissingInArrayImprovedXOR();
        int result = toTest.missingNum(arr);

        assertEquals(expected, result);
    }

    @Test
    public void missingFirstElement() {
        int[] arr = {2, 3, 4, 5};
        int expected = 1;

        MissingInArrayImprovedXOR toTest = new MissingInArrayImprovedXOR();
        int result = toTest.missingNum(arr);

        assertEquals(expected, result);
    }

    @Test
    public void missingLastElement() {
        int[] arr = {1, 2, 3, 4};
        int expected = 5;

        MissingInArrayImprovedXOR toTest = new MissingInArrayImprovedXOR();
        int result = toTest.missingNum(arr);

        assertEquals(expected, result);
    }

    @Test
    public void largeArray() {
        int[] arr = new int[999999];
        for (int i = 0; i < 500000; i++) {
            arr[i] = i + 1;
        }
        for (int i = 500000; i < 999999; i++) {
            arr[i] = i + 2;
        }
        int expected = 500001;

        MissingInArrayImprovedXOR toTest = new MissingInArrayImprovedXOR();
        int result = toTest.missingNum(arr);

        assertEquals(expected, result);
    }

    @Test
    public void missingMiddleElement() {
        int[] arr = {1, 2, 4, 5, 6};
        int expected = 3;

        MissingInArrayImprovedXOR toTest = new MissingInArrayImprovedXOR();
        int result = toTest.missingNum(arr);

        assertEquals(expected, result);
    }
}