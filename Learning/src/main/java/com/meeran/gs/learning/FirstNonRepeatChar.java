package com.meeran.gs.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class FirstNonRepeatChar {

	static char firstNonRepeatChar(String s) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		return map.entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
	}
	
	@Test
	public void testFirstNonRepeatChar() {
		assertEquals('l', firstNonRepeatChar("leetcode"));
	}

}
