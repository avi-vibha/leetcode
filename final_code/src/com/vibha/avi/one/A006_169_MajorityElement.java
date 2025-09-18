/*
 169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
 */

package com.vibha.avi.one;

public class A006_169_MajorityElement {

}


/*
 s an implementation of the Boyer–Moore Majority Vote Algorithm, 
 a very efficient algorithm to find the majority element in an array.

Problem Context

The majority element is defined as the element that appears more than ⌊n/2⌋ times in an array of size n.
The Boyer–Moore algorithm solves this in O(n) time and O(1) space.

public int majorityElement(int[] nums) {
    int candidate = -1;   // potential majority element
    int count = 0;        // balance counter

    candidate: keeps track of the current potential majority element.
    count: represents a "vote balance" for the candidate.

for (int num : nums) {
    if (count == 0) {
        candidate = num; // pick a new candidate
    }
    count += (num == candidate) ? 1 : -1;
}   

    Iteration through array:

    If count == 0, it means no current candidate, so we pick the current num as the new candidate.
    Then we vote:
    If num == candidate, increment count (+1 vote).
    Else, decrement count (-1 vote).
    Why this works:
    Think of it as pairing off different elements:
    A candidate matched with itself strengthens its position (count increases).
    A different number cancels one occurrence of the candidate (count decreases).
    Since the majority element appears more than n/2 times, it will survive all cancellations and end up as the candidate.


    return candidate;
}

    After finishing the loop, the surviving candidate is guaranteed 
    to be the majority element (given the problem guarantees one exists).

    
    */