class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; 
        int purchase = 100000;  
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < purchase) {
                purchase = prices[i]; 
            }
            int potential = prices[i + 1] - purchase; 
            if (potential > profit) {
                profit = potential; 
            }
        }
        return profit; 
    }
}