class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=1;i<=n;i++)
          sum+=i;
        int sum2=0;
        for(int i=0;i<n;i++)
            sum2+=nums[i];
        return sum-sum2;
        }
}