// !!!!!!! Exceeds Time Limit !!!!!!! //
// The solution needs to be optimized //
package com.leetcode.BestTimeToBuyAndSellStock;

public class Solution2 {
    public int maxProfit(int[] prices) {

        int maxValue = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxValue) {
                    maxValue = profit;
                }
            }
        }

        return maxValue;
    }
}


