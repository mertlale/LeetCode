package com.leetcode.BinarySearch;

public class TestBinarySearch {
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = { -1, 0, 3, 5, 9, 12 };
        int target1 = 9;
        Solution solution = new Solution();
        int index1 = solution.search(nums1, target1);
        System.out.println("Target found at index: " + index1); // Output: 4

        // Test Case 2
        int[] nums2 = { -1, 0, 3, 5, 9, 12 };
        int target2 = 2;
        int index2 = solution.search(nums2, target2);
        System.out.println("Target found at index: " + index2); // Output: -1

        // Test Case 3
        int[] nums3 = { 2, 5, 8, 12, 16 };
        int target3 = 16;
        int index3 = solution.search(nums3, target3);
        System.out.println("Target found at index: " + index3); // Output: 4
    }
}
