class Solution {
    public boolean ischar(char ch)
    {
          Character c=Character.toLowerCase(ch);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        return false;
    }
    public String reverseVowels(String s) {
    
    char x[]=s.toCharArray();
        int i=0,j=x.length-1;
       while(i<j)
       {
           if(!ischar(x[i])) i++;
           else if(!ischar(x[j])) j--;
           else{
               char temp=x[i];
               x[i]=x[j];
               x[j]=temp;i++;j--;
           }
           
       }
    
    return new String(x);
    }
        
}     