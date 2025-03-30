package arrays;

import java.util.ArrayList;
import java.util.HashMap;

//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        int currMax = -1;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = arr.length - 1; i >=0; i--) {
            int curr = arr[i];
            if (curr >= currMax) {
                result.add(0, curr);
                currMax = curr;
            }
        }
    return result;
    }
}
