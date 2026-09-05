package com.meeran.arrays;

import java.util.Arrays;

public class MedianOfTwoArrays {

	public static void main(String[] args) {
		findMedianSortedArrays(new int[] {1,3}, new int[] {2,4});
	}

	public static double findMedianSortedArrays(int[] A, int[] B) {
		int aSize = A.length;
		int bSize = B.length;
		int[] arrays = new int[aSize+bSize];
		int i=0,j=0,k=0;
		while(i<aSize && j<bSize) {
			if(A[i]<=B[j]) {
				arrays[k]=A[i];
				i++;
				k++;
			}else {
				arrays[k]=B[j];
				k++;
				j++;
			}
		}

		if(i>=aSize) {
			while(j<bSize) {
				arrays[k]=B[j];
				k++;
				j++;
			}
		}

		if(j>=bSize) {
			while(i<aSize) {
				arrays[k]=A[i];
				k++;
				i++;
			}
		}

		System.out.println(Arrays.toString(arrays));
		if(arrays.length%2==0) {
			return (arrays[arrays.length/2]+arrays[arrays.length/2-1])/2d;
		}else {
			return (double) arrays[arrays.length/2];
		}
	}
}
