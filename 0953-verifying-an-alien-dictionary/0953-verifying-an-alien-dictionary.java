
import java.util.*;
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        Hashtable<Character ,Integer> hs=new Hashtable<>();
                    
Hashtable<Integer, String> ht1 = new Hashtable<>();
        
        for(int i=0;i<order.length();i++)
        {
            hs.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                if(j>=words[i+1].length()) return false;
                
                if(hs.get(words[i].charAt(j))>hs.get(words[i+1].charAt(j)))
                    return false;
                else if(hs.get(words[i].charAt(j))==hs.get(words[i+1].charAt(j)))
                    continue;
                else break;
                
            }
            
}
        return true;
    }
}