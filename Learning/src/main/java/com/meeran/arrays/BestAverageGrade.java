package com.meeran.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BestAverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Integer bestAverageGrade(String[][] scores) {
		Map<String,Integer> map = new HashMap<>();
		for(String[] score : scores) {
			String name = score[0];
			Integer mark = Integer.parseInt(score[1]);
			map.put(name, (map.getOrDefault(name, mark)+mark)/2);
		}
		return map.values().stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}
}
