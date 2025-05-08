package arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions

public class UnionOfArraysWithDuplicates {
    public static int findUnion(int a[], int b[]) {
        Set<Integer> aElems = Arrays.stream(a).boxed().collect(Collectors.toSet());
        int result = aElems.size();

        for (int i = 0; i < b.length; i++) {
            if (!aElems.contains(b[i])) {
                result++;
                aElems.add(b[i]);
            }
        }
        return result;
    }
}
