/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int mid,first=0,last=n,prevV=-1;
        while(first<=last)
        {
            mid=first+(last-first)/2;
            if(!isBadVersion(mid))
                first=mid+1;
            else
            {
                prevV=mid;
                last=mid-1;
            }
           
        }
        return prevV;
        
    }
}