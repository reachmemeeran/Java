package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MedianOfTwoArraysTest {

    @Test
    public void testFindMedianSortedArrays() {
        assertEquals(2.5, MedianOfTwoArrays.findMedianSortedArrays(new int[] {1,3}, new int[] {2,4}));
        assertEquals(4.0, MedianOfTwoArrays.findMedianSortedArrays(new int[] {1,4}, new int[] {2,5,6}));
        assertEquals(4.0, MedianOfTwoArrays.findMedianSortedArrays(new int[] {1}, new int[] {2,4,5,6}));
        assertEquals(3.0, MedianOfTwoArrays.findMedianSortedArrays(new int[] {1,2,3}, new int[] {5,6}));
        assertEquals(3.0, MedianOfTwoArrays.findMedianSortedArrays(new int[] {1,2,3,4}, new int[] {5}));
    }
}
