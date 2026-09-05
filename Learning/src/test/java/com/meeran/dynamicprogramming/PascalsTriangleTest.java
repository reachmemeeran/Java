package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PascalsTriangleTest {

    @Test
    public void testPascal() {
        assertEquals(70, PascalsTriangle.pascal(4, 8));
        assertEquals(2, PascalsTriangle.pascal(1, 2));
        assertEquals(1, PascalsTriangle.pascal(0, 0));
        assertEquals(1, PascalsTriangle.pascal(0, 5));
        assertEquals(1, PascalsTriangle.pascal(7,7));
        assertEquals(8, PascalsTriangle.pascal(7,8));
    }
}
