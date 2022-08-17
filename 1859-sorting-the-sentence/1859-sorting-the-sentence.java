class Solution {
    public String sortSentence(String s) {
        String m[]=s.split(" ");
        String x[]=new String[m.length];
        for(String words:m)
        {
            int n=Character.getNumericValue(words.charAt(words.length()-1));
          
            x[n-1]=words.substring(0,words.length()-1);
        }
    String z="";
        for(int i=0;i<x.length;i++)
            z=z+x[i]+" ";
        return z.substring(0,z.length()-1);
    }
}