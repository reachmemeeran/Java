package com.meeran.stringandpatterns;

public class StringMerger {

	public static boolean isMerge(String s, String part1, String part2) {
		return s.isEmpty() || part1.isEmpty() || part2.isEmpty() ? s.equals(part1 + part2) :
				s.charAt(0) == part1.charAt(0) && isMerge(s.substring(1), part1.substring(1), part2) ||
						s.charAt(0) == part2.charAt(0) && isMerge(s.substring(1), part1, part2.substring(1));
	}

	public static boolean isMerge1(String s, String part1, String part2) {
		System.out.println("s-->"+s+" part1-->"+part1+" part2-->"+part2);
		if(s.length() != part1.length() + part2.length()) return false;
		StringBuilder sSb = new StringBuilder(s);
		StringBuilder part1Sb = new StringBuilder(part1);
		StringBuilder part2Sb = new StringBuilder(part2);
		while(sSb.length() > 0) {
			int part1Length = 0, part2Length = 0;
			for(int i = 0; i < part1Sb.length(); i++) {
				if(sSb.charAt(i) == part1Sb.charAt(i)) part1Length++;
				else break;
			}
			for(int i = 0; i < part2Sb.length(); i++) {
				if(sSb.charAt(i) == part2Sb.charAt(i)) part2Length++;
				else break;
			}
			if(part1Length == 0 && part2Length == 0) return false;
			if(part1Length <= part2Length) {
				part2Sb.delete(0, 1);
				sSb.delete(0, 1);
			} else {
				part1Sb.delete(0, 1);
				sSb.delete(0, 1);
			}
		}
		return sSb.length() == 0 && part1Sb.length() == 0 && part2Sb.length() == 0;
	}
}
