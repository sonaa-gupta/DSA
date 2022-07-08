class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        ArrayList<int[]> ans=new ArrayList<>();
        int current_interval[]=intervals[0];
        for(int[] inter:intervals)
        {
            if(current_interval[1]>=inter[0])
            {
                if(current_interval[1]<=inter[1])
                    current_interval[1]=inter[1];
}
            else
            {
                ans.add(current_interval);
                current_interval=inter;
            }
        }
        ans.add(current_interval);
         int[][] graph=new int[ans.size()][2];
        int k=0;
        for(int[] i:ans)
            
        {
            graph[k++]=i;
        }
        return graph;
    }
}