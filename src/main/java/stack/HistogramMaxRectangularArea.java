package stack;

import java.util.Arrays;
import java.util.Stack;

public class HistogramMaxRectangularArea {
    public static int getMaxArea(int arr[]) {
        int[] prevSmaller = prevSmaller(arr);
        int[] nextSmaller = nextSmaller(arr);

        int width = nextSmaller[0] - prevSmaller[0] - 1;
        int maxArea = arr[0] * width;

        for (int i = 1; i < arr.length; i++) {
            width = nextSmaller[i] - prevSmaller[i] - 1;
            int currentMaxArea = arr[i] * width;
            if (currentMaxArea > maxArea) {
                maxArea = currentMaxArea;
            }
        }

        return maxArea;
    }

    private static int[] nextSmaller(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.fill(result, arr.length);

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.empty() && arr[i] < arr[s.peek()]) {
                result[s.pop()] = i;
            }

            s.push(i);
        }
        return result;
    }

    private static int[] prevSmaller(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (!s.empty()) {
                result[i] = s.peek();
            }

            s.push(i);
        }
    return result;
    }
}
