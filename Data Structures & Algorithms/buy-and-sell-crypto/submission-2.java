class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxi = 0;

       int i=0;
       int j=prices.length-1;

       for(int price:prices)
       {
         minPrice = Math.min(minPrice , price );
         int profit = price - minPrice;
         maxi = Math.max(maxi , profit );
       }
       return maxi;
    }
}
