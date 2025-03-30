package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInWindow {
    public ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i<k; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        result.add(hm.size());

        for (int left = 0; left< arr.length-k; left++) {
            int right = left + k;
            if (hm.get(arr[left]) == 1) {
                hm.remove(arr[left]);
            } else {
                hm.put(arr[left], hm.get(arr[left]) - 1);
            }
            if (hm.containsKey(arr[right])) {
                hm.put(arr[right], hm.get(arr[right])+1);
            } else {
                hm.put(arr[right], 1);
            }
            result.add(hm.size());
        }

        return result;
    }
}
