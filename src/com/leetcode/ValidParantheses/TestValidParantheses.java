package com.leetcode.ValidParantheses;

public class TestValidParantheses {
    public static void main(String[] args) {
        String validStr = "[{}]";
        String invalidStr = "{]";
        Solution solution = new Solution();
        boolean result = solution.isValid(validStr);
        System.out.println("validStr result: " + result);
        result = solution.isValid(invalidStr);
        System.out.println("invalidStr result: " + result);
    }
}
