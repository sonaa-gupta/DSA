class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1;
        if(tokens.length==0) return 0;
        if(tokens[0]>power) return 0;
        int max1=0,score=0;
        while(i<=j)
        { 
            
            if(power>=tokens[i])
            {
                power-=tokens[i];i++;score++;
            }
            else
            {
                if(score==0) break;
                else {
                    power+=tokens[j];score--;j--;
                }
                    
            }
            max1=Math.max(score,max1);
        }
        return max1;
    }
}