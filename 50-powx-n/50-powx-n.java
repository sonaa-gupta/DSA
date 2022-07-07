class Solution {
    public double myPow(double x, int n) {
      if(n>=0)
          return myp(x,n);
        else 
        return (1/myp(x,n));
    }
    static double myp(double x,int n)
    {
        double ans;
        if(n==0) return 1.0000;
        if(n==1) return x;
        double hals_ans=myp(x,n/2);
        if(n%2==0)
            ans=hals_ans*hals_ans;
        else 
           ans=hals_ans*hals_ans*x;
        return ans;
    }
}