package com.meeran.gs.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "getting good at coding needs a lot of practice" ;
		System.out.println(reverseAString(s));
	}
	static String reverseAString(String s) {
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(s.split(" "));
		Collections.reverse(list);
		return String.join(" ", list);
	}

}
