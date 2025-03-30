package prefixsum;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public int longestSubarray(int[] arr, int k) {
        int result = 0;
        HashMap<Integer, Integer> prefSums = new HashMap<>();
        int currSum = 0;

        for(int i = 0; i<arr.length; i++) {
            currSum += arr[i];
            if (currSum - k == 0) {
                if (result < i+1) {
                    result = i+1;
                }
            } else if (prefSums.containsKey(currSum - k)){
                if (result < i - prefSums.get(currSum - k)) {
                    result = i - prefSums.get(currSum - k);
                }
            }
            if (!prefSums.containsKey(currSum)) {
                prefSums.put(currSum, i);
            }
        }
        return result;
    }
}
