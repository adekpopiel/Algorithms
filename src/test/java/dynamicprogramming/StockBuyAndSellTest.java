package dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockBuyAndSellTest {
   
   @Test
    void testCase1() {
        int[] prices = {10, 22, 5, 80};
        int k = 2;
        assertEquals(87, StockBuyAndSell.maxProfit(prices, k));
    }

    @Test
    void testCase2() {
        int[] prices = {20, 580, 420, 900};
        int k = 3;
        assertEquals(1040, StockBuyAndSell.maxProfit(prices, k));
    }

    @Test
    void testCase3() {
        int[] prices = {100, 90, 80, 50, 25};
        int k = 1;
        assertEquals(0, StockBuyAndSell.maxProfit(prices, k));
    }
}