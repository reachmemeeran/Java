package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LengthOfCycleTest {

    @Test
    public void testlengthOfCycle() {
        assertEquals(2, LengthOfCycle.lengthOfCycle(new int[]{1, 0}, 0));
        assertEquals(3, LengthOfCycle.lengthOfCycle(new int[]{1,2, 0}, 0));
        assertEquals(3, LengthOfCycle.lengthOfCycle(new int[]{1, 2, 3, 1}, 0));
        assertEquals(-1, LengthOfCycle.lengthOfCycle(new int[]{1, 2, 3, 4}, 0));
        assertEquals(-1, LengthOfCycle.lengthOfCycle(new int[]{1, 2, 3, 4}, -1));
        assertEquals(-1, LengthOfCycle.lengthOfCycle(new int[]{1, 2, 3, 4}, 4));
        assertEquals(-1, LengthOfCycle.lengthOfCycle(new int[]{2, 3, 4, 0}, 0));
        assertEquals(2, LengthOfCycle.lengthOfCycle(new int[]{2, 3, 0}, 0));
    }
}
