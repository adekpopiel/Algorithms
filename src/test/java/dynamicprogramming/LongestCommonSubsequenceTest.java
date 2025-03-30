package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    @Test
    public void testCase1() {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        int result = LongestCommonSubsequence.lcs(s1, s2);

        assertEquals(3, result);
    }

    @Test
    public void testCase2() {
        String s1 = "ABC";
        String s2 = "AC";

        int result = LongestCommonSubsequence.lcs(s1, s2);

        assertEquals(2, result);
    }

    @Test
    public void testCase3() {
        String s1 = "XYZW";
        String s2 = "XYWZ";

        int result = LongestCommonSubsequence.lcs(s1, s2);

        assertEquals(3, result);
    }

    @Test
    public void testCasePalindrome() {
        String s1 = "bbabcbcab";
        String s2 = new StringBuilder(s1).reverse().toString();

        int result = LongestCommonSubsequence.lcs(s1, s2);

        assertEquals(7, result);
    }

}