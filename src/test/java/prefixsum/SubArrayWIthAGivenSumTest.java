package prefixsum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayWIthAGivenSumTest {

    @Test
    public void testFindingSumEqualToTarget() {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        ArrayList<Integer> result = SubArrayWIthAGivenSum.subarraySum(arr, target);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        assertIterableEquals(expected, result);
    }

    @Test
    public void testArrayWIthDuplicates() {
        int[] arr = {0, 0, 1, 4};
        int target = 5;

        ArrayList<Integer> result = SubArrayWIthAGivenSum.subarraySum(arr, target);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        assertIterableEquals(expected, result);
    }
}