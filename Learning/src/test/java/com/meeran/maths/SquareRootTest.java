package com.meeran.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareRootTest {

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, SquareRoot.squareRoot(4), 0.001);
        assertEquals(1.41421, SquareRoot.squareRoot(2), 0.001);
    }
}
