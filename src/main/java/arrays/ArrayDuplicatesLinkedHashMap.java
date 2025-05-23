package arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
public class ArrayDuplicatesLinkedHashMap {
    public List<Integer> findDuplicates(int[] arr) {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        for (int i = 0;i<arr.length;i++) {
            if (lhm.containsKey(arr[i])) {
                Integer value = lhm.get(arr[i]);
                value++;
                lhm.put(arr[i], value);
            } else {
                lhm.put(arr[i], 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        lhm.forEach( (key, value) -> {
            if (value > 1) {
                result.add(key);
            }
        });
        return result;
    }
}
