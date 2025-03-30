package backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://www.geeksforgeeks.org/problems/word-search/1
class WordSearchTest {

    @Test
    public void testGeek() {
        char[][] mat = {{'T', 'E', 'E'}, {'S', 'G', 'K'}, {'T', 'E', 'L'}};
        String word = "GEEK";

        boolean result = WordSearch.isWordExist(mat, word);

        assertTrue(result);
    }

    @Test
    public void testNoGeek() {
        char[][] mat = {{'T', 'E', 'U'}, {'S', 'G', 'K'}, {'T', 'E', 'L'}};

        String word = "GEEK";

        boolean result = WordSearch.isWordExist(mat, word);

        assertFalse(result);
    }

    @Test
    public void testSee() {
        char[][] mat = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";

        boolean result = WordSearch.isWordExist(mat, word);

        assertTrue(result);
    }
}