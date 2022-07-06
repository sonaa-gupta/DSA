class Solution {
    public int findDuplicate(int[] nums) {
      int t=nums[0],h=nums[0];
        while(true)
        {
            h=nums[nums[h]];t=nums[t];
            if(h==t) break;
        }
        t=nums[0];
        while(t!=h){
            h=nums[h];t=nums[t];
        }
        
        
       return t;
    }
}