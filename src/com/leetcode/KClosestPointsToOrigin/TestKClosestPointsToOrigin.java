package com.leetcode.KClosestPointsToOrigin;

public class TestKClosestPointsToOrigin {
    // Helper method to print a 2D array.
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[" + row[0] + "," + row[1] + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] points1 = {{1, 3}, {-2, 2}};
        int[][] result1 = solution.kClosest(points1, 1);
        printMatrix(result1); // Output: [{-2,2}]

        int[][] points2 = {{3, 3}, {5, -1}, {-2, 4}};
        int[][] result2 = solution.kClosest(points2, 2);
        printMatrix(result2); // Output: {{-2,4} , {3,3}}
    }
}

