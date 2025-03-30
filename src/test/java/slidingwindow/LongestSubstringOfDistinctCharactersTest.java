package slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringOfDistinctCharactersTest {

    @Test
    public void testRegularString() {
        String s = "geeksforgeeks";

        LongestSubstringOfDistinctCharacters toTest = new LongestSubstringOfDistinctCharacters();
        int result = toTest.longestUniqueSubstr(s);

        assertEquals(7, result);
    }

    @Test
    public void testLongString() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaavfgs";
        LongestSubstringOfDistinctCharacters toTest = new LongestSubstringOfDistinctCharacters();
        int result = toTest.longestUniqueSubstr(s);

        assertEquals(5, result);
    }

    @Test
    public void testDistinctString() {
        String s = "aaa";

        LongestSubstringOfDistinctCharacters toTest = new LongestSubstringOfDistinctCharacters();
        int result = toTest.longestUniqueSubstr(s);

        assertEquals(1, result);
    }

    @Test
    public void longerString() {
        String s = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs";

        LongestSubstringOfDistinctCharacters toTest = new LongestSubstringOfDistinctCharacters();
        int result = toTest.longestUniqueSubstr(s);

        assertEquals(10, result);
    }


    @Test
    public void longStringFromAFile() {
        Scanner sc = new Scanner(getClass().getClassLoader().getResourceAsStream("longestDistinctStringTest1.txt"));
        String s = sc.next();

        LongestSubstringOfDistinctCharacters toTest = new LongestSubstringOfDistinctCharacters();
        int result = toTest.longestUniqueSubstr(s);

        assertEquals(20, result);
    }

    @Test
    public void distinctString() {
        String s = "yid";

        LongestSubstringOfDistinctCharacters toTest = new LongestSubstringOfDistinctCharacters();
        int result = toTest.longestUniqueSubstr(s);

        assertEquals(3, result);
    }
}