package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testExample1() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        assertEquals(3, binarySearch.binarysearch(arr, k));
    }

    @Test
    public void testExample2() {
        int[] arr = {11, 22, 33, 44, 55};
        int k = 445;
        assertEquals(-1, binarySearch.binarysearch(arr, k));
    }

    @Test
    public void testExample3() {
        int[] arr = {1, 1, 1, 1, 2};
        int k = 1;
        assertEquals(0, binarySearch.binarysearch(arr, k));
    }

    @Test
    public void testSingleElementArrayFound() {
        int[] arr = {5};
        int k = 5;
        assertEquals(0, binarySearch.binarysearch(arr, k));
    }

    @Test
    public void testSingleElementArrayNotFound() {
        int[] arr = {5};
        int k = 6;
        assertEquals(-1, binarySearch.binarysearch(arr, k));
    }

    @Test
    public void testLargeArray() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        assertEquals(99999, binarySearch.binarysearch(arr, 100000));
    }

    @Test
    public void testElementAtStart() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(0, binarySearch.binarysearch(arr, 1));
    }

    @Test
    public void testElementAtEnd() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(9, binarySearch.binarysearch(arr, 10));
    }

    @Test
    public void testDuplicateElements() {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 5};
        assertEquals(1, binarySearch.binarysearch(arr, 2)); // Should return first occurrence
    }

    @Test
    public void testElementNotFound() {
        int[] arr = {53, 57, 100};
        assertEquals(-1, binarySearch.binarysearch(arr, 6));
    }
} 