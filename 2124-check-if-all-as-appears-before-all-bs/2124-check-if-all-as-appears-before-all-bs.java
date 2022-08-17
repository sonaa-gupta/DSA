class Solution {
    public boolean checkString(String s) {
     boolean flag=true;
        for(char c:s.toCharArray())
        {
            if(c=='b')
            flag=false;
            if(c=='a' && flag==false) return false;
        }
        return true;
    }
}