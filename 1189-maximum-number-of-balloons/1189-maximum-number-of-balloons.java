class Solution {
    public int maxNumberOfBalloons(String text) {
    
        int b=0,l=0,o=0,n=0,a=0;
        for(char c: text.toCharArray())
        {
            if(c=='b') b++;
            if(c=='a') a++;
            if(c=='l') l++;
            if(c=='o') o++;
            if(c=='n') n++;
            
        }
        
        l=l/2;o=o/2;
        int max=Integer.MAX_VALUE;
        if(max>b) max=b;
         if(max>a) max=a;
         if(max>l) max=l;
         if(max>o) max=o;
        if(max>n) max=n;
        return max;
    }
}