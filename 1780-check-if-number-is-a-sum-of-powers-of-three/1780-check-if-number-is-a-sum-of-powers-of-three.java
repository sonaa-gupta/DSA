class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i=n/3;i>=0;i--)
        {
            if((int)Math.pow(3,i)<=n)
            {
                n=n-(int)Math.pow(3,i);
            }
        }
        return n==0;
    }
}