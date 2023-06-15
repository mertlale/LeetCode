package com.leetcode.FloodFill;

import java.util.Arrays;

public class TestFloodFill {
    public static void main(String[] args) {
        // Test Case 1
        int[][] image1 = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr1 = 1, sc1 = 1, newColor1 = 2;
        Solution solution = new Solution();
        int[][] result1 = solution.floodFill(image1, sr1, sc1, newColor1);
        System.out.println("Updated Image:");
        printImage(result1); // Output: [[2, 2, 2], [2, 2, 0], [2, 0, 1]]

        // Test Case 2
        int[][] image2 = {
                {0, 0, 0},
                {0, 1, 1}
        };
        int sr2 = 1, sc2 = 1, newColor2 = 1;
        int[][] result2 = solution.floodFill(image2, sr2, sc2, newColor2);
        System.out.println("Updated Image:");
        printImage(result2); // Output: [[0, 0, 0], [0, 1, 1]]
    }

    private static void printImage(int[][] image) {
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }
}

