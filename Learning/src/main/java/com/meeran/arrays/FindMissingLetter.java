package com.meeran.arrays;

public class FindMissingLetter {
	public static char findMissingLetter(char[] array) {
		for (int i = 1; i < array.length; i++) if (array[i]-array[i-1]!=1) return (char)(array[i]-1);
		return ' ';
	}

	public static char findMissingLetter1(char[] array) {
		for (int i = 1; i < array.length; i++) {
			char nextChar = (char) (((int) array[i - 1]) + 1);
			if (nextChar != array[i])
				return nextChar;
		}
		return ' ';
	}
}
