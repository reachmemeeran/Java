package com.meeran.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeightSort {
	public static String orderWeight(String strng) {
		return Arrays.stream(strng.split(" "))
				.sorted(Comparator.comparing(WeightSort::sumOfDigits).thenComparing(String::compareTo))
				.collect(Collectors.joining(" "));
	}

	private static Integer sumOfDigits(String str) {
		return str.chars().map(ch -> ch - 48).sum();
	}
}
