package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
public class TwoSumPairsWIth0Sum {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int prev = Integer.MIN_VALUE;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (arr.length == 0) {
            return result;
        }
        while (left < right) {
            if (arr[left] == prev) {
                left++;
                continue;
            }
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                prev = arr[left];
                left++;
                right--;
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
