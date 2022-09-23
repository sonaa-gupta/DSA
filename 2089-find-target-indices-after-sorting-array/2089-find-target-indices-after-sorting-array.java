class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> l=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                l.add(i);
            else if(nums[i]>target)
                break;
}
        return l;
    }
}