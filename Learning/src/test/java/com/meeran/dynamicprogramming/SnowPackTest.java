package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SnowPackTest {

    @Test
    public void testComputeSnowPack() {
        assertEquals(6, SnowPack.computeSnowpack(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        assertEquals(9, SnowPack.computeSnowpack(new int[]{4,2,0,3,2,5}));
        assertEquals(0, SnowPack.computeSnowpack(new int[]{}));
        assertEquals(13, SnowPack.computeSnowpack(new int[]{0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0}));
        assertEquals(10, SnowPack.computeSnowpack(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    }
}
