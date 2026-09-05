package com.meeran.arrays;

import java.util.Arrays;

public class SortTwisted37 {
	public static Integer[] sortTwisted37(Integer[] array) {
		return Arrays.stream(array)
				.map(SortTwisted37::swap)
				.sorted(Integer::compare)
				.map(SortTwisted37::swap)
				.toArray(Integer[]::new);
	}

	private static Integer swap(Integer i) {
		return Integer.valueOf(i.toString()
				.replace("7", "*")
				.replace("3", "7")
				.replace("*", "3")
		);
	}
}
