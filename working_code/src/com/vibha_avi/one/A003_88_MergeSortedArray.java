package com.vibha_avi.one;

public class A003_88_MergeSortedArray {

	public static void main(String[] args) {
		
		//int [] nums1 = {1,2,3,0,0,0};
		//int [] nums2 = {2,5,6};
		
		int [] nums1 = {1};
		int [] nums2 = {};
		
		int m = 3;
		int n = 3;
		
		merge(nums1, m, nums2, n);
	
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int inc = 0;
		for (int i=0; i<nums1.length; i++) {
			//int temp = nums1[i];
			for (int j=inc; j<nums2.length; j++ ) {
				if (nums1[i] <= nums2[j]) {
					if (i >= m) {
						nums1[i] = nums2[j];
						inc++;
						m++;
					} else {
						break;
					}
				} else {
					
					int k=nums1.length-1;
					while (k>i) {
						nums1[k] = nums1[k-1];
						k--;
					}
					nums1[i] = nums2[j];
					m++;
					inc++;
				}
				
			}
		}
		
		for (int l : nums1) {
			System.out.print(l+" ");
		}
		
		System.out.println();
		for (int l : nums2) {
			System.out.print(l+" ");
		}
		
    }

}
