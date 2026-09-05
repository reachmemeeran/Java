package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubArrayExceedsSumTest {

    @Test
    public void testSubArrayExceedsSum() {
        assertEquals(2, SubArrayExceedsSum.subArrayExceedsSum(new int[] {1,2,3,4}, 6));
    }
}
