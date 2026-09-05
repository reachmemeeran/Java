package com.meeran.arrays;

public class LengthOfCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	//floyd's algorithm
	static int lengthOfCycle(int[] nums, int start) {
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
}
