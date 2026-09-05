package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class SubSetsTest {

    @Test
    public void SampleTests() {
        assertEquals(new BigInteger("2"), SubSets.F(2), "F(2)");
        assertEquals(new BigInteger("4"), SubSets.F(3), "F(3)");
        assertEquals(new BigInteger("12"), SubSets.F(5), "F(5)");
        assertEquals(new BigInteger("17710"), SubSets.F(20), "F(20)");
        assertEquals(new BigInteger("591286729878"), SubSets.F(56), "F(56)");
    }
}
