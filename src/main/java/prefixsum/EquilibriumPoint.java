package prefixsum;

import java.util.Arrays;

public class EquilibriumPoint {
    public static int findEquilibrium(int arr[]) {
        int prefSum = 0;
        int total = 0;

        total = Arrays.stream(arr).sum();

        int suffixSum = 0;
        for (int pivot = 0; pivot < arr.length; pivot++) {
            suffixSum = total - arr[pivot] - prefSum;

            if (suffixSum == prefSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }
        return -1;
    }
}
