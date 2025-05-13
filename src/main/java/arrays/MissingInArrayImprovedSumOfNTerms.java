package arrays;

import java.util.Arrays;

/**
 *
 * The sum of the first n natural numbers is given by the formula (n * (n + 1)) / 2. The idea is to compute this sum and subtract the sum of all elements in the array from it to get the missing number.
 */
public class MissingInArrayImprovedSumOfNTerms {
    int missingNum(int arr[]) {
        long n = arr.length+1;
        long sumOfNNumbers = (n * (n+1L)) / 2L;

        long result = 0L;
        for (int i = 0; i<arr.length; i++) {
            result += arr[i];
        }

        result = sumOfNNumbers - result;
        return (int) result;
    }
}
