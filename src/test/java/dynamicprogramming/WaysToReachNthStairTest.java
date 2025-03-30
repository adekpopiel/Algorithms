package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaysToReachNthStairTest {

    @Test
    public void testCase1() {
        int n = 4;

        WaysToReachNthStair toTest = new WaysToReachNthStair();
        int result = toTest.countWays(n);

        assertEquals(5, result);
    }
}