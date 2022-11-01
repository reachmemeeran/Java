package com.meeran.gs.learning.Imp;

public class CycleOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findCycle(new int[]{1, 2, 0}, 0)+("   >>>>Expected<<<<  3"));
		System.out.println(findCycle(new int[]{1, 0}, 0)+("   >>>>Expected<<<<  2"));
		System.out.println(findCycle(new int[]{1, 2, 3, 1}, 0)+("   >>>>Expected<<<<  3"));
		System.out.println(findCycle(new int[]{1, 2, 3, 4}, 0)+("   >>>>Expected<<<<  -1"));
		System.out.println(findCycle(new int[]{1, 2, 3, 4}, -1)+("   >>>>Expected<<<<  -1"));
		System.out.println(findCycle(new int[]{1, 2, 3, 4}, 4)+("   >>>>Expected<<<<  -1"));
		System.out.println(findCycle(new int[]{2, 3, 4, 0}, 0)+("   >>>>Expected<<<<  -1"));
		System.out.println(findCycle(new int[]{2, 3, 0}, 0)+("   >>>>Expected<<<<  2"));
	}
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int findCycle1(int[] nums, int start) {
		if(start<0 || start >=nums.length) return -1;
		int s=nums[start];
		int f=nums[nums[start]];
		int count=1;
		if(s==f) return -1;
		while(s!=f) {
			s=nums[s];
			count++;
			if(f<nums.length) f = nums[nums[f]];
			else return -1;
		}
		return count;
	}
	
}
