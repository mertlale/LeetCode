package com.leetcode.RansomNote;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> charCountMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) <= 0) {
                return false;
            }

            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        return true;
    }

}
