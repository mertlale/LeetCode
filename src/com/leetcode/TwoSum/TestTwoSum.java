package com.leetcode.TwoSum;

public class TestTwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        // Solution 1
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println("Solution1 : [" + result[0] + ", " + result[1] + "]");
        // Solution 2
        Solution solution2 = new Solution();
        int[] result2 = solution2.twoSum(nums, target);
        System.out.println("Solution2 : [" + result2[0] + ", " + result2[1] + "]");
    }
}
