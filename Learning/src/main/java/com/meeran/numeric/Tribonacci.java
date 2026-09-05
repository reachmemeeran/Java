package com.meeran.numeric;

public class Tribonacci {
	public static double[] tribonacci(double[] s, int n) {
		if(n == 0) return new double[0];
		int i=0;
		double[] result = new double[n];
		if(n < s.length) {
			for(; i<n; i++) result[i] = s[i];
			return result;
		}
		for(; i < s.length; i++){
			result[i] = s[i];
		}
		for(; i <= n - 1; i++){
			result[i] = result[i - 1] + result[i - 2] + result[i - 3];
		}
		return result;
	}
}
