class Solution {
    public int maxProfit(int[] prices) {
        int highestProfit = 0;
        int dip = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length;i++) {
            if (prices[i] < dip) dip = prices[i];
            else if (highestProfit < prices[i] - dip) {
                highestProfit = prices[i] - dip;
            }
        }
        return highestProfit;
        
    }
}