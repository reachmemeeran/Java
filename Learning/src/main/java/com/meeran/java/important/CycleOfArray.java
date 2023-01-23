package com.meeran.java.important;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CycleOfArray {

	private static int findCycle(int[] nums, int start) {
		if(start<0 || start>=nums.length) return -1;
		int slow = nums[start];
		int fast=nums[nums[start]];
		if(slow==fast) return -1;
		int count=1;
		while(slow!=fast) {
			count++;
			slow=nums[slow];
			if(fast<nums.length) fast=nums[nums[fast]];
			else return -1;
		}
		return count;
	}
	
	@Test
	public void testFindCycle() {
		assertEquals(3,findCycle(new int[]{1, 2, 0}, 0));
		assertEquals(2,findCycle(new int[]{1, 0}, 0));
		assertEquals(3,findCycle(new int[]{1, 2, 3, 1}, 0));
		assertEquals(-1,findCycle(new int[]{1, 2, 3, 4}, 0));
		assertEquals(-1,findCycle(new int[]{1, 2, 3, 4}, -1));
		assertEquals(-1,findCycle(new int[]{1, 2, 3, 4}, 4));
		assertEquals(-1,findCycle(new int[]{2, 3, 4, 0}, 0));
		assertEquals(2,findCycle(new int[]{2, 3, 0}, 0));
	}
	
}
