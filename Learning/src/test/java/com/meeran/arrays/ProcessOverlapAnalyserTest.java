package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ProcessOverlapAnalyserTest {

    @Test
    void testGetMaxLogOverlap() {
        assertEquals(3, ProcessOverlapAnalyser.getMaxLogOverlap(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 4),
                Arrays.asList(3, 6))));

        assertEquals(2, ProcessOverlapAnalyser.getMaxLogOverlap(Arrays.asList(
                Arrays.asList(2, 6),
                Arrays.asList(1, 2),
                Arrays.asList(3, 5))));

        assertEquals(1, ProcessOverlapAnalyser.getMaxLogOverlap(
                Arrays.asList(Arrays.asList(5, 5))));

        assertEquals(1, ProcessOverlapAnalyser.getMaxLogOverlap(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(4, 6))));
    }
}