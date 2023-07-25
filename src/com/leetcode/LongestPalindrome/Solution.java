package com.leetcode.LongestPalindrome;

import java.util.HashMap;

/* HashMap solution
Runtime = 7 ms (beats 43.63%)
Memory = 40.73 (beats 81.9%)
 */

public class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        int length = 0;

        for (char c : charCounts.keySet()) {
            int count = charCounts.get(c);

            if (count > 1) {
                if (count % 2 == 0) {
                    length += count;
                } else {
                    length += (count - 1);
                }
            }
        }

        if (length < s.length())
            length++;

        return length;
    }
}
