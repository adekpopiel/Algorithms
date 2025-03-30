package hashing;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GoodArrayTest {

    @Test
    public void testOddLengthArray() {
        int[] arr = {1, 2, 3};
        int k = 3;

        GoodArray ga = new GoodArray();

        int result = ga.goodArray(arr, k);

        assertEquals(1, result);
    }

    @Test
    public void testEvenLengthArray() {
        int[] arr = {1,2,3,4};
        int k = 7;

        GoodArray ga = new GoodArray();
        int result = ga.goodArray(arr, k);

        assertEquals(2, result);
    }

    @Test
    public void testDuplicatedValuesWithPairs() {
        int[] arr = {4, 2, 4, 4};
        int k = 0;

        GoodArray ga = new GoodArray();
        int result = ga.goodArray(arr, k);

        assertEquals(2, result);
    }

    @Test
    public void testNoAdditionalPairsNeeded() {
        int[] arr = {1, 3, 6, 4};
        int k = 5;

        GoodArray ga = new GoodArray();
        int result = ga.goodArray(arr, k);

        assertEquals(0, result);
    }

    @Test
    public void testDuplicatedValuesWithoutPair() throws FileNotFoundException {
        List<Integer> input = new ArrayList<>();
        Scanner sc = new Scanner(getClass().getClassLoader().getResourceAsStream("testInput.txt"));
        while (sc.hasNextInt()) {
            input.add(sc.nextInt());
        }
        int k = input.removeLast();
        int[] arr = input.stream().mapToInt(Integer::intValue).toArray();

        GoodArray ga = new GoodArray();
        int result = ga.goodArray(arr, k);

        assertEquals(138, result);

    }
}