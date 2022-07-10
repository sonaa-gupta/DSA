class Solution {
    
    public int climbStairs(int n) {
        int dp[]=new int[n];
        return climb(n,dp);}
    int climb(int n,int[] dp){
        if(n==1)
            return 1;
        else if(n==0)
            return 1;
         if(dp[n-1]!=0) return dp[n-1];
           dp[n-1]= climb(n-1,dp)+climb(n-2,dp);
        return dp[n-1];
        
    }
}