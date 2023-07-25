package com.leetcode.LongestPalindrome;

/* Solution with ASCII number arrays
Runtime = 1 ms (beats 100.00%)
Memory = 40.73 (beats 69.42%)
 */

public class Solution2 {
    public int longestPalindrome(String s) {
        int[] charCounts = new int[128]; // ASCII numbers of alphabet are in [65,122]. Starting with capitals(ex. int('A') = 65

        for (char c : s.toCharArray()) {
            charCounts[c]++; // if we write charCounts['A'], it automatically converts the char to its ASCII number. Equals to charCounts[65].
        }

        int length = 0; // Longest Palindrome Length

        for (int count : charCounts) {
            length += count / 2 * 2; // With using integer division, we get rid of remainder 1. Ex: 3 / 2 * 2 => 1 * 2 => 2
        }

        if (length < s.length())
            length++;

        return length;
    }
}
