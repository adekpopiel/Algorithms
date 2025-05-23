package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
public class ArrayDuplicatesHashMap {
    public List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0;i<arr.length;i++) {
            if (hm.containsKey(arr[i])) {
                Integer value = hm.get(arr[i]);
                value++;
                hm.put(arr[i], value);
            } else {
                hm.put(arr[i], 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        hm.forEach( (key, value) -> {
            if (value > 1) {
                result.add(key);
            }
        });
        return result;
    }
}
