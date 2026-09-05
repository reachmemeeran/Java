package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MaximumPeakDistance {

    public static void main(String[] args) {
        int result1 = solvePeaksProblem(Arrays.asList(1, 3, 2, 4, 1));
        System.out.println("Example 1 -> actual: " + result1);

        int result2 = solvePeaksProblem(Arrays.asList(2, 4, 1, 2, 1, 2, 1, 4));
        System.out.println("Example 2 -> expected: 2, actual: " + result2);

        int result3 = solvePeaksProblem(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("No-peak case -> expected: 0, actual: " + result3);
    }

    public static int solvePeaksProblem(List<Integer> arr) {
        int n = arr.size();
        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i <= n - 2; i++) {
            if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
                peaks.add(i);
            }
        }

        if (peaks.size() < 2) {
            return 0;
        }

        int maxDistance = 0;
        for (int i = 0; i < peaks.size() - 1; i++) {
            int distance = peaks.get(i + 1) - peaks.get(i);
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }
        return maxDistance;
    }

    @Test
    void testSolvePeaksProblem() {
        assertEquals(2, solvePeaksProblem(Arrays.asList(2, 4, 1, 2, 1, 2, 1, 4)));
        assertEquals(0, solvePeaksProblem(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(0, solvePeaksProblem(Arrays.asList(1, 2)));
        assertEquals(2, solvePeaksProblem(Arrays.asList(1, 3, 2, 4, 1)));
    }
}
