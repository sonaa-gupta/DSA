class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        
        HashSet<String> set=new HashSet<>();
        
        for(String s:words)
        {
            StringBuilder sb=new StringBuilder();
           for(char c:s.toCharArray())
           {
               sb=sb.append(MORSE[c-'a']);
           }
            set.add(sb.toString());
}
        return set.size();
    }
}