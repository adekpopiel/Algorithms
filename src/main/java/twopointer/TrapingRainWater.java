package twopointer;

public class TrapingRainWater {
    public int maxWater(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        int lMax = arr[left];
        int rMax = arr[right];

        left++;
        right--;

        int result = 0;

        while (left <= right) {
            if (lMax > rMax) {
                if (arr[right] > rMax) {
                    rMax = arr[right];
                } else {
                    result += rMax - arr[right];
                    right--;
                }
            } else {
                if (arr[left] > lMax) {
                    lMax = arr[left];
                } else {
                    result += lMax - arr[left];
                    left++;
                }

            }
        }
        return result;
    }
}
