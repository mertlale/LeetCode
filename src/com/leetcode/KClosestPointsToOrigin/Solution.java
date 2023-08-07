package com.leetcode.KClosestPointsToOrigin;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public int[][] kClosest(int[][] points, int k) {

        /*
        This will sort the array with their square sums. Ascending order. If we swap the parameters in Integer.compare(),
        then they will be sorted in descending order.
        Integer.compare(a,b) returns less than zero (b>a) , 0 (equal), greater than zero (a>b)
        */
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) ->
                Integer.compare(
                        (a[0] * a[0] + a[1] * a[1]),
                        (b[0] * b[0] + b[1] * b[1]))
        );

        for (int[] point : points) {
            q.add(point);
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] cur = q.poll();
            ans[i][0] = cur[0];
            ans[i][1] = cur[1];
        }

        return ans;
    }
}
