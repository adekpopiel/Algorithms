package twopointer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairClosestToTargetTest {

    @Test
    public void pairEqualToTarget() {
        int[] arr = {10, 30, 20, 5};
        int target = 25;

        PairClosestToTarget toTest = new PairClosestToTarget();
        List<Integer> result = toTest.sumClosest(arr, target);
        assert result.get(0) == 5;
        assertEquals(20, result.get(1));
    }

    @Test
    public void twoPairsCloseToTarget() {
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;
        PairClosestToTarget toTest = new PairClosestToTarget();
        List<Integer> result = toTest.sumClosest(arr, target);

        assertEquals(2, result.get(0));
        assertEquals(7, result.get(1));
    }
}