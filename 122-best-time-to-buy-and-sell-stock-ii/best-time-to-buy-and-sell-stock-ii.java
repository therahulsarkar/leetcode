class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                max = Math.max(max, max + (prices[i]-prices[i-1]));
            }
        }

        return max;
    }
}