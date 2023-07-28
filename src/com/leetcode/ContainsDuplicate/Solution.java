package com.leetcode.ContainsDuplicate;

import java.util.HashMap;
import java.util.HashSet;

/*
1) Solution with HashMap counts
 */
//public class Solution {
//    public boolean containsDuplicate(int[] nums) {
//
//        HashMap<Integer, Integer> counts = new HashMap<>();
//
//        for (int num : nums) {
//            int count = counts.getOrDefault(num, 0);
//            if (count >= 1) return true;
//            counts.put(num, count + 1);
//        }
//
//        return false;
//    }
//}

/*
2) Solution with HashSet
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}