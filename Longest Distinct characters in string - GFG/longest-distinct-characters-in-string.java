//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String s){
        // code here
         int subs = 0;
       
      
        if(s.length()==1) return 1;

        for(int i=0;i<s.length();i++)
        {
             boolean a[]=new boolean[26];
            for(int j=i;j<s.length();j++)
            {
                if(a[s.charAt(j)-'a']==true)
                break;
                else{
                    a[s.charAt(j)-'a']=true;
                    subs=Math.max(subs,j-i+1);
                }
            }
            a[s.charAt(i)-'a']=false;
        }

return subs;


    }
}