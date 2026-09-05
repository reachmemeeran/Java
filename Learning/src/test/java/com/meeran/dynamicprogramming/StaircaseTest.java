package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StaircaseTest {

    @Test
    public void testCountSteps() {
        assertEquals(4, Staircase.countSteps(3));
        assertEquals(1, Staircase.countSteps(1));
        assertEquals(2, Staircase.countSteps(2));
        assertEquals(274, Staircase.countSteps(10));
        assertEquals(0, Staircase.countSteps(-5));
    }

    @Test
    public void testClimbStairs() {
        assertEquals(4, Staircase.climbStairs(3));
        assertEquals(1, Staircase.climbStairs(1));
        assertEquals(2, Staircase.climbStairs(2));
        assertEquals(274, Staircase.climbStairs(10));
        assertEquals(0, Staircase.climbStairs(-5));
    }
}
