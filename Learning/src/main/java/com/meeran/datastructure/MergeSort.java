package com.meeran.datastructure;

import java.util.Arrays;

public class MergeSort {

	//Merge sorted arrays
	private static int[] merge_old(int[] array1, int[] array2) {
		int[] combined = new int[array1.length + array2.length];
		int index=0, i=0, j=0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) combined[index++] = array1[i++];
			else combined[index++] = array2[j++];
		}
		while (i < array1.length) combined[index++] = array1[i++];
		while (j < array2.length) combined[index++] = array2[j++];
		return combined;
	}
	
	// Space Complexity O(n)
	// Time Complexity O(n log n)
	private static int[] mergeSort_old(int[] array) {
		if(array.length==1) return array;
		int midIndex = array.length/2;
		int[] left = mergeSort_old(Arrays.copyOfRange(array, 0, midIndex));
		int[] right = mergeSort_old(Arrays.copyOfRange(array, midIndex, array.length));
		
		return merge_old(left,right);
	}

	private static void mergeSort(int[] array) {
		mergeSort(array, new int[array.length], 0, array.length - 1);
	}

	private static void mergeSort(int[] array, int[] temp, int left, int right) {
		if (left >= right) return;
		int midIndex = left + (right - left ) / 2;

		mergeSort(array, temp, left, midIndex);
		mergeSort(array, temp, midIndex + 1, right);

		merge(array, temp, left, midIndex, right);
	}

	private static void merge(int[] array, int[] temp, int left, int midIndex, int right) {
		int i = left, j = midIndex + 1, k = left;
		while (i <= midIndex && j <= right) {
			if (array[i] <= array[j]) temp[k++] = array[i++];
			else temp[k++] = array[j++];
		}
		while (i <= midIndex) temp[k++] = array[i++];
		while (j <= right) temp[k++] = array[j++];

		for (int x = left; x <= right; x++) {
			array[x] = temp[x];
		}
	}

	public static void main(String[] args) {
		int[] array = {1,3,8,7,2,4,6,5};

		System.out.println("Array -> "+Arrays.toString(array));
		mergeSort(array);
		System.out.println("Sorted Array -> "+Arrays.toString(array));
	}

}
