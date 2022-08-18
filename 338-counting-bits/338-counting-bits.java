class Solution {
    public int[] countBits(int n) {
        
        int x[]=new int[n+1];
        int prev=0;
       
        for(int i=0;i<=n;i++)
        {
           int num=i;
            int count=0;
            while(num>0)
            {
                if(x[num]>0)
                {
                    count+=x[num];break;
                }
                if(num%2==1)
                {
                    count+=1;
                }
                num=num/2;
            }
            x[i]=count;
        }
        return x;
    }
}