package com.leetcode.LongestPalindrome;

public class TestLongestPalindrome {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String s1 = "abccccdd";
        System.out.println("Longest Palindrome Length: " + solution.longestPalindrome(s1)); // Output: 7

        String s2 = "a";
        System.out.println("Longest Palindrome Length: " + solution.longestPalindrome(s2)); // Output: 1

        String s3 = "bb";
        System.out.println("Longest Palindrome Length: " + solution.longestPalindrome(s3)); // Output: 2

        String s4 = "ccc";
        System.out.println("Longest Palindrome Length: " + solution.longestPalindrome(s4)); // Output: 3
    }
}
