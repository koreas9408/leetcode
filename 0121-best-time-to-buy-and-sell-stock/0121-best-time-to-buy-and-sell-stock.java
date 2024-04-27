class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int buyPrice = 100_000;
        int sellPrice = 0;

        int idx = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == 0) continue;
            if (buyPrice > prices[i] && (i != prices.length-1)) {
                buyPrice = prices[i];
                idx = i;
            }
        }

        for (; idx < prices.length; idx++) {
            if (sellPrice < prices[idx]) {
                sellPrice = prices[idx];
            }
        }

        return sellPrice - buyPrice;
    }
}