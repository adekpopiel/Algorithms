package prefixsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayOf0sAnd1sTest {

    @Test
    public void testCase1() {
        int[] arr = {1, 0, 1, 1, 1, 0, 0};

        LongestSubarrayOf0sAnd1s toTest = new LongestSubarrayOf0sAnd1s();

        int result = toTest.maxLen(arr);

        assertEquals(6, result);
    }

    @Test
    public void testCase2() {
        int[] arr = {0, 0, 1, 1, 0};

        LongestSubarrayOf0sAnd1s toTest = new LongestSubarrayOf0sAnd1s();

        int result = toTest.maxLen(arr);

        assertEquals(4, result);
    }

    @Test
    public void testCase3() {
        int[] arr = {0};

        LongestSubarrayOf0sAnd1s toTest = new LongestSubarrayOf0sAnd1s();

        int result = toTest.maxLen(arr);

        assertEquals(0, result);
    }

}