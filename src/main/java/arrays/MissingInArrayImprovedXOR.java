package arrays;

/**
*  XOR of a number with itself is 0 i.e. x ^ x = 0 and the given array arr[] has numbers in range [1, n].
 * This means that the result of XOR of first n natural numbers with the XOR of all the array elements will be the missing number.
 * To do so, calculate XOR of first n natural numbers and XOR of all the array arr[] elements, and then our result will be the XOR of both the resultant values.
 */
public class MissingInArrayImprovedXOR {
    int missingNum(int arr[]) {
        int xor1 = 0;
        for (int i = 1; i<=arr.length+1; i++) {
            xor1 ^= i;
        }

        int xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        int result = xor1 ^ xor2;
        return result;
    }
}
