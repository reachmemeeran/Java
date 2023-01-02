package com.meeran.gs.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SuperMarketQueue {

	public static int solveSuperMarketQueue(int[] customers, int n) {
	      
	 int[] result = new int[n];
	  for(int i=0;i<customers.length;i++){
	    result[0]+=customers[i];
	    Arrays.sort(result);
	  }
	  return result[n-1];
	}	
	
	@Test
	public void testSuperMarketQueue() {
		assertEquals(9, solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
		assertEquals(0, solveSuperMarketQueue(new int[] {}, 1));
		assertEquals(15, solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
	}

}
