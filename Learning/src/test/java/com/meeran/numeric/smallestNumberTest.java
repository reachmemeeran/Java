package com.meeran.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class smallestNumberTest {

    @Test
    public void testFindMin() {
        assertEquals(1, smallestNumber.FindMin(new int[] {3, 4, 5, 6, 1, 2}));
        assertEquals(1, smallestNumber.FindMin(new int[] {2, 1}));
        assertEquals(1, smallestNumber.FindMin(new int[] {1}));
    }
}
