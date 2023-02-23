class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int l=0,h=nums.length-1;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[h]!=nums[h-1]) return nums[h];
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            
            if((mid-1>0 && mid+1<nums.length) && nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
                return nums[mid];
            
            else if((nums[mid]==nums[mid+1] && mid%2==0) || (nums[mid]==nums[mid-1] && mid%2!=0))
                   l=mid+1;
            
            else h=mid-1;
            
        }
                    return nums[l];
        
    }
}