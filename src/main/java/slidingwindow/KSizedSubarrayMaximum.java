package slidingwindow;

//Given an array arr[] of integers and an integer k, your task is to find the maximum value for each contiguous subarray of size k. The output should be an array of maximum values corresponding to each contiguous subarray.
//Expected solution with a deque: https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
import java.util.ArrayList;

public class KSizedSubarrayMaximum {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = k-1;
        int currentMax = -1;
        int indexOfMax = -1;
        for (int i = left; i < k; i++) {
            if (currentMax < arr[i]) {
                currentMax = arr[i];
                indexOfMax = i;
            }
        }
        result.add(currentMax);
        left++;
        right++;
        while (right < arr.length) {
            if(indexOfMax >= left && indexOfMax <= right) {
                if (currentMax < arr[right]) {
                    currentMax = arr[right];
                    indexOfMax = right;
                }
            } else {
                currentMax = -1;
                indexOfMax = -1;
                for (int j = left; j <= right; j++) {
                    if (currentMax < arr[j]) {
                        currentMax = arr[j];
                        indexOfMax = j;
                    }
                }
            }
            result.add(currentMax);
            left++;
            right++;
        }
    return result;
    }
}
