class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            n=findnext(n);
        }
        return n==1;
        
    }
    int findnext(int n)
    {
        int total=0;
        while(n!=0)
        {
            int x=n%10;
            total=total+x*x;
            n=n/10;
        }
        return total;
    }
}