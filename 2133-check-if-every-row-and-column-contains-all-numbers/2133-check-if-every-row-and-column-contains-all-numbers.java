class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=0;i<matrix.length;i++)
        {
            int x[]=new int[n+1];
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<matrix[0].length;j++)
            {
               if(x[matrix[i][j]]==1)
                   return false;
                else 
                    x[matrix[i][j]]++;
            }
            for(int k=1;k<n+1;k++)
            {
                if(x[k]==0) return false;
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            int x[]=new int[n+1];
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<matrix.length;j++)
            {
               if(x[matrix[j][i]]==1)
                   return false;
                else 
                    x[matrix[j][i]]++;
            }
            for(int k=1;k<n+1;k++)
            {
                if(x[k]==0) return false;
            }
        }
        return true;
        
    }
}