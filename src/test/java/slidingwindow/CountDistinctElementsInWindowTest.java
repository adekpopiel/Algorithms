package slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountDistinctElementsInWindowTest {

    @Test
    public void testArrayWithDuplicates() {
        int[] arr = {1,2,1,3,4,2,3};
        int k = 4;
        List<Integer> expected = Arrays.asList(3, 4, 4, 3);

        CountDistinctElementsInWindow toTest = new CountDistinctElementsInWindow();
        ArrayList<Integer> result = toTest.countDistinct(arr, k);

        assertIterableEquals(expected, result);
    }

    @Test
    public void arrayOfSameElements() {
        int[] arr = {1,1,1,1,1};
        int k = 3;
        List<Integer> expected = Arrays.asList(1,1,1);

        CountDistinctElementsInWindow toTest = new CountDistinctElementsInWindow();
        ArrayList<Integer> result = toTest.countDistinct(arr, k);

        assertIterableEquals(expected, result);
    }

    @Test
    public void singleElementInArray() {
        int[] arr = {1};
        int k = 1;
        List<Integer> expected = Arrays.asList(1);

        CountDistinctElementsInWindow toTest = new CountDistinctElementsInWindow();
        ArrayList<Integer> result = toTest.countDistinct(arr, k);

        assertIterableEquals(expected, result);
    }

    @Test
    public void arrayWithoutDuplicates() {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;
        List<Integer> expected = Arrays.asList(4, 4, 4, 4);

        CountDistinctElementsInWindow toTest = new CountDistinctElementsInWindow();
        ArrayList<Integer> result = toTest.countDistinct(arr, k);

        assertIterableEquals(expected, result);
    }
}