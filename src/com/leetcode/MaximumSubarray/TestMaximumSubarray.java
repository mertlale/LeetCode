package com.leetcode.MaximumSubarray;

public class TestMaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums1)); // Output: 6 (Subarray: [4, -1, 2, 1])

        int[] nums2 = {1};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums2)); // Output: 1 (Subarray: [1])

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums3)); // Output: 23 (Subarray: [5, 4, -1, 7, 8])
    }
}

