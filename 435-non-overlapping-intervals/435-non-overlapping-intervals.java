class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
      int current[]=intervals[0];int res=0;
        if(intervals.length==1) return 0;
        for(int i=1;i<intervals.length;i++)
        {
            if(current[1]>intervals[i][0]){
               res++;
                current[1]=Math.min(intervals[i][1],current[1]);
            }
          else
            current[1]=intervals[i][1];
        }
  return res;}}