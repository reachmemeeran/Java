package com.meeran.arrays;

import java.math.BigInteger;

public class SubSets {
	public static BigInteger F(int n) {
		if (n <= 0) return BigInteger.ZERO;

		int k = n + 2;
		BigInteger prev = BigInteger.ONE; // F_1
		BigInteger curr = BigInteger.ONE; // F_2

		for (int i = 3; i <= k; i++) {
			BigInteger next = prev.add(curr);
			prev = curr;
			curr = next;
		}

		return curr.subtract(BigInteger.ONE);
	}
}
