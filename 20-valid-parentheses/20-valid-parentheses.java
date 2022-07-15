class Solution {
    public boolean isValid(String str) {
        Stack<Character> s= new Stack<>();
for(char c:str.toCharArray())
{
if(c=='(' || c=='{' || c=='[')
s.add(c);
else{
if(s.isEmpty()) return false;

else if((c==')' && s.peek()=='(') ||
(c=='}' && s.peek()=='{') || c==']' && s.peek()=='['){
s.pop();
}
else return false;
}}
if(s.isEmpty()) return true;
return false;}
    }
