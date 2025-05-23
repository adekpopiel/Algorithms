package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The idea is to use mathematical equations based on the sum and sum of squares of numbers from 1 to n.
 * The difference between expected and actual sums will give us one equation, and the difference between expected and actual sum of squares will give us another equation.
 * Solving these equations yields our missing and repeating numbers.
 */
public class MissingAndRepeatingTwoMathEquations {
    public ArrayList<Integer> findTwoElement(int arr[]) {
        long n = arr.length;
        long expectedSum = (n*(n+1))/2;
        long expectedSumOfSquares = (n*(n+1)*(2*n+1))/6;

        long actualSum = 0;
        long actualSumOfSquares = 0;

        for (int i = 0; i<arr.length; i++) {
            actualSum += arr[i];
            actualSumOfSquares += (long) Math.pow(arr[i], 2);
        }

        long diffSum = expectedSum - actualSum;
        long diffSumOfSquares = expectedSumOfSquares - actualSumOfSquares;

        long repeating = (diffSumOfSquares - (long) Math.pow(diffSum, 2)) / (2*diffSum);
        long missing = diffSum + repeating;

        return new ArrayList<>(Arrays.asList((int)repeating, (int) missing));
    }
}
