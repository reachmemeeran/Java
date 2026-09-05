package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaximumPeakDistanceTest {

    @Test
    void testSolvePeaksProblem() {
        assertEquals(2, MaximumPeakDistance.solvePeaksProblem(
                Arrays.asList(2, 4, 1, 2, 1, 2, 1, 4)));

        assertEquals(0, MaximumPeakDistance.solvePeaksProblem(
                Arrays.asList(1, 2, 3, 4, 5)));

        assertEquals(0, MaximumPeakDistance.solvePeaksProblem(
                Arrays.asList(1, 2)));

        assertEquals(2, MaximumPeakDistance.solvePeaksProblem(
                Arrays.asList(1, 3, 2, 4, 1)));
    }
}