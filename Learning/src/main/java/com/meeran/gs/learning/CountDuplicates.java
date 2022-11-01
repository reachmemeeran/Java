package com.meeran.gs.learning;

import java.util.HashMap;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Result - 0 " +duplicateCount("abcde"));
		 System.out.println("Result - 1 " +duplicateCount("abcdea"));
		 System.out.println("Result - 1 " +duplicateCount("indivisibility"));
		 
		 String testThousandA = new String(new char[1000]).replace('\0', 'a');
		 String testHundredB = new String(new char[100]).replace('\0', 'b');
		 String testTenC = new String(new char[10]).replace('\0', 'c');
		 String test1CapitalA = new String(new char[1]).replace('\0', 'A'); 
		 String test1d = new String(new char[1]).replace('\0', 'd'); 
		 String test = test1d + test1CapitalA + testTenC + 
            testHundredB + testThousandA;
        

		 System.out.println("Result - 3 " +duplicateCount(test));
	}
	
	public static int duplicateCount(String text) {
	    // Write your code here
		String input = text.toLowerCase();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(Character ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		//return (int) map.entrySet().stream().filter(e->e.getValue()>1).count();
		
		return (int) map.values().stream().filter(e->e >1).count(); 
	  }

}
