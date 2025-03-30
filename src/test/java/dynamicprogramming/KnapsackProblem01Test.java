package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackProblem01Test {

    @Test
    public void testCase1() {
        int W = 4;
        int[] val = {1, 2, 3};
        int wt[] = {4, 5, 1};

        int result = KnapsackProblem01.knapsack(W, val, wt);

        assertEquals(3, result);
    }

    @Test
    public void testCase2() {
        int W = 5;
        int[] val = {10, 40, 30, 50};
        int wt[] = {5, 4, 2, 3};

        int result = KnapsackProblem01.knapsack(W, val, wt);

        assertEquals(80, result);
    }

    @Test
    public void testCase3() {
        int W = 4;
        int[] val = {6, 3, 8, 6, 9, 8, 2, 4, 10, 9};
        int wt[] = {2, 1, 3, 1, 4, 1, 2, 2, 5, 7};

        int result = KnapsackProblem01.knapsack(W, val, wt);

        assertEquals(20, result);
    }

}