package com.meeran.gs.learning;

import static java.lang.Character.*;
public class AlternateCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Result - "+ toAlternativeString("hello world")); System.out.println("HELLO WORLD");
		System.out.println("Result - "+ toAlternativeString("HELLO WORLD")); System.out.println("hello world");
		System.out.println("Result - "+ toAlternativeString("hello WORLD")); System.out.println("HELLO world");
		System.out.println("Result - "+ toAlternativeString("HeLLo WoRLD")); System.out.println("hEllO wOrld");
		System.out.println("Result - "+ toAlternativeString("12345")); System.out.println("12345"); // Non-alphabetical characters are unaffected
		System.out.println("Result - "+ toAlternativeString("1a2b3c4d5e")); System.out.println("1A2B3C4D5E");

	}
	static String toAlternativeString1(String str) {
		String result = "";
		for(Character ch : str.toCharArray()) {
			if(ch>='A' && ch<='Z') {
				result += Character.toLowerCase(ch);
			}else if(ch>='a' && ch<='z') {
				result += Character.toUpperCase(ch);
			}else {
				result+=ch;
			}
		}
		return result;
	}
	
	static String toAlternativeString2(String str) {
		String result = "";
		for(Character ch : str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				result += Character.toLowerCase(ch);
			}else {
				result+= Character.toUpperCase(ch);
			}
		}
		return result;
	}
	
	static String toAlternativeString(String str) {
		return str.chars()
				.map(ch -> isLowerCase(ch) ? toUpperCase(ch) : toLowerCase(ch))
				.collect(StringBuilder:: new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}

}
