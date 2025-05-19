package com.vibha_avi.one;

public class A004_27_RemoveElement {

	public static void main(String[] args) {
		
		int [] nums = {3,2,2,3};
		int val = 3;
		int index = 0;
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i] == val ) {
				int temp = nums[i];
				nums[index] = nums[index+1];
				
			}
		}
		
		for (int k : nums) {
			System.out.print(k+" ");
		}

	}

}
