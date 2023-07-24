package com.leetcode.FirstBadVersion;

public class Solution {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2; // !! (left + right) / 2  gives a "Time Limit Exceeded" error !!
            if (isBadVersion(mid)) {
                right = mid; // Search the left half (including mid) for the first bad version.
            } else {
                left = mid + 1; // Search the right half (excluding mid) for the first bad version.
            }
        }

        return left; // left and right are equal; return either of them.
    }

    // This is a hypothetical method provided by the problem (not implemented here).
    // It should return true if the given version is bad, false otherwise.
    private boolean isBadVersion(int version) {
        // Hypothetical implementation
        return version != 4; // 4 is arbitrary chosen for testing
    }
}

