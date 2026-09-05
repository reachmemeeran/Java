package com.meeran.dynamicprogramming;

public class WalkingRobot {

	public static Integer[] walk(String path) {
		int x = 0, y = 0;
		for(Character ch : path.toCharArray()) {
			switch(ch) {
				case 'U': y--; break;
				case 'D': y++; break;
				case 'L': x--; break;
				case 'R': x++; break;
			}
		}
		return new Integer[] {x, y};
	}
}
