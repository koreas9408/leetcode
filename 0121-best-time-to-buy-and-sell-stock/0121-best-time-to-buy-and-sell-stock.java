class Solution {
    public int maxProfit(int[] prices) {
        // 처음 가격을 담아주고
        int buyPrice = prices[0];
        // 다음에 더 저렴한 가격이 있다면 해당 가격으로 담아준다.
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            // 현재가격
            int currentPrice = prices[i];
            
            if (currentPrice < buyPrice) {
                buyPrice = currentPrice;
            }

            // 현재가격과 - 내가산가격 = 이익(profit)
            if (currentPrice - buyPrice > profit) {
                profit = currentPrice - buyPrice;
            }
        }

        return profit;
    }
}