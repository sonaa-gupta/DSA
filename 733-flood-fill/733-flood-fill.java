class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(newColor==image[sr][sc]){
           return image;
       }
       
        int k=image[sr][sc];
         dfs(sr,sc,k,newColor,image);
         return image;
    }
     void dfs(int i,int j,int k,int newColor,int[][] image)
    {
        if(i<0 || j<0 || i>=image.length || j>=image[0].length)
        return;
        
            if(image[i][j]!=k) 
            return;
            
                image[i][j]=newColor;
                dfs(i+1,j,k,newColor,image);
                dfs(i-1,j,k,newColor,image);
                dfs(i,j+1,k,newColor,image);
                dfs(i,j-1,k,newColor,image);
           
        
        return;}
    
}