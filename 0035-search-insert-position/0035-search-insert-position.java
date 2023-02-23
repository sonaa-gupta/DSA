class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int l=0,h=nums.length-1;
        if(nums[0]>target) return 0;
        if(nums[h]<target) return h+1;
        while(l<=h)
        {
          int mid=l+(h-1)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target && nums[mid+1]>target)
                return mid+1;
            else if(nums[mid]>target)
                h--;
            else l++;
        }
        return -1;
    }
    
}