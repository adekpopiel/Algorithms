package hashing;

import java.util.HashMap;

public class GoodArray {
    public int goodArray(int[] arr, int k) {
        HashMap<Integer, Integer> s = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (s.containsKey(arr[i] ^ k)) {
                s.remove(arr[i]^k);
            } else if (s.containsKey(arr[i])) {
                s.put(arr[i], s.get(arr[i]) + 1);
            } else {
                s.put(arr[i], 1);
            }
        }

        return s.values().stream().mapToInt(Integer::intValue).sum();
    }


}
