package com.meeran.dynamicprogramming;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueTuples {

	public static HashSet<String> uniqueTuples(String input, int len) {
		HashSet<String> outputSet = new LinkedHashSet<String>();
		for(int i = 0; i <= input.length() - len; i++) {
			outputSet.add(input.substring(i, i + len));
		}
		return outputSet;
	}
}
