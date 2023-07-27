package com.leetcode.MajorityElement;

import java.util.Arrays;
import java.util.HashMap;

/*
1) Solution with HashMap
Runtime = 12 ms (Beats 36.79%) = O(n)
Memory = 47.36% (Beats 69.79%) = O(n)
 */

//public class Solution {
//    public int majorityElement(int[] nums) {
//
//        HashMap<Integer, Integer> numCount = new HashMap<>();
//
//        for (int num : nums) {
//            int count = numCount.getOrDefault(num, 0) + 1;
//
//            if (count > nums.length / 2) return num;
//
//            numCount.put(num, count);
//        }
//
//        return 0;
//    }
//}

/*
2) Solution with Boyer-Moore Voting Algorithm
Runtime = 1 ms (Beats 99.82%) = O(n)
Memory = 48.8 MB (Beats 24%) = O(1)

The basic idea of the algorithm is to cancel out pairs of different elements and eventually find the majority element.
Hold only one element's count and if another element comes while iterating decrease count by 1. If count becomes zero
change the result with the next visited element, and set the count to 1. (Which means majority element is changed for that moment)
 */

public class Solution {
    public int majorityElement(int[] nums) {

        int result = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0)
                result = num;
            count += (result == num) ? 1 : -1;
        }

        return result;
    }
}


/*
3) Solution with Sorting
Runtime = 2 ms (Beats 64.48%) = O(n log n)
Memory = 48.88 MB (Beats 24%) = O(1)

Sort the Array and take the element in the middle
 */

//public class Solution {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];
//    }
//}