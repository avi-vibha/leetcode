/*
 80. Remove Duplicates from Sorted Array II

Given an integer array nums sorted in non-decreasing order, 
remove some duplicates in-place such that each unique element appears at most twice. 
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages,
 you must instead have the result be placed in the first part of the array nums. 
 More formally, if there are k elements after removing the duplicates, 
 then the first k elements of nums should hold the final result. 
 It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. 
You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 */

 package com.vibha.avi.one;

public class A005_80_RemoveDuplicates2 {

	public static void main(String[] args) {
		
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates (nums);
			
	}	
	
	public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0; // length of the result (and next write position)

        for (int i = 0; i < n; i++) {
 
            if (k < 2 || nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
	
}

/*
 Here’s a clean, in-place O(1) space solution using the classic two-pointer pattern.

Idea (why it works)

Because nums is non-decreasing, equal values are contiguous. 
We can keep a write pointer k that marks the length of the “good” prefix we’re building.
For each number x we scan:

Always keep the first two occurrences of any value.

For further occurrences of the same value, skip them.

A compact way to express “keep at most two” is:

Write nums[i] if k < 2 (we haven’t filled two spots yet) or nums[i] != nums[k-2] 
(meaning this value would be the 1st or 2nd occurrence relative to what we’ve already written).
 */