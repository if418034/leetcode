package org.leetcode;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4, 9};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = 1;
        while (right <= prices.length - 1) {
            int now = prices[right] - prices[left];
            if (prices[left] > prices[right]) {
                right++;
                left++;
                continue;
            }
            if (now > profit) {
                profit = now;
            } else {
                right++;
            }
        }
        return profit;
    }

}
