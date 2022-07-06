class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        if(nums == null || nums.length == 1)
            return;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        if(i>=0){
        int j=nums.length-1;
            while(nums[i]>=nums[j] && j>0)
                j--;
            swap(nums,i,j);
        
    }
        reverse(nums,i+1,nums.length-1);
}
   static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void reverse(int[] nums,int i,int l)
    {
        int j=l;
        for(;i<=j;i++,j--)
        {
            swap(nums,i,j);
        }
    }
}