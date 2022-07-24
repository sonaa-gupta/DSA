class Solution {
    public int arrangeCoins(int n) {
     
        long l=0,h=n;
        while(l<=h)
        {
            long mid=l+(h-l)/2;
            long curr=mid*(mid+1)/2;
            if(curr==n) return (int)mid;
            else if(curr<n) l=mid+1;
            else h=mid-1;
        }
        return(int)h;
    }
}