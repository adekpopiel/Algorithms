package arrays;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumPairsWIth0SumTest {

    @Test
    void testExample1() {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(-1);
        pair.add(1);
        expected.add(pair);
        
        ArrayList<ArrayList<Integer>> result = TwoSumPairsWIth0Sum.getPairs(arr);
        assertEquals(expected, result);
    }

    @Test
    void testExample2() {
        int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        
        ArrayList<Integer> pair1 = new ArrayList<>();
        pair1.add(-6);
        pair1.add(6);
        expected.add(pair1);
        
        ArrayList<Integer> pair2 = new ArrayList<>();
        pair2.add(-1);
        pair2.add(1);
        expected.add(pair2);
        
        ArrayList<ArrayList<Integer>> result = TwoSumPairsWIth0Sum.getPairs(arr);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = TwoSumPairsWIth0Sum.getPairs(arr);
        assertEquals(expected, result);
    }

    @Test
    void testNoPairs() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = TwoSumPairsWIth0Sum.getPairs(arr);
        assertEquals(expected, result);
    }

    @Test
    void testMultipleSamePairs() {
        int[] arr = {-1, 1, -1, 1, -1, 1};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(-1);
        pair.add(1);
        expected.add(pair);
        
        ArrayList<ArrayList<Integer>> result = TwoSumPairsWIth0Sum.getPairs(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSingleZero() {
        int[] arr = {0};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = TwoSumPairsWIth0Sum.getPairs(arr);
        assertEquals(expected, result);
    }

    @Test
    void testMultipleZeros() {
        int[] arr = {0, 0, 0, 0};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(0);
        pair.add(0);
        expected.add(pair);
        
        ArrayList<ArrayList<Integer>> result = TwoSumPairsWIth0Sum.getPairs(arr);
        assertEquals(expected, result);
    }

    @Test
    void testLargeInputWithMultiplePairs() {
        int[] arr = {
            -979, -268, -357, 827, -899, -925, 575, -801, 812, -110, 637, -307, -677, 466, -974, -25, -901, -827, 307, -307, 326, -823, -956, 422, -256, -611, -275, 402, 303, -218, 963, -76, 613, 786, 828, 267, 409, -945, 650, 260, 419, 183, -514, 662, -620, 632, -376, -540, -275, -898, -805, 271, 0, -249, -270, 793, -887, 440, 82, -289, 266, 0, 345, -51, -125, 181, 753, -773, -945, 681, 682, 37, 336, 455, 643, 570, 969, 200, 416, -771, -161, -131, -458, -530, 441, -602, 559, 250, -291, -374, 405, 480, -35, -569, 63, 591, -934, 959, 243, -2, -809, 992, -896, -984, 141, 135, 218, -249, 470, 997, 183, 972, -227, -691, -491, 904, -701, 88, -695, -200, 187
        };
        
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        
        // Add pairs in sorted order
        ArrayList<Integer> pair1 = new ArrayList<>();
        pair1.add(-827);
        pair1.add(827);
        expected.add(pair1);
        
        ArrayList<Integer> pair2 = new ArrayList<>();
        pair2.add(-307);
        pair2.add(307);
        expected.add(pair2);
        
        ArrayList<Integer> pair3 = new ArrayList<>();
        pair3.add(-218);
        pair3.add(218);
        expected.add(pair3);
        
        ArrayList<Integer> pair4 = new ArrayList<>();
        pair4.add(-200);
        pair4.add(200);
        expected.add(pair4);
        
        ArrayList<Integer> pair5 = new ArrayList<>();
        pair5.add(0);
        pair5.add(0);
        expected.add(pair5);
        
        ArrayList<ArrayList<Integer>> result = TwoSumPairsWIth0Sum.getPairs(arr);
        assertEquals(expected, result);
    }
} 