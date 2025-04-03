package arrays;

import java.util.*;

//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
public class ArrayDuplicates {
    public List<Integer> findDuplicates(int[] arr) {
        int[] indexCounts = new int[1000000];
        List<Integer> output = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            int elem = arr[i];
            indexCounts[elem]++;
        }
        for (int i = 0; i < indexCounts.length; i++) {
            if (indexCounts[i] > 1) {
                output.add(i);
            }
        }
        return output;
    }
}
