package com.meeran.numeric;

import java.math.BigInteger;

public class SumOfSums {
    public static BigInteger sumOfSums(int n) {
        //Enter your code here
        BigInteger num = new BigInteger(String.valueOf(n)).multiply(new BigInteger(String.valueOf(n + 1))).multiply(new BigInteger(String.valueOf(n + 2))).divide(BigInteger.valueOf(6));
        return num.multiply(num.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
    }

    public static BigInteger sumOfSums2(int n) {
        //Enter your code here
        BigInteger sum = BigInteger.ZERO;
        while(n>0) {
            sum = sum.add(getSum(BigInteger.valueOf(n)));
            n--;
        }
        return getSum(sum);
    }

    private static BigInteger getSum(BigInteger n) {
        if(n.equals(new BigInteger("1"))) return n;
        BigInteger sum = BigInteger.ZERO;
        while (!n.equals(new BigInteger("0"))) {
            sum = sum.add(n);
            n=n.subtract(new BigInteger("1"));
        }
        return sum;
    }

    public static BigInteger sumOfSums1(int n) {
        //Enter your code here
        int sum = 0;
        while(n>0) {
            sum +=getSum(n);
            n--;
        }
        return getSum(BigInteger.valueOf(sum));
    }

    private static int getSum(int n) {
        if(n==1) return n;
        int sum = 0;
        while (n>0) {
            sum += n;
            n--;
        }
        return sum;
    }
}
