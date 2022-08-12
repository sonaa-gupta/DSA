class Solution {
    public boolean lemonadeChange(int[] bills) {
       int save[]=new int[3];
        
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
                save[0]++;
            else if(bills[i]==10)
            {
                if(save[0]==0) return false;
                save[0]--;save[1]++;
            }
            else if(bills[i]==20)
            {
                if(save[1]>=1 && save[0]>=1)
                {
                    save[1]--;save[0]--;save[2]++;
                }
                else if(save[0]>=3)
                {
                    save[0]-=3;save[2]++;
                }
                else return false;
            }
        }
        return true;
    }
}