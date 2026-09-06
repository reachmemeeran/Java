package com.meeran.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class SumOfSumsTest {

    @Test
    public void exampleTests() {
        assertEquals(new BigInteger("55"), SumOfSums.sumOfSums(3));
        assertEquals(new BigInteger("630"), SumOfSums.sumOfSums(5));
        assertEquals(new BigInteger("14740530850"), SumOfSums.sumOfSums(100));
    }

    @Test
    public void fixedTests(){
        assertEquals(new BigInteger("335221223415"), SumOfSums.sumOfSums(169));
        assertEquals(new BigInteger("1"), SumOfSums.sumOfSums(1));
        assertEquals(new BigInteger("1000985861505"), SumOfSums.sumOfSums(203));
    }

    @Test
    public void randomTest1(){
        for(int i = 0 ; i < 10; ++i) {
            int n = (int)(Math.random()*5000)+5000;
            assertEquals(solver(n), SumOfSums.sumOfSums(n));
        }
    }

    @Test
    public void randomTest2(){
        for(int i = 0 ; i < 24; ++i) {
            int n = (int)(Math.random()*500000)+500000;
            assertEquals(solver(n), SumOfSums.sumOfSums(n));
        }
    }

    @Test
    public void randomTest3(){
        for(int i = 0 ; i < 10; ++i) {
            int n = (int)(Math.random()*50000)+50000;
            assertEquals(solver(n), SumOfSums.sumOfSums(n));
        }
    }

    @Test
    public void randomTest4(){
        for(int i = 0 ; i < 30; ++i) {
            int n = (int)(Math.random()*100000000)+900000000;
            assertEquals(solver(n), SumOfSums.sumOfSums(n));
        }
    }

    private BigInteger solver(int n) {
        BigInteger n1 = new BigInteger(""+(n+1));
        final BigInteger SIX = new BigInteger("6");
        return n1.multiply(n1.multiply(n1.multiply(n1.multiply(n1.multiply(n1).subtract(BigInteger.TWO)).add(SIX)).add(BigInteger.ONE)).subtract(SIX)).divide(new BigInteger("72"));
    }
}
