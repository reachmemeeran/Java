package com.meeran.maths;

import java.util.stream.IntStream;

public class DotProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {2, 3};
		int[] array2 = {1, 2};
		long result1 = dotProduct(array1, array2);
		System.out.println("result=8=>"+result1);
	}

	public static long dotProduct( int[] array1, int array2[] ){
		return (long)IntStream.of(array1).reduce(1,(a,b)->a*b) +
				(long)IntStream.of(array2).reduce(1,(a,b)->a*b);
	}
}
