class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit=prices[i]-min;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;

    }
}                                                     