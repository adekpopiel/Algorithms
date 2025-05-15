package arrays;

import java.util.Arrays;

/**
 *
 * The approach is to traverse the array twice.
 * In the first traversal, find the maximum element.
 * In the second traversal, find the maximum element ignoring the one we found in the first traversal.
 */
public class SecondLargestTwoPassSearch {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int secondMax = -1;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
    return secondMax;
    }
}
