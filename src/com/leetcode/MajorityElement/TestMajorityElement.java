package com.leetcode.MajorityElement;

public class TestMajorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 3};
        System.out.println("Majority Element: " + solution.majorityElement(nums1)); // Output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + solution.majorityElement(nums2)); // Output: 2
    }
}


