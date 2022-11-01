package com.meeran.gs.learning;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println("Result-l->"+firstNonRepeatChar(s));
	}
	static char firstNonRepeatChar(String s) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		return map.entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
	}

}
