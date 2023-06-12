package com.leetcode.ValidPalindrome;

public class TestValidPalindrome {
    public static void main(String[] args) {
        // Test Case 1
        String s1 = "A man, a plan, a canal: Panama";
        Solution solution = new Solution();
        boolean isValid1 = solution.isPalindrome(s1);
        System.out.println("Is Valid Palindrome? " + isValid1); // Output: true

        // Test Case 2
        String s2 = "race a car";
        boolean isValid2 = solution.isPalindrome(s2);
        System.out.println("Is Valid Palindrome? " + isValid2); // Output: false

        // Test Case 3
        String s3 = "";
        boolean isValid3 = solution.isPalindrome(s3);
        System.out.println("Is Valid Palindrome? " + isValid3); // Output: true
    }
}
