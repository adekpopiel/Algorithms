package twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapingRainWaterTest {

    @Test
    public void testDefaultExample() {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};

        TrapingRainWater toTest = new TrapingRainWater();
        int result = toTest.maxWater(arr);

        assertEquals(10, result);
    }

    @Test
    public void noWaterToTrap() {
        int[] arr = {1, 2, 3, 4};

        TrapingRainWater toTest = new TrapingRainWater();
        int result = toTest.maxWater(arr);

        assertEquals(0, result);
    }

    @Test void testAnotherSetup() {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};

        TrapingRainWater toTest = new TrapingRainWater();
        int result = toTest.maxWater(arr);

        assertEquals(9, result);
    }

    @Test
    public void testNoChangesInTheMiddle() {
        int[] arr = {7, 4, 0, 9};

        TrapingRainWater toTest = new TrapingRainWater();
        int result = toTest.maxWater(arr);

        assertEquals(10, result);
    }

}