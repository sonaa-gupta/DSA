class Solution {
    public int minimumSum(int nums) {
     
     int arr[]=new int[4];
        int i=0;
        while(nums!=0)
        {
            arr[i++]=nums%10;
            nums=nums/10;
        }
        Arrays.sort(arr);
        int sum=arr[3]+arr[0]*10+arr[2]+arr[1]*10;
        return sum;
        
    }
}