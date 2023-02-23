class Solution {
    public int findSpecialInteger(int[] arr) {
        int req=arr.length/4;
        int prev=-1,count=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==prev)
                count++;
            else{
                count=1;prev=arr[i];
            }
            if(count>req)
                return prev;
        }
        return-1;
    }
}