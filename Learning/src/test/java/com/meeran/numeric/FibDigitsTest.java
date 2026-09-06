package com.meeran.numeric;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FibDigitsTest {

    @Test
    @DisplayName("F<sub>10</sub> = 55 => {{2, 5}}")
    public void FibDigtis_10() {
        int n = 10;
        int[][] expectedResult = {{2, 5}};
        int[][] result = FibDigits.fibDigits(n);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    @DisplayName("F<sub>10000</sub>")
    public void FibDigtis_10000() {
        int n = 10000;
        int[][] expectedResult = {
                {254, 3},
                {228, 2},
                {217, 6},
                {217, 0},
                {202, 5},
                {199, 1},
                {198, 7},
                {197, 8},
                {194, 4},
                {184, 9}
        };
        int[][] result = FibDigits.fibDigits(n);
        assertArrayEquals(expectedResult,result);
    }

    @Test
    @DisplayName("F<sub>100000</sub>")
    public void FibDigtis_100000() {
        int n = 100000;
        int[][] expectedResult = {
                {2149, 2},
                {2135, 1},
                {2131, 8},
                {2118, 9},
                {2109, 0},
                {2096, 3},
                {2053, 5},
                {2051, 6},
                {2034, 7},
                {2023, 4},
        };
        int[][] result = FibDigits.fibDigits(n);
        assertArrayEquals(expectedResult, result);
    }
}
