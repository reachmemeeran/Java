package com.meeran.numeric;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FibDigits {
	public static int[][] fibDigits(int n) {
		BigInteger a = BigInteger.valueOf(0);
		int limit=n;
		BigInteger fact = BigInteger.valueOf(1);
		BigInteger minus = BigInteger.valueOf(-1);
		if(n<0) {
			limit = -1 * n;
			if(n%2==0) {
				fact = fact.multiply(minus);
			}
		}
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		for (int j=2 ; j<=limit ; j++)
		{
			c =  a.add(b);
			a = b;
			b = c;
		}

		String nthValue = b.multiply(fact).toString();
		Map<Character, Integer> map = new HashMap<>();
		for(char ch : nthValue.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		int[][] array = map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue(Comparator.reverseOrder())
						.thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
				.map(e -> new int[]{e.getValue(), Character.getNumericValue(e.getKey())})
				.toArray(int[][]::new);

		System.out.println(Arrays.deepToString(array));

		return array;
	}
}
