package prefixsum;

import java.util.HashMap;

public class SubarraysXor {
    public long subarrayXor(int arr[], int k) {
        int prefXor = 0;
        long result = 0L;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i<arr.length; i++) {
            prefXor = prefXor ^ arr[i];

            if (hashMap.containsKey(prefXor ^ k)) {
                result = result + hashMap.get(prefXor ^ k);
            } if (prefXor == k) {
                result++;
            }

            if (hashMap.containsKey(prefXor)){
                hashMap.put(prefXor, hashMap.get(prefXor) + 1);
            } else {
                hashMap.put(prefXor, 1);
            }
        }
        return result;
    }
}