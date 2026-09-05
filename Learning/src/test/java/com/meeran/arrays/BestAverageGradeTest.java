package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BestAverageGradeTest {

    @Test
    public void testBestAverageGrade() {
        String[][] input = new String[][] {{ "Bobby", "87" },
                { "Charles", "100" },
                { "Eric", "64" },
                { "Charles", "22" }};
        assertEquals(87, BestAverageGrade.bestAverageGrade(input));

        String[][] input2 = new String[][] {{"Sarah", "91"},
                {"Goldie", "92"},
                {"Elaine", "93"},
                {"Elaine", "95"},
                {"Goldie", "94"},
                {"Sarah", "93"}};
        assertEquals(94, BestAverageGrade.bestAverageGrade(input2));
    }
}
