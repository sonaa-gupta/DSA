class Solution {
    
    int num(char c)
    {
        switch(c)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1;
    }
    
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(i+1==s.length())
                sum+=num(s.charAt(i));
            else if(num(s.charAt(i+1))>num(s.charAt(i))){
                sum+=num(s.charAt(i+1))-num(s.charAt(i));i++;}
            else sum+=num(s.charAt(i));
            
            
        }
        return sum;
        
    }
}