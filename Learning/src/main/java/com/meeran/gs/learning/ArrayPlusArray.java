package com.meeran.gs.learning;

import java.util.stream.IntStream;

public class ArrayPlusArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result - 21 " + arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println("Result - -21 " + arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        System.out.println("Result - 15 " + arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        System.out.println("Result - 0 " + arrayPlusArray(new int[]{}, new int[]{}));
        System.out.println("Result - 2100 " + arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
	}
	
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
	    // arr1 + arr2 is not working...
	   return IntStream.of(arr1).sum()+IntStream.of(arr2).sum();
	  }

}
