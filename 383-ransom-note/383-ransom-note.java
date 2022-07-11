class Solution {
    public boolean canConstruct(String m, String r) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<r.length();i++)
        {
            if(map.containsKey(r.charAt(i)))
                map.put(r.charAt(i),map.get(r.charAt(i))+1);
            else 
                map.put(r.charAt(i),1);
}
    for(int i=0;i<m.length();i++)
                        {
                            if(map.containsKey(m.charAt(i)))
                            {
                                int x=map.get(m.charAt(i));
                                if(x<=0) return false;
                                else x--;
                                map.put(m.charAt(i),x);
                            }
                            else return false;
                        }
                        return true;
        
                        }
}