class Solution {
    public int addDigits(int num) {
       
       int sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        while(sum>9)
        {
            int x=sum;
            int m=0;
            while(x!=0)
            {
                m=m+x%10;
                x=x/10;
            }
        sum=m;
        }
        return sum;
    }
}