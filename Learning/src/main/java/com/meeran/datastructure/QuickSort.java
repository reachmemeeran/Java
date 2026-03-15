package com.meeran.datastructure;

import java.util.Arrays;

public class QuickSort {

	private static void quickSort(int[] array) {
		quickSort(array, 0, array.length-1);
	}

	private static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(array, left, right);
			quickSort(array, left, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, right);
		}
	}

	private static int partition(int[] array, int left, int right) {
		int pivot = array[left], swapIndex = left;

		for (int i = left + 1; i <= right; i++) {
			if (array[i] < pivot) {
				swapIndex++;
				swap(array, swapIndex, i);
			}
		}
		swap(array, swapIndex, left);
		return swapIndex;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = {4,6,1,7,3,2,5};
		System.out.println("Array - "+Arrays.toString(array));
		quickSort(array);
		System.out.println("Sorted Array - "+Arrays.toString(array));
	}

}
