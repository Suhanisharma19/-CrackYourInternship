class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                 minPrice=prices[i];
            }
            else if (prices[i] - minPrice > maxprofit) {
                maxprofit = prices[i] - minPrice;
            }
        }
        return maxprofit;
    }
}