package com.meeran.arrays;

import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		Set<String> list = new TreeSet<String>();
		for(String str1 : array1)
			for(String str2 : array2)
				if(str2.contains(str1)) list.add(str1);
		return list.toArray(new String[0]);
	}
}
