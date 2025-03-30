package dynamicprogramming;

class StockBuyAndSell {
    static int maxProfit(int prices[], int k) {
        if (k == 0) return 0;
        
        int[][][] dp = new int[prices.length][k + 1][2];
        
        // Initialize for day 0
        dp[0][0][0] = 0;  // No transactions, no stock - profit is 0
        dp[0][0][1] = -prices[0];  // No transactions, holding stock - cost of buying
        
        // Initialize for j > 0 on day 0
        for (int j = 1; j <= k; j++) {
            dp[0][j][0] = 0;  // j transactions, no stock - not possible on day 0, so profit is 0
            dp[0][j][1] = -prices[0];  // j transactions, holding stock - can only buy first stock
        }
        
        for (int i = 1; i < prices.length; i++) {
            dp[i][0][0] = 0;
            dp[i][0][1] = Math.max(dp[i-1][0][1], -prices[i]);
            for (int j = 1; j <= k; j++) {
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][k][0]; 
    }
}