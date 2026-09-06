package com.meeran.maths;

import java.util.ArrayList;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<Integer> primeFactorization(int x) {
		ArrayList<Integer> result = new ArrayList<>();

		while(x%2==0) {
			if(x%2==0) result.add(2);
			x/=2;
		}
		for(int i=3; i<Math.sqrt(x); i+=2) {
			while(x%i==0) {
				if(x%i==0) result.add(i);
				x/=i;
			}
		}
		if(x>2)result.add(x);
		return result;
	}
}
