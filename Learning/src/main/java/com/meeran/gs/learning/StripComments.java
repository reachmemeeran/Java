package com.meeran.gs.learning;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result - apples, pears\ngrapes\nbananas " +
				stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples " , new String[] { "# " + "!" } )
		);

		System.out.println("Result - a\nc\nd"+
				stripComments( "a #b\nc\nd $e f g" , new String[] { "#", "$" } )
		);
	}
	
	public static String stripComments(String text, String[] commentSymbols) {
	    return text.replaceAll(" *([" + String.join("", commentSymbols) + "].*)?(\n|$)", "$2");
	  }
	
	public static String stripComments1(String text, String[] commentSymbols) {
		return Arrays.stream(text.split("\n")).map(s -> {
            for (String symbol : commentSymbols) s = s.replaceAll("(\\s+$)|(\\s*[" + symbol + "].*)", "");
            return s;
        }).collect(Collectors.joining("\n"));
	}
	
	public static String stripComments2(String text, String[] commentSymbols) {
		
		String pattern = String.format("[ ]*([%s].*)?$", Arrays.stream(commentSymbols).collect(Collectors.joining()));
		
		return Arrays.stream(text.split("\n"))
				.map(x -> x.replaceAll(pattern,""))
				.collect(Collectors.joining("\n"));
	}

}
