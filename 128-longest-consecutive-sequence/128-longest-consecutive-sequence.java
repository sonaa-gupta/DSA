class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int count=0,max=0,currentnum;
        for(int i:nums)
        {
            if(!set.contains(i-1))
            {
                currentnum=i;count=1;
            
            while(set.contains(currentnum+1))
            {
                count++;
                currentnum+=1;
            }}
            max=Math.max(count,max);
            
                
        }
        return max;}
}