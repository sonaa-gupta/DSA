class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map= new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
}
            else
                map.put(s.charAt(i),1);
}
        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                int rem=map.get(t.charAt(i));
                if(rem<=0) return false;
                map.put(t.charAt(i),rem-1);
}
            else return false;
        }
     //   for(int i:map.values())
       // {
         //   if(i!=0) return false;
        //}
        return true;
    }
}