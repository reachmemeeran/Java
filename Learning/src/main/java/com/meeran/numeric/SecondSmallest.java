package com.meeran.numeric;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int secondSmallest(int a[]){
		Arrays.sort(a);
		for(int i=0; i+1<a.length; i++) if(a[i]!=a[i+1]) return a[i+1];
		return 0;
	}
}
