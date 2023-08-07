package com.leetcode.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

/*
Sliding Window using HashSet
1. We use a set (charSet) to keep track of unique characters in the current substring.
2. We maintain two pointers, left and right, to represent the boundaries of the current substring.
3. The maxLength variable keeps track of the length of the longest substring encountered so far.
4. We iterate through the string using the right pointer.
5. If the current character is not in the set (charSet), it means we have a new unique character.
6. We insert the character into the set and update the maxLength if necessary.
7. If the character is already present in the set, it indicates a repeating character within the current substring.
8. In this case, we move the left pointer forward, removing characters from the set until the repeating character is no longer present.
9. We insert the current character into the set and continue the iteration.
10. Finally, we return the maxLength as the length of the longest substring without repeating characters.
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) { // while instead of if, because of same adjacent chars. ex = pWWkew
                charSet.remove(s.charAt(left));
                left += 1;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
