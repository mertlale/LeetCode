package com.leetcode.ClimbingStairs;

public class TestClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n1 = 2;
        System.out.println("Distinct Ways to Climb Stairs: " + solution.climbStairs(n1)); // Output: 2

        int n2 = 3;
        System.out.println("Distinct Ways to Climb Stairs: " + solution.climbStairs(n2)); // Output: 3

        int n3 = 4;
        System.out.println("Distinct Ways to Climb Stairs: " + solution.climbStairs(n3)); // Output: 5
    }
}
