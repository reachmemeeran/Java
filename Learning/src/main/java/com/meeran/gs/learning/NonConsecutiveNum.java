package com.meeran.gs.learning;

public class NonConsecutiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result - "+ Integer.valueOf(6)+" Actual "+ find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        System.out.println("Result - "+ null+" Actual "+ find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println("Result - "+ Integer.valueOf(6)+" Actual "+ find(new int[]{4, 6, 7, 8, 9, 11}));
        System.out.println("Result - "+ Integer.valueOf(11)+" Actual "+ find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        System.out.println("Result - "+ null+" Actual "+ find(new int[]{31, 32}));
        System.out.println("Result - "+ Integer.valueOf(0)+" Actual "+ find(new int[]{-3, -2, 0, 1}));
        System.out.println("Result - "+ Integer.valueOf(-1)+" Actual "+ find(new int[]{-5, -4, -3, -1}));

	}
	
	static Integer find(int[] arr) {
		int firstNum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=++firstNum) {
				return arr[i];
			}
		}
		return null;
	}

}
