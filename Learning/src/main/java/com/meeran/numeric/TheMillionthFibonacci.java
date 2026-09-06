package com.meeran.numeric;

import java.math.BigInteger;

public class TheMillionthFibonacci {
	public static BigInteger fib(BigInteger n) {
		// ...
		BigInteger a = BigInteger.valueOf(0);
		int limit=n.intValue();
		BigInteger fact = BigInteger.valueOf(1);
		BigInteger minus = BigInteger.valueOf(-1);
		if(n.intValue()==0) return a;
		else if(n.intValue()<0) {
			limit = -1 * n.intValue();
			if(n.intValue()%2==0) {
				fact = fact.multiply(minus);
			}
		}
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		for (int j=2 ; j<=limit ; j++) {
			c =  a.add(b);
			a = b;
			b = c;
		}

		return b.multiply(fact);
	}

	public static BigInteger fib1(BigInteger n) {
		// ...
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		BigInteger fact = BigInteger.valueOf(1);
		BigInteger minus = BigInteger.valueOf(-1);
		BigInteger two = BigInteger.valueOf(2);

		if(n.intValue()<0) {
			n = minus.multiply(n);
			if(n.intValue()%2==0) {
				fact = fact.multiply(minus);
			}
		}
		if(n.intValue()==0) return a;
		else if(n.intValue()==1) return b;
		else {
			return (fib(n.subtract(c)).add(fib(n.subtract(two)))).multiply(fact);
		}
	}
}
