package prefixsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubArrayWithSumKTest {

    @Test
    public void testCase1() {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;

        LongestSubArrayWithSumK toTest = new LongestSubArrayWithSumK();
        int result = toTest.longestSubarray(arr, k);

        assertEquals(6, result);
    }

    @Test
    public void testCase2() {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        int k = -5;

        LongestSubArrayWithSumK toTest = new LongestSubArrayWithSumK();
        int result = toTest.longestSubarray(arr, k);

        assertEquals(5, result);
    }

    @Test
    public void testNoSubarray() {
        int[] arr = {10, -10, 20, 30};
        int k = 5;

        LongestSubArrayWithSumK toTest = new LongestSubArrayWithSumK();
        int result = toTest.longestSubarray(arr, k);

        assertEquals(0, result);
    }

    @Test
    public void testCase3() {
        int[] arr = {94, -33, -13, 40, -82, 94, -33, -13, 40, -82};
        int k = 52;

        LongestSubArrayWithSumK toTest = new LongestSubArrayWithSumK();
        int result = toTest.longestSubarray(arr, k);

        assertEquals(3, result);
    }

}