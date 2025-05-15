package arrays;

/**
 *
 * The idea is to keep track of the largest and second largest element while traversing the array.
 * Initialize largest and secondLargest with -1.
 *
 * Now, for any index i,
 *
 * If arr[i] > largest, update secondLargest with largest and largest with arr[i].
 * Else If arr[i] < largest and arr[i] > secondLargest, update secondLargest with arr[i].
 *
 */

public class SecondLargestOnePassSearch {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int secondMax = -1;


        for (int i = 0;i<arr.length;i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
    return secondMax;
    }
}
