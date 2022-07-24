class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int i=0,j=matrix[0].length-1;
        if(matrix[0][0]==target) return true;
        while(i<matrix.length && j>=0)
        {
          
            if(matrix[i][j]==target) return true;
            else if(target<matrix[i][j]) --j;
            else  if(target>matrix[i][j]) ++i;
}
        return false;
    }
}