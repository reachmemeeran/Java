package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OptimalPathTest {

    @Test
    public void testOptimalPath() {
        int[][] initialGrid = {
                {0, 0, 0, 0, 5},
                {0, 1, 1, 1, 0},
                {2, 0, 0, 0, 0}
        };

        assertEquals(10, OptimalPath.optimalPath(initialGrid));
    }

    @Test
    public void testCalculateOptimalPath() {
        int[][] initialGrid = {
                {0, 0, 0, 0, 5},
                {0, 1, 1, 1, 0},
                {2, 0, 0, 0, 0}
        };

        OptimalPath optimalPath = new OptimalPath();

        assertEquals(10, optimalPath.calculateOptimalPath(initialGrid));
    }
}
