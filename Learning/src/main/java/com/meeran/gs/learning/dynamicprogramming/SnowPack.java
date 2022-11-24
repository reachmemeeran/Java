package com.meeran.gs.learning.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

/*
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.
 * */
public class SnowPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	
	/*
	 * 3|                    __
	 * 2|		 ___         | |__  __
	 * 1|  ___   |  |X  X  X |    |x_|_|__
	 * 0|__|__|x_|_____|X |__|___________|
	 * */
	public static int computeSnowpack(int[] height) {
		int left=0,right=height.length-1;
		int leftMax=0,rightMax=0;
		int ans=0;
		while(left<right) {
			if(leftMax<height[left])  leftMax=height[left];
			if(rightMax<height[right]) rightMax = height[right];
			if(leftMax<rightMax) {
				ans+=Math.max(0, leftMax-height[left]);
				left++;
			}else {
				ans+=Math.max(0, rightMax-height[right]);
				right--;
			}
		}
		return ans;
	}
	
	@Test
	public void testComputeSnowPack() {
		assertEquals(6, computeSnowpack(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
		assertEquals(9, computeSnowpack(new int[]{4,2,0,3,2,5}));
		assertEquals(0, computeSnowpack(new int[]{}));
		assertEquals(13, computeSnowpack(new int[]{0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0}));
		assertEquals(10, computeSnowpack(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
	}
	

}
