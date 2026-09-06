package com.meeran.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class BigIntegerPalindromeTest {

    @Test
    public void testFixed() {
        assertEquals(new BigInteger("0"), BigIntegerPalindrome.findReverseNumber(1));
        assertEquals(new BigInteger("1"), BigIntegerPalindrome.findReverseNumber(2));
        assertEquals(new BigInteger("9"), BigIntegerPalindrome.findReverseNumber(10));
        assertEquals(new BigInteger("909"), BigIntegerPalindrome.findReverseNumber(100));
        assertEquals(new BigInteger("90009"), BigIntegerPalindrome.findReverseNumber(1000));
        assertEquals(new BigInteger("10000001"), BigIntegerPalindrome.findReverseNumber(11000));
        assertEquals(new BigInteger("20000002"), BigIntegerPalindrome.findReverseNumber(12000));
        assertEquals(new BigInteger("9000009"), BigIntegerPalindrome.findReverseNumber(10000));
        assertEquals(new BigInteger("900000009"), BigIntegerPalindrome.findReverseNumber(100000));
        assertEquals(new BigInteger("900000000000000000009"), BigIntegerPalindrome.findReverseNumber(100000000000L));
    }
}
