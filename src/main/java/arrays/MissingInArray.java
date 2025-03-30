package arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays&sortBy=submissions
public class MissingInArray {
    int missingNumber(int arr[]) {
        int result = -1;
        Arrays.sort(arr);
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i-1] != i) {
                return i;
            }
        }
        return arr.length+1;
    }

}
