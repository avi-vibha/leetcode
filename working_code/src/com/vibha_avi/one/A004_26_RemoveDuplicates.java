package com.vibha_avi.one;

public class A004_26_RemoveDuplicates {

	public static void main(String[] args) {

		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates (nums));
		
		for (int j : nums) {
			System.out.print(j+" ");
		}

	}

	public static int removeDuplicates(int[] nums) {
		int temp = nums[0];
		int k = 1;
		for (int i=1;i<nums.length;i++) {
			if (nums[i] != temp) {
				nums[k] = nums[i];
				temp = nums[i];
				k++;
			} 
		}
        return k;
    }
	
}
