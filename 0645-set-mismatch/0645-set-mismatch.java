class Solution {
    public int[] findErrorNums(int[] num) {
        Arrays.sort(num);
        int dup=0;
        int miss=-1;
        for(int i=1;i<num.length;i++)
        {
            if(num[i]-num[i-1]==0)
            dup=num[i];
            if(num[i]-num[i-1]>1)
            miss=num[i]-1;
        }
        if(miss==-1)
        {
            if(num[0]!=1)
        miss=1;
        else if(num[num.length-1]!=num.length)
        miss=num.length;
    }
    return new int[] {dup,miss};}
}