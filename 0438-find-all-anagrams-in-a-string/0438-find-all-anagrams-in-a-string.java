class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        int freq[]=new int[26];
        int preq[]=new int[26];
          if (p.length() > s.length()) return arr;
        for(int i=0;i<p.length();i++)
        {
            freq[p.charAt(i)-'a']++;
            preq[s.charAt(i)-'a']++;
        }
        if(anagram(freq,preq)==true) arr.add(0);
         for(int i=p.length();i<s.length();i++)
         {
             preq[s.charAt(i)-'a']++;
             preq[s.charAt(i-p.length())-'a']--;
             if(anagram(freq,preq)) 
                 arr.add(i-p.length()+1);
            
         }
     return arr;   
    }
    boolean anagram(int[] freq,int[] preq)
    {
        return Arrays.equals(freq,preq);
    }
}