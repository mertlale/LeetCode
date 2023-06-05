package com.leetcode.TwoSum;

//  Solution 1
//  Time Complexity: O(n); Space Complexity: O(1);
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i < j && (nums[i] + nums[j] == target)) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
