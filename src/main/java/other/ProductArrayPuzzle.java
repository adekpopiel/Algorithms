package other;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int arr[]) {
        int product = 1;
        int zeros = 0;
        int idZero = -1;

        for (int i = 0; i<arr.length;i++) {
            if (arr[i] == 0) {
                zeros++;
                idZero = i;
            } else {
                product *= arr[i];
            }
        }

        int[] result = new int[arr.length];
        Arrays.fill(result, 0);

        if (zeros == 0) {
            for (int i = 0; i<result.length; i++) {
                result[i] = product / arr[i];
            }
        } else if (zeros == 1) {
            result[idZero] = product;
        }
    return result;
    }
}
