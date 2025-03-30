package prefixsum;

import java.util.HashMap;

public class LongestSubarrayOf0sAnd1s {
    public int maxLen(int[] arr) {
        HashMap<Integer, Integer> prefSums = new HashMap<>();
        int currSum = 0;
        int result = 0;

        for (int i = 0;i<arr.length;i++) {
            currSum += arr[i] == 0 ? -1 : 1;
            if (currSum == 0) {
                result = i+1;
            }

            if (prefSums.containsKey(currSum)) {
                result = Math.max(result, i - prefSums.get(currSum));
            } else {
                prefSums.put(currSum, i);
            }
        }
    return result;
    }
}
