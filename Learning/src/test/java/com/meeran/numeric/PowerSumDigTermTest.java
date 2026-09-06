package com.meeran.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PowerSumDigTermTest {

    @Test
    public void test1() {
        testing(PowerSumDigTerm.powerSumDigTerm(1), 81);
        testing(PowerSumDigTerm.powerSumDigTerm(2), 512);
        testing(PowerSumDigTerm.powerSumDigTerm(3), 2401);
        testing(PowerSumDigTerm.powerSumDigTerm(4), 4913);
    }

    private static void testing(long act, long exp) {
        assertEquals(exp, act);
    }
}
