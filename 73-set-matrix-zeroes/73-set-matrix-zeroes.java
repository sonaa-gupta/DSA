class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int c=0;
        int col = matrix[0].length;
        for(int i=0;i<row;i++)
        {
            if(matrix[i][0]==0)
               c=1;
            for(int j=1;j<col;j++)
            {
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                matrix[0][j]=0;}
            }
            
        }
        for(int i=row-1;i>=0;i--)
        {
            for(int j=col-1;j>0;j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
}
        }
        if(c==1)
        {
            for(int i=0;i<row;i++)
                matrix[i][0]=0;
        }
    }
}