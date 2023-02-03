class Solution {
    public int countSubstrings(String s) {
        
     int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(palindrome(s.substring(i,j+1)))
                    count++;
}}
            return count;
        }
     
    boolean palindrome(String s)
    {
        StringBuilder x=new StringBuilder(s);
        return (x.reverse().toString()).equals(s);
    }
}