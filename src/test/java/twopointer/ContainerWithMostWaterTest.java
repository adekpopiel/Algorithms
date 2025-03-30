package twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    public void testCase1() {
        int[] arr = {1, 5, 4, 3};

        ContainerWithMostWater toTest = new ContainerWithMostWater();
        int result = toTest.maxWater(arr);

        assertEquals(6, result);
    }

    @Test
    public void testCase2() {
        int[] arr = {3, 1, 2, 4, 5};

        ContainerWithMostWater toTest = new ContainerWithMostWater();
        int result = toTest.maxWater(arr);

        assertEquals(12, result);
    }

    @Test
    public void testCase3() {
        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};

        ContainerWithMostWater toTest = new ContainerWithMostWater();
        int result = toTest.maxWater(arr);

        assertEquals(25, result);
    }

    @Test
    public void noWater() {
        int[] arr = {2};
        ContainerWithMostWater toTest = new ContainerWithMostWater();
        int result = toTest.maxWater(arr);

        assertEquals(0, result);
    }

    @Test
    public void onlyTwo() {
        int[] arr = {2,3};
        ContainerWithMostWater toTest = new ContainerWithMostWater();
        int result = toTest.maxWater(arr);

        assertEquals(2, result);
    }

    @Test
    public void higherValueInTheMiddle() {
        int[] arr = {1,1,1,1,1,18,20,1,1,1,1,1,1};

        ContainerWithMostWater toTest = new ContainerWithMostWater();
        int result = toTest.maxWater(arr);

        assertEquals(18, result);
    }


}