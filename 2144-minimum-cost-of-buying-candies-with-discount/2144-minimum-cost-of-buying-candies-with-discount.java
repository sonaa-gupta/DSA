class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        int i=n-1,j=n-2;
        int prof=0;
        if(cost.length==1)
        {
            return cost[0];
        }
        while(j>=0 && i>=0)
        {
            prof+=cost[i]+cost[j];
            i=i-3;
            j=j-3;
        }
        if(i==0 && j<0) prof+=cost[i];
        return prof;
    }
}