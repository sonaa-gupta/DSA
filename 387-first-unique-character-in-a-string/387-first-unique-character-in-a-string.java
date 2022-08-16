class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> set=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(set.containsKey(s.charAt(i)))
                set.put(s.charAt(i),set.get(s.charAt(i))+1);
            else 
                set.put(s.charAt(i),1);
                
        }
        for(int i=0;i<s.length();i++)
        {
            if(set.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}