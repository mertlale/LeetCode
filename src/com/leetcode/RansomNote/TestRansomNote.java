package com.leetcode.RansomNote;

public class TestRansomNote {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Can Construct? " + solution.canConstruct(ransomNote1, magazine1)); // Output: false

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Can Construct? " + solution.canConstruct(ransomNote2, magazine2)); // Output: false

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Can Construct? " + solution.canConstruct(ransomNote3, magazine3)); // Output: true
    }
}
