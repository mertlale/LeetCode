package com.leetcode.InsertInterval;

public class TestInsertInterval {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        int[][] mergedIntervals1 = solution.insert(intervals1, newInterval1);
        printIntervalArray(mergedIntervals1); // Output: [[1,5],[6,9]]

        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        int[][] mergedIntervals2 = solution.insert(intervals2, newInterval2);
        printIntervalArray(mergedIntervals2); // Output: [[1,2],[3,10],[12,16]]
    }

    // Helper method to print a 2D array of intervals.
    private static void printIntervalArray(int[][] intervals) {
        System.out.print("[");
        for (int i = 0; i < intervals.length; i++) {
            System.out.print("[" + intervals[i][0] + "," + intervals[i][1] + "]");
            if (i < intervals.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}


