package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistogramMaxRectangularAreaTest {


    @Test
    public void testCase1() {
        int[] arr = {60, 20, 50, 40, 10, 50, 60};
        int result = HistogramMaxRectangularArea.getMaxArea(arr);

        assertEquals(100, result);
    }
}