package arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MissingAndRepeatingTwoMathEquationsTest {
    private MissingAndRepeatingTwoMathEquations solution = new MissingAndRepeatingTwoMathEquations();

    @Test
    public void testExample1() {
        int[] arr = {2, 2};
        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(2, result.get(0), "Repeating number should be 2");
        assertEquals(1, result.get(1), "Missing number should be 1");
    }

    @Test
    public void testExample2() {
        int[] arr = {1, 3, 3};
        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(3, result.get(0), "Repeating number should be 3");
        assertEquals(2, result.get(1), "Missing number should be 2");
    }

    @Test
    public void testExample3() {
        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(1, result.get(0), "Repeating number should be 1");
        assertEquals(5, result.get(1), "Missing number should be 5");
    }

    @Test
    public void testSmallArray() {
        int[] arr = {1, 1};
        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(1, result.get(0), "Repeating number should be 1");
        assertEquals(2, result.get(1), "Missing number should be 2");
    }

    @Test
    public void testLargeArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        // Replace 50 with 51 to create a repeating number
        arr[49] = 51;

        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(51, result.get(0), "Repeating number should be 51");
        assertEquals(50, result.get(1), "Missing number should be 50");
    }

    @Test
    public void testArrayWithMissingAtEnd() {
        int[] arr = {1, 2, 3, 4, 5, 5};
        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(5, result.get(0), "Repeating number should be 5");
        assertEquals(6, result.get(1), "Missing number should be 6");
    }

    @Test
    public void testArrayWithMissingAtStart() {
        int[] arr = {2, 3, 4, 5, 6, 6};
        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(6, result.get(0), "Repeating number should be 6");
        assertEquals(1, result.get(1), "Missing number should be 1");
    }

    @Test
    public void testCustomArray() {
        int[] arr = {2, 3, 1, 4, 8, 6, 4, 5};
        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(4, result.get(0), "Repeating number should be 4");
        assertEquals(7, result.get(1), "Missing number should be 7");
    }

    @Test
    public void testVeryLargeArray() {
        // Create array with size close to 10^6
        int size = 1_000_000;
        int[] arr = new int[size];
        
        // Fill array with numbers from 1 to size
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        
        // Replace number 500000 with 500001 to create a repeating number
        arr[499999] = 500001;
        
        ArrayList<Integer> result = solution.findTwoElement(arr);
        assertEquals(500001, result.get(0), "Repeating number should be 500001");
        assertEquals(500000, result.get(1), "Missing number should be 500000");
    }
}