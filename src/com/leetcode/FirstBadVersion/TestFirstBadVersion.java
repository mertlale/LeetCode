package com.leetcode.FirstBadVersion;

public class TestFirstBadVersion {
    public static void main(String[] args) {
        int n = 10; // Assuming there are 10 versions in total.
        Solution solution = new Solution();
        int firstBadVersion = solution.firstBadVersion(n);
        System.out.println("First Bad Version: " + firstBadVersion);
    }

    // The hypothetical isBadVersion method (should be provided by the problem).
    // It should return true if the given version is bad, false otherwise.
    private static boolean isBadVersion(int version) {
        // Hypothetical implementation
        return version >= 4; // For testing purposes, assume bad versions start from 4.
    }
}
