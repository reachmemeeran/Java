package com.meeran.numeric;

import java.util.Arrays;
import java.util.stream.IntStream;

public class smallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int FindMin(int a[]){
		Arrays.sort(a);
		return IntStream.of(a).findFirst().getAsInt();
	}
}
