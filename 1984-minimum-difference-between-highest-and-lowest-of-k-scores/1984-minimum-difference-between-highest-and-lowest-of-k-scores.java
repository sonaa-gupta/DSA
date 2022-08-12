class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min1=Integer.MAX_VALUE;
        int diff=0;
        for(int i=0;i<nums.length-k+1;i++)
        {
           diff=nums[i+k-1]-nums[i];
            min1=Math.min(diff,min1);
        }
        return min1;
    }
}