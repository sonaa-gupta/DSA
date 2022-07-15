class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=1;
        if(s.length()==0)
            return 0;
        for(int i=0;i<s.length()-1;i++)
        {
            HashSet<Character> hs=new HashSet<>();
            int c=1;
             hs.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(hs.contains(s.charAt(j))){
                    if(max<c)
                        max=c;
                    break;}
                else {
                    
                    ++c;
                    hs.add(s.charAt(j));
                    if(max<c)
                        max=c;}
            }
        }
        return max;
        
        
    }
}