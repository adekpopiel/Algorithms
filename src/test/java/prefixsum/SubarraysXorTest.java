package prefixsum;

import org.junit.jupiter.api.Test;

class SubarraysXorTest {

    @Test
    public void test14() {
        int[] input = new int[] {1, 14, 19, 11, 5, 19, 7, 6, 14, 1, 6, 11, 5, 11, 7, 14};

        SubarraysXor sx = new SubarraysXor();
        long result = sx.subarrayXor(input, 12);
        assert result == 5;
    }
}