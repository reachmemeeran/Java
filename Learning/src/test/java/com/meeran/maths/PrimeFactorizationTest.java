package com.meeran.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class PrimeFactorizationTest {

    @Test
    public void testPrimeFactorization() {
        assertEquals(Arrays.asList(2,3), PrimeFactorization.primeFactorization(6));
        assertEquals(Arrays.asList(5), PrimeFactorization.primeFactorization(5));
        assertEquals(Arrays.asList(2,2,3), PrimeFactorization.primeFactorization(12));
        assertEquals(Arrays.asList(3,3,5,7), PrimeFactorization.primeFactorization(315));
    }
}
