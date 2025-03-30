package twopointer;

public class ContainerWithMostWater {
    public int maxWater(int arr[]) {
        int left = 0;
        int right = arr.length-1;

        int result = 0;

        while (left < right) {
            int distance = right - left;
            int base = Math.min(arr[left], arr[right]);

            int total = distance * base;

            if (total > result) {
                result = total;
            }
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
