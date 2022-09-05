class Solution {
    public int trap(int[] height) {
        int L=0,R=height.length-1;
        int maxl=Integer.MIN_VALUE;
        int maxr=Integer.MIN_VALUE;
        int ans=0;
        
        while(L<=R)
        {
            int l=height[L],r=height[R];
            if(l<r)
            {
                if(l>=maxl)
                    maxl=l;
                else 
                ans+=maxl-l;
                L++;
            }
            else 
            {
                if(r>=maxr)
                    maxr=r;
                else 
                ans+=maxr-r;
                R--;
            }
            
            
                
        }
        return ans;
    }
}