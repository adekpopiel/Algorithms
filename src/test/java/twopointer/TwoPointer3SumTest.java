package twopointer;

import org.junit.jupiter.api.Test;

class TwoPointer3SumTest {

    @Test
    public void testCountTriplets() {
        int[] input = new int[]{-3, -1, -1, 0, 1, 2};
        int target = -2;

        TwoPointer3Sum testObject = new TwoPointer3Sum();
        int result = testObject.countTriplets(input, target);

        assert result == 4;
    }

    @Test
    public void testCountTripletsWithSameElementsFromRightAndLeft() {
        int[] input = new int[]{-4, 1, 1, 1, 1, 1};
        int target = -2;

        TwoPointer3Sum testObject = new TwoPointer3Sum();
        int result = testObject.countTriplets(input, target);

        assert result == 10;
    }
}