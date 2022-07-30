class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length(),l2=t.length();
         int i=0,j=0;
        while(i<l2 && j<l1)
        {
            if(t.charAt(i) == s.charAt(j))
            { i++;j++;}
            else 
                i++;
         }
        if(j==s.length())
            return true;
        else return false;
    } 
            
        
   
      
}