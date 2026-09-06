package com.meeran.numeric;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        // your code
        long first = Integer.MIN_VALUE;
        if(isPrime(m)) first=m;
        while(m<=n) {
            if(isPrime(m)) {
                if((m-first) == g) return new long[] {first,m};
                else first=m;
            }
            m++;
        }
        return null;
    }

    static boolean isPrime(long n) {
        if (n <= 1) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) if (n % i == 0) return false;
        return true;
    }
}
