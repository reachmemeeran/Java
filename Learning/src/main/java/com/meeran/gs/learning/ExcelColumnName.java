package com.meeran.gs.learning;

public class ExcelColumnName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1--->"+titleToNumber("A"));
		System.out.println("28--->"+titleToNumber("AB"));
		
		System.out.println("AB--->"+numberToTitle(28));
	}
	
	static int titleToNumber(String s) {
		int result=0;
		for(int i=0; i<s.length();i++) {
			result = result*26;
			result+= s.charAt(i)-'A'+1;
		}
		return result;
	}
	
	static String numberToTitle(int num) {
		String result="";
		
		while(num>0) {
			num--;
			num=num/26;
			result = (char) ('A'+ num%26) +result;
			
		}
		return result;
	}

}
