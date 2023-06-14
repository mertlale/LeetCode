package com.leetcode.ValidAnagram;

public class TestValidAnagram {
    public static void main(String[] args) {
        // Test Case 1
        String s1 = "anagram";
        String t1 = "nagaram";
        Solution solution = new Solution();
        boolean isValid1 = solution.isAnagram(s1, t1);
        System.out.println("Is Valid Anagram? " + isValid1); // Output: true

        // Test Case 2
        String s2 = "rat";
        String t2 = "car";
        boolean isValid2 = solution.isAnagram(s2, t2);
        System.out.println("Is Valid Anagram? " + isValid2); // Output: false

        // Test Case 3
        String s3 = "listen";
        String t3 = "silent";
        boolean isValid3 = solution.isAnagram(s3, t3);
        System.out.println("Is Valid Anagram? " + isValid3); // Output: true
    }
}

