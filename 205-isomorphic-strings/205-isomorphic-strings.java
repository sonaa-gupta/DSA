class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
     int dictionS[]=new int[256];
        int dictionT[]=new int[256];
        Arrays.fill(dictionS,-1);
         Arrays.fill(dictionT,-1);
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(dictionS[c1]==-1 && dictionT[c2]==-1) {
                dictionS[c1]=c2;dictionT[c2]=c1;
            }
            else if(!(dictionS[c1]==c2 && dictionT[c2]==c1))
                return false;
                
        }
        return true;
    }
}