class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int i=0,j=1;
        while(j<n)
        {
            if(arr[j]!=0 && arr[i]==0)
            {
                int temp=arr[i];arr[i]=arr[j];arr[j]=0;
                i++;j++;
            }
            else if(arr[i]!=0 && arr[j]==0){i++;j++;}
            else if(arr[j]==0 )
            {
                j++;
            }
            else{
                i++;j++;
            }
            
        }
        }}
        
