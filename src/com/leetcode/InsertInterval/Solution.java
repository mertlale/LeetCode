package com.leetcode.InsertInterval;

import java.util.ArrayList;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> res = new ArrayList<>();
        for (int[] interval: intervals) {
            // If the newInterval is already inserted (which means newInterval is null), or it comes later than the interval element we compare (without overlapping)
            // just add the interval element to the list. And skip to the next interval element in "intervals".
            if (newInterval == null || interval[1] < newInterval[0]) {
                res.add(interval);
            } else if (newInterval[1] < interval[0]) {
                // If the newInterval comes before from the compared interval element (without overlapping),
                // add newInterval to the list, then equal it to null (to indicate newInterval is inserted).
                // Finally, add compared interval after it.
                res.add(newInterval);
                newInterval = null;
                res.add(interval);
            }
            else { // If the newInterval and compared interval element overlap, merge them.
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        if (newInterval != null) res.add(newInterval); // if the newInterval comes later of all elements in the list of "intervals".

        return res.toArray(new int[res.size()][]); // toArray() returns Object[], we need to cast it to int[][] with the same size of res.
    }
}
