class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb=new StringBuilder();
        while(col!=0)
        {
          col=col-1;
            sb.append((char)(col%26+'A'));
          col/=26;  
        }
                      return sb.reverse().toString();
    }
}