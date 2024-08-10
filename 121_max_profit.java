
class Solution {
  public int maxProfit(int[] prices) {
    
    int profit = 0;
    int start = 0; 
    for (int end = 1; end < prices.length; end++) {
      int buy = prices[start]; 
      int sell = prices[end];
      if (sell > buy) {
        profit = Math.max(profit, sell - buy);
 
      }else{
        start = end; 
      }
    }
    return profit; 
  }
}