package com.meeran.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SecondSmallestTest {

    @Test
    public void testSecondSmallest() {
        assertEquals(2, SecondSmallest.secondSmallest(new int[] {3, 4, 5, 6, 1, 2}));
        assertEquals(2, SecondSmallest.secondSmallest(new int[] {2, 1}));
        assertEquals(0, SecondSmallest.secondSmallest(new int[] {1}));
    }
}
