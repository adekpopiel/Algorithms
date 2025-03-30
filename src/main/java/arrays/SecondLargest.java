package arrays;

import java.util.Arrays;
import java.util.Comparator;

//https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays&sortBy=submissions
public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int result = -1;
        int currentMax = arr[arr.length-1];
        for (int i = arr.length-2; i>=0; i--) {
            if (arr[i] != currentMax) {
                result = arr[i];
                break;
            }
        }
        return result;
    }
}
