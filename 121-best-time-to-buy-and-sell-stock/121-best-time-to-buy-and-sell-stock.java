class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0,n=prices.length,max;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<mini)
                mini=prices[i];
            max=prices[i]-mini;
                    if(max>maxpro)
                        maxpro=max;
                }
            
        
      return maxpro;  
}}