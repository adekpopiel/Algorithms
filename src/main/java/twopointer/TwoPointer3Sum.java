package twopointer;

public class TwoPointer3Sum {
    public int countTriplets(int[] arr, int target) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {

            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int tripletSum = arr[i] + arr[left] + arr[right];
                if (tripletSum == target) {
                    int elem1 = arr[left];
                    int elem2 = arr[right];
                    int count1 = 0;
                    int count2 = 0;
                    while (left <= right && elem1 == arr[left]) {
                        left++;
                        count1++;
                    }

                    while(left <= right && elem2 == arr[right]) {
                        right--;
                        count2++;
                    }

                    if (elem1 == elem2) {
                        result = result + (count1 * (count1-1) / 2);
                    } else {
                        result = result + (count1*count2);
                    }
                } else if (tripletSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
