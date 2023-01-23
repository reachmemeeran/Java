/**
 * 
 */
package com.meeran.java.gs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author meeran.mohammed
 *
 */
public class ConsecutiveLetters {

	
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
	
	@Test
	public void testConsecutiveLetters() {
		assertTrue(solve("abc"));
		assertFalse(solve("abd"));
		assertTrue(solve("dabc"));
		assertFalse(solve("abbc"));
		assertTrue(solve("v"));
	}

}
