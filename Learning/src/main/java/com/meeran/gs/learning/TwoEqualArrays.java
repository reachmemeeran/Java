package com.meeran.gs.learning;

import java.util.Arrays;

public class TwoEqualArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };
 
        // Function call
        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
	
	public static boolean areEqual(int arr1[], int arr2[]) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) return false;
		}
		return true;
	}

}
