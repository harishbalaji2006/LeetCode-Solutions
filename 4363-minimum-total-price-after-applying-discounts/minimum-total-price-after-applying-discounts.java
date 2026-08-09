class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length - 1;
        int j = discounts.length - 1;
        double sum = 0;
        while(i >= 0 && j >= 0) {
            double a = prices[i] * (100 - discounts[j]) / 100.0;
            sum += a;
            prices[i] = 0;
            i--;
            j--;
        }
        for(int k=0;k<prices.length;k++) {
            if(prices[k] != 0) sum += prices[k];
        }
        return sum;
    }
}