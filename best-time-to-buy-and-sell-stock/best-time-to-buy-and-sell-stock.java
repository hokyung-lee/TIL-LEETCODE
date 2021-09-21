class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = prices[0];
        
        for(int i = 0; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(prices[i] - minValue, maxProfit);
        }
        
        return maxProfit;
    }
}