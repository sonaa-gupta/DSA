class Solution {
    public String removeDuplicateLetters(String s) {
        
        int last[]=new int[26];
        boolean visit[]= new boolean[26];
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            last[s.charAt(i)-'a']=i;
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(visit[s.charAt(i)-'a']) continue;
            
            char c=s.charAt(i);
            while(!st.isEmpty() && st.peek()>c && last[st.peek()-'a']>i)
            {
                visit[st.pop()-'a']=false;
            }
            st.push(c);
            visit[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
           sb.append(st.pop());
        return sb.reverse().toString();
    }
}