package com.leetcode.thirtydaychallenge;
/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/

class SingleNumber {
    public int solution(int[] nums) {

        int i = 1;
        while(i < nums.length) {
            nums[0] = nums[0]^nums[i];
            i++;
        }
        
        return nums[0];
    }
}
