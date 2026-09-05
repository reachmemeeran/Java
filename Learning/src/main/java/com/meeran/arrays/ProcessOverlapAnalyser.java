package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ProcessOverlapAnalyser {

    public static void main(String[] args) {
        int result1 = getMaxLogOverlap(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 4),
                Arrays.asList(3, 6)));
        System.out.println("Example 1 -> expected: 3, actual: " + result1);

        int result2 = getMaxLogOverlap(Arrays.asList(
                Arrays.asList(2, 6),
                Arrays.asList(1, 2),
                Arrays.asList(3, 5)));
        System.out.println("Example 2 -> expected: 2, actual: " + result2);
    }

    public static int getMaxLogOverlap(List<List<Integer>> interval) {
        int n = interval.size();
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = interval.get(i).get(0);
            ends[i] = interval.get(i).get(1) + 1; // Process runs through end inclusive, so it stops at end + 1
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int maxOverlap = 0;
        int currentOverlap = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (starts[i] < ends[j]) {
                currentOverlap++;
                if (currentOverlap > maxOverlap) {
                    maxOverlap = currentOverlap;
                }
                i++;
            } else {
                currentOverlap--;
                j++;
            }
        }
        return maxOverlap;
    }

    @Test
    void testGetMaxLogOverlap() {
        assertEquals(3, getMaxLogOverlap(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 4),
                Arrays.asList(3, 6))));

        assertEquals(2, getMaxLogOverlap(Arrays.asList(
                Arrays.asList(2, 6),
                Arrays.asList(1, 2),
                Arrays.asList(3, 5))));

        assertEquals(1, getMaxLogOverlap(Arrays.asList(Arrays.asList(5, 5))));

        assertEquals(1, getMaxLogOverlap(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(4, 6))));
    }
}
