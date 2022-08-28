class Solution {
    
     PriorityQueue<Integer> pq=new PriorityQueue<>();
    
    public int[][] diagonalSort(int[][] mat) {
    
        int seen[][]=new int[mat.length][mat[0].length];
            
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    if(seen[i][j]!=1)
                    {
                        diag(mat,i,j);
                        filldiag(mat,i,j,seen);
                    }
                }
            }
        return mat;
    }
    void diag(int mat[][],int i,int j)
    {
        if(i<mat.length && j<mat[0].length)
        {
            pq.add(mat[i][j]);
            diag(mat,i+1,j+1);
}
    }
    
    void filldiag(int mat[][],int i,int j,int[][] seen)
    {
        if(!(pq.isEmpty()))
        {
            mat[i][j]=pq.poll();
            seen[i][j]=1;
            filldiag(mat,i+1,j+1,seen);
        }
}
}