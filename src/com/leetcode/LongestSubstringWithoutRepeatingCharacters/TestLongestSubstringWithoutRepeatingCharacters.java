package com.leetcode.LongestSubstringWithoutRepeatingCharacters;

public class TestLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        String s1 = "abcabcbb";
//        System.out.println(solution.lengthOfLongestSubstring(s1)); // Output: 3
//
//        String s2 = "bbbbb";
//        System.out.println(solution.lengthOfLongestSubstring(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s3)); // Output: 3

        String s4 = "tmmzuxt";
        System.out.println(solution.lengthOfLongestSubstring(s4)); // Output: 5
    }
}
