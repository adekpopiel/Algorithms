package twopointer;

import java.util.Arrays;

public class TwoPointerSumLessThanTarget {
    public int countPairs(int arr[], int target) {
        int result = 0;
        if (arr.length != 1) {
            Arrays.sort(arr);

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum >= target) {
                    right--;
                } else {
                    result = result + (right - left);
                    left++;
                }
            }
        }
    return result;
    }
}
