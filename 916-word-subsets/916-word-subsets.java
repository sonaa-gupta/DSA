class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
        int bmax[]=count("");
        for(String s:words2)
        {
            int bcount[]=count(s);
            for(int i=0;i<26;i++)
            {
                bmax[i]=Math.max(bcount[i],bmax[i]);
            }
        }
        search:for(String t:words1)
        {
            int xcount[]=count(t);
            for(int i=0;i<26;i++)
            {
                if(xcount[i]<bmax[i]) continue search;
            }
            ans.add(t);
            
        }
        return ans;
        
    }
    int[] count(String s)
    {
        int ans[]=new int[26];
        for(char c:s.toCharArray())
            ans[c-'a']++;
        return ans;
}
    
}