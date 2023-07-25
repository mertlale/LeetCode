package com.leetcode.ClimbingStairs;

/*
Tabulation
Explanation: The tabulation solution eliminates recursion and uses a bottom-up approach to solve the problem iteratively.
It creates a DP table (dp) of size n+1 to store the number of ways to reach each step.
The base cases (0 and 1 steps) are initialized to 1 since there is only one way to reach them.
Then, it iterates from 2 to n, filling in the DP table by summing up the values for the previous two steps.
Finally, it returns the value in the last cell of the DP table, which represents the total number of ways to reach the top.
*/

//public class Solution {
//    public int climbStairs(int n) {
//
//        int first = 1;
//        int second = 1;
//
//        for (int i = 0; i < n-1; i++) {
//            int temp = first;
//            first = first + second;
//            second = temp;
//        }
//
//        return first;
//    }
//}

/*
Space Optimization

Explanation: The space-optimized solution further reduces the space complexity by using only two variables
(prev and curr, aka second and first) instead of an "entire DP table". ( [curr, prev] or [first, second] )
It initializes prev and curr to 1 since there is only one way to reach the base cases (0 and 1 steps).
Then, in each iteration, it updates prev and curr by shifting their values.
curr becomes the sum of the previous two values, and prev stores the previous value of curr.
 */

public class Solution {
    public int climbStairs(int n) {

        int first = 1;
        int second = 1;

        for (int i = 0; i < n-1; i++) {
            int temp = first;
            first = first + second;
            second = temp;
        }

        return first;
    }
}
