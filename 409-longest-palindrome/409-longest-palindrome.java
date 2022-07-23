class Solution {
    public int longestPalindrome(String s) {
        char c[]=new char[128];
        for(char i:s.toCharArray())
            c[i]++;
        int ans=0;
        for(int v=0;v<128;v++)
        {
            ans+=c[v]/2*2;
            if(ans%2==0 && c[v]%2==1)
                ans++;
        }
     return ans;   
    }
}