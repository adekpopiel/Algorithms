package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeSubStringsTest {

    @Test
    public void testCase1() {
        String s = "abaab";

        PalindromeSubStrings toTest = new PalindromeSubStrings();
        int result = toTest.countPS(s);

        assertEquals(3, result);
    }


    @Test
    public void testCase2() {
        String s = "aaa";

        PalindromeSubStrings toTest = new PalindromeSubStrings();
        int result = toTest.countPS(s);

        assertEquals(3, result);
    }

    @Test
    public void testCase3() {
        String s = "abbaeae";

        PalindromeSubStrings toTest = new PalindromeSubStrings();
        int result = toTest.countPS(s);

        assertEquals(4, result);
    }
}