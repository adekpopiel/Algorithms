package prefixsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilibriumPointTest {

    @Test
    public void testCase1() {
        int[] arr = {1, 2, 0, 3};

        int result = EquilibriumPoint.findEquilibrium(arr);

        assertEquals(2, result);
    }

    @Test
    public void testCase2() {
        int[] arr = {1, 1, 1, 1};

        int result = EquilibriumPoint.findEquilibrium(arr);

        assertEquals(-1, result);
    }

    @Test
    public void testCase3() {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        int result = EquilibriumPoint.findEquilibrium(arr);

        assertEquals(3, result);
    }

}