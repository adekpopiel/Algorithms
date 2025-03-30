package dynamicprogramming;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
public class KnapsackProblem01 {
    static int knapsack(int W, int val[], int wt[]) {
        int dp[][] = new int[val.length+1][W+1];

        Arrays.fill(dp[0], 0);

        for (int i = 1; i < dp.length;i++){
            for (int j=0;j<=W;j++) {
                if (wt[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
            }
        }
        return dp[val.length][W];
    }
}
