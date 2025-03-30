package prefixsum;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWIthAGivenSum {

    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        int currSum = 0;

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length && result.isEmpty(); i++) {
            currSum = currSum + arr[i];
            if (currSum - target == 0) {
                result.add(1);
                result.add(i+1);
            } else if (prefixSums.containsKey(currSum - target)) {
                result.add(prefixSums.get(currSum - target) + 1);
                result.add(i+1);
            } else if (!prefixSums.containsKey(currSum)){
                prefixSums.put(currSum, i+1);
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }


}
