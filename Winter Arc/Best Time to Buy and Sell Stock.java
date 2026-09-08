//! 121. Best Time to Buy and Sell Stock
//TC:O(N)
//SC:O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int current = prices[0];
        for (int i = 0; i < prices.length; i++) {
             current = Math.min(current, prices[i]);
            profit = Math.max(profit, prices[i] - current);
        }
        return profit;
    }
}