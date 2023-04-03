class Solution {
    public int numRescueBoats(int[] p, int limit) {
      
        Arrays.sort(p);
        int sum=0;
        int i=0,j=p.length-1,boat=0;
        while(i<=j)
        {
            boat++;
            if(p[i]+p[j]<=limit)
            {
                i++;
            }
            j--;
            
        }
        return boat;
    }
}