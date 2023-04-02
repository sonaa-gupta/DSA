class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int count[]=new int[spells.length];
        Arrays.sort(potions);
        
        for(int i=0;i<spells.length;i++)
        {
           int spell=spells[i];
            int maxpoint=potions[potions.length-1];
            long min =(long) Math.ceil((1.0*success)/spell);
            if(min>maxpoint){
                count[i]=0;continue;}
            
            int lowerbound=lower(potions,(int)min);
            count[i]=potions.length-lowerbound;
            
        }
        return count;
    }
    int lower(int[] num,int x)
    {
        int low=0,high=num.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(num[mid]<x)
                low=mid+1;
                else high=mid-1;
        }
        return low;
    }
}