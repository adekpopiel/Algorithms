package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubsequenceTest {

    @Test
    public void testCase1() {
        String s = "bbabcbcab";

        LongestPalindromicSubsequence toTest = new LongestPalindromicSubsequence();
        int result = toTest.longestPalinSubseq(s);

        assertEquals(7, result);
    }

    @Test
    public void testCase2() {
        String s = "abcd";

        LongestPalindromicSubsequence toTest = new LongestPalindromicSubsequence();
        int result = toTest.longestPalinSubseq(s);

        assertEquals(1, result);
    }

    @Test
    public void testCase3() {
        String s = "agbdba";

        LongestPalindromicSubsequence toTest = new LongestPalindromicSubsequence();
        int result = toTest.longestPalinSubseq(s);

        assertEquals(5, result);
    }
}