package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//TODO Optimise: https://www.geeksforgeeks.org/2-sum-pair-sum-closest-to-target/
public class PairClosestToTarget {
    public List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        if (arr.length == 1) {
            return result;
        } else {
            Arrays.sort(arr);
            int left = 0;
            int right = arr.length - 1;

            int candidateSum = arr[left] + arr[right];
            result = Arrays.asList(arr[left], arr[right]);
            while (left < right && candidateSum != target) {
                if (candidateSum < target) {
                    left++;
                } else if (candidateSum > target) {
                    right--;
                }
                if (left == right) {
                    break;
                }
                candidateSum = arr[left] + arr[right];

                int oldDifference = Math.abs((result.get(0)+result.get(1)) - target);
                int currentDifference = Math.abs(candidateSum - target);
                if (oldDifference > currentDifference) {
                    result = Arrays.asList(arr[left], arr[right]);
                } else if (oldDifference == currentDifference) {
                    int absOldResult = Math.abs(result.get(0) - result.get(1));
                    int absNewResult = Math.abs(arr[left] - arr[right]);
                    if (absNewResult > absOldResult) {
                        result = Arrays.asList(arr[left], arr[right]);
                    }
                }
            }
        }
    return result;
    }
}
