package com.leetcode.ContainsDuplicate;

public class TestContainsDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Contains Duplicate: " + solution.containsDuplicate(nums1)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Contains Duplicate: " + solution.containsDuplicate(nums2)); // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Contains Duplicate: " + solution.containsDuplicate(nums3)); // Output: true
    }
}

