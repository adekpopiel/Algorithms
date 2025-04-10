package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
public class MissingAndRepeating {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        int[] occurences = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            occurences[arr[i]-1]++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int missing = -1;
        int repeating = -1;
        for (int i = 0; i < occurences.length; i++) {
            if (occurences[i] > 1) {
                repeating = i + 1;
            }
            if (occurences[i] == 0) {
                missing = i + 1;
            }
        }
        result.add(repeating);
        result.add(missing);

        return result;
    }
}
