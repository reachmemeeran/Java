/**
 * 
 */
package com.meeran.gs.learning;

import java.util.Arrays;

/**
 * @author meeran.mohammed
 *
 */
public class ConsecutiveLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Result - true " + solve("abc"));
        System.out.println("Result - false " + solve("abd"));
        System.out.println("Result - true " + solve("dabc"));
        System.out.println("Result - false " + solve("abbc"));
        System.out.println("Result - true " + solve("v"));
	}
	
	public static boolean solve(String s){
		
		char[] chArr = s.toCharArray();
		Arrays.sort(chArr);
		
		for(int i=0; i+1<chArr.length; i++) {
			if(chArr[i]+1 != chArr[i+1]) {
				return false;
			}
		}
		return true;
	}

}
