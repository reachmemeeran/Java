package com.meeran.gs.learning;

import java.util.TreeSet;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 150;
        System.out.println(nthUglyNumber(n));
	}
	
	static int nthUglyNumber(int n) {
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		int count =1;
		while(count<n) {
			int temp = set.pollFirst();
			set.add(temp*2);
			set.add(temp*3);
			set.add(temp*5);
			count++;
			
		}
		return set.pollFirst();
	}

}
