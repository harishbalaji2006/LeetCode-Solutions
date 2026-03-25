class Solution {
    public int maxProfit(int[] prices) {
        int p=prices[0];
        int max=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<p){
                p=prices[i];
            }
            profit=prices[i]-p;
            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
}