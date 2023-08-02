package com.leetcode.ZeroOneMatrix;

public class TestZeroOneMatrix {
    // Helper method to print a 2D array.
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matrix1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] result1 = solution.updateMatrix(matrix1);
        printMatrix(result1);
        /* Output:
           0 0 0
           0 1 0
           0 0 0
        */

        int[][] matrix2 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] result2 = solution.updateMatrix(matrix2);
        printMatrix(result2);
        /* Output:
           0 0 0
           0 1 0
           1 2 1
        */
    }
}

