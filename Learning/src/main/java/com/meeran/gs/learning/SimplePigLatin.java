package com.meeran.gs.learning;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimplePigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result - "+ "igPay atinlay siay oolcay " +pigIt("Pig latin is cool"));
        System.out.println("Result - "+ "hisTay siay ymay tringsay " +pigIt("This is my string"));
        System.out.println("Result - "+ "hisTay siay ymay tringsay " +pigIt("This is a string"));

	}
	
	public static String pigIt(String str) {
		return Arrays.stream(str.split(" "))
		.map(w->w.matches("[A-Za-z]+") ? w.substring(1,w.length())+w.substring(0,1)+"ay" : w)
		.collect(Collectors.joining(" "));
	}
}
