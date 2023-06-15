package com.leetcode.FloodFill;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        // recursion maybe
        int oldColor = image[sr][sc];
        int rowsLength = image.length - 1;
        int columnsLength = image[0].length - 1;

        if (oldColor == color) {
            return image;
        }

        // depth first search
        dfs(image, sr, sc, rowsLength, columnsLength, oldColor, color);

        return image;
    }

    public void dfs(int[][] image, int row, int column, int rowsLength, int columnsLength, int oldColor, int newColor) {

        if (row < 0 || column < 0 || row > rowsLength || column > columnsLength || oldColor != image[row][column]) {
            return;
        }

        image[row][column] = newColor;

        dfs(image, row+1, column, rowsLength, columnsLength, oldColor, newColor);
        dfs(image, row-1, column, rowsLength, columnsLength, oldColor, newColor);
        dfs(image, row, column+1, rowsLength, columnsLength, oldColor, newColor);
        dfs(image, row, column-1, rowsLength, columnsLength, oldColor, newColor);
    }
}
