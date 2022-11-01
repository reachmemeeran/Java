package com.meeran.gs.learning;

import java.util.Arrays;

public class EnglishBeggers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1, 2, 3, 4, 5};
        int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
        System.out.println("Result - "+ Arrays.toString(a1)+ "-" +Arrays.toString(beggars(test, 1)));
        System.out.println("Result - "+ Arrays.toString(a2)+ "-" +Arrays.toString(beggars(test, 2)));
        System.out.println("Result - "+ Arrays.toString(a3)+ "-" +Arrays.toString(beggars(test, 3)));
        System.out.println("Result - "+ Arrays.toString(a4)+ "-" +Arrays.toString(beggars(test, 6)));
        System.out.println("Result - "+ Arrays.toString(a5)+ "-" +Arrays.toString(beggars(test, 0)));
	}
	
	public static int[] beggars(int[] values, int n) {
	    // show me the code!
		int[] output = new int[n];
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<values.length; j+=n) {
				output[i]+=values[j];
			}
		}
		return output;
	  }
}
