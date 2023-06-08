package com.leetcode.BestTimeToBuyAndSellStock;

public class TestBestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // Test Case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        Solution solution = new Solution();
        int maxProfit1 = solution.maxProfit(prices1);
        System.out.println("Max Profit: " + maxProfit1); // Output: 5

        // Test Case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        int maxProfit2 = solution.maxProfit(prices2);
        System.out.println("Max Profit: " + maxProfit2); // Output: 0

        // Test Case 3
        int[] prices3 = {3, 8, 1, 4, 10};
        int maxProfit3 = solution.maxProfit(prices3);
        System.out.println("Max Profit: " + maxProfit3); // Output: 7
    }
}
