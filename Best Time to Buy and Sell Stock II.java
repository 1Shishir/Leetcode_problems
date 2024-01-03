//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/


class Solution {
    public int maxProfit(int[] prices) {
        int firstDay=0;
        int secDay=0;
        int maxx=0;
        
        for(int i=1;i<prices.length;i++){
            firstDay=Math.max(0, firstDay=prices [i]-prices[i-1]);
            secDay=Math.max(0,secDay+=firstDay);
            maxx=Math.max(maxx, secDay);
        }
      return maxx;  
 maxx=0   }
}