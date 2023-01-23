package com.meeran.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class GapInPrimes {
	public static long[] gap(int g, long m, long n) {
        // your code
		long first = Integer.MIN_VALUE;
		if(isPrime(m)) first=m;
		while(m<=n) {
			System.out.println("isPrime(m)-->"+isPrime(m));
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
	
	@Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4,100,110)));
        assertEquals(null, GapInPrimes.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10,300,400)));
        assertEquals(null,GapInPrimes.gap(11,30000,100000));
    }
}
