package arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
public class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        return binarysearch(arr, 0, arr.length, k);
    }

    private int binarysearch(int[] arr, int startIndex, int endIndex, int k) {
        int middleElemIndex = startIndex + ((endIndex - startIndex) / 2);
        if (middleElemIndex >= arr.length) {
            return -1;
        }

        if (startIndex == endIndex && startIndex == middleElemIndex && arr[middleElemIndex] != k) {
            return -1;
        }

        int elem = arr[middleElemIndex];
        if (elem == k) {
            while (middleElemIndex > 0 && arr[middleElemIndex-1] == k ) {
                middleElemIndex--;
            }
            return middleElemIndex;
        } else if (elem < k) {
            return binarysearch(arr, middleElemIndex+1, endIndex, k);
        } else {
            return binarysearch(arr, startIndex, middleElemIndex, k);
        }
    }
}
