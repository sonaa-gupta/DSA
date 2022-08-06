
class Solution {
    
    public int orangesRotting(int[][] grid) {
        int count_fresh=0;
        if(grid==null || grid.length==0) return 0;
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                    q.add( new int[] {i,j});
                if(grid[i][j]!=0) count_fresh++;
        }
    }
        if(count_fresh==0) return 0;
        int mincount=0,cn=0;
        int dx[]={0,0,1,-1};
       int dy[]={1,-1,0,0,};
        while(!(q.isEmpty()))
        {
            int size=q.size();
            cn+=size;
            for(int j=0;j<size;j++){
                         int z[]=q.poll();
                int x=z[0],y=z[1];

            for(int i=0;i<4;i++)
            {
                int m=x+dx[i],n=y+dy[i];
               if(m<0 || m>=grid.length || n<0 || n>=grid[0].length || grid[m][n]==0 || grid[m][n]==2) continue;
                grid[m][n]=2;
                q.add(new int[]{m,n});
}}
                if(q.size()!=0) mincount++;}
            

    return count_fresh==cn? mincount:-1;
        
}}