package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SameMatrixTest {

    @Test
    public void samplesTests() {
        int[][] ms;

        ms = new int[][] {{1, 2, 3, 4},
                {3, 1, 4, 2},
                {4, 3, 2, 1},
                {2, 4, 1, 3}};
        assertEquals(1, SameMatrix.count_different_matrices(ms));

        ms = new int[][] {{3, 1, 2, 3},
                {3, 1, 2, 3},
                {1, 3, 3, 2},
                {3, 2, 1, 3}};
        assertEquals(1, SameMatrix.count_different_matrices(ms));

        ms = new int[][] {{5, 1, 2, 6},
                {5, 4, 3, 5},
                {2, 5, 6, 1}};
        assertEquals(2, SameMatrix.count_different_matrices(ms));

        ms = new int[][] {{1, 2, 2, 1},
                {1, 1, 2, 2},
                {2, 1, 1, 2},
                {2, 1, 2, 1},
                {1, 2, 1, 2}};
        assertEquals(2, SameMatrix.count_different_matrices(ms));
    }
}
