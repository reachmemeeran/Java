package com.meeran.java.gs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class RemoveDuplicates {

	public static int [] solve(int [] arr){
		LinkedHashMap<Integer,Boolean> map = new LinkedHashMap<Integer,Boolean>();
		
		for(int i=arr.length-1; i>=0; i--) {
			map.put(arr[i], true);
		}
		
		int[] output = new int[map.size()];
		
		int j= map.size()-1;
		for(Map.Entry<Integer,Boolean> entry : map.entrySet()) {
			output[j--]=entry.getKey();
		}
		return output;
	}
	
	@Test
	public void testRemoveDuplicates() {
		assertEquals(Arrays.toString(new int[] {4,6,3}),Arrays.toString(solve(new int[]{3,4,4,3,6,3})));
        assertEquals(Arrays.toString(new int[] {1,2,3}),Arrays.toString(solve(new int[]{1,2,1,2,1,2,3})));
        assertEquals(Arrays.toString(new int[] {1,2,3,4}),Arrays.toString(solve(new int[]{1,2,3,4})));
        assertEquals(Arrays.toString(new int[] {4,5,2,1}),Arrays.toString(solve(new int[]{1,1,4,5,1,2,1})));    
	}

}
