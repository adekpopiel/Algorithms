package twopointer;

import org.junit.jupiter.api.Test;

class TwoPointerSumLessThanTargetTest {

    @Test
    public void testTwoPointerSumLessThanTarget() {
        int[] arr = {7, 2, 5, 3};
        int target = 8;
        TwoPointerSumLessThanTarget toTest = new TwoPointerSumLessThanTarget();
        int result = toTest.countPairs(arr, target);
        assert result == 2;
    }
}