package com.meeran.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PowerOfExpoTest {

    @Test
    public void testPower() {
        assertEquals(16.0, PowerOfExpo.power(2.0, 4));
    }
}
