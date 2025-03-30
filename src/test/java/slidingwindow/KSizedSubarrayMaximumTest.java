package slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KSizedSubarrayMaximumTest {

    @Test
    public void testCase1() {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        KSizedSubarrayMaximum toTest = new KSizedSubarrayMaximum();
        ArrayList<Integer> result = toTest.maxOfSubarrays(arr, k);

        int[] expected = {3, 3, 4, 5, 5, 5, 6 };
        assertArrayEquals(expected, result.stream().mapToInt(i -> i).toArray());
    }
}