class Solution {
    public boolean areNumbersAscending(String s) {
        String x[]=s.split(" ");
        int num=-1;
        for(int i=0;i<x.length;i++)
        {
            if(Character.isDigit(x[i].charAt(0)))
            {
                if(Integer.valueOf(x[i])<=num)
                    return false;
                num=Integer.valueOf(x[i]);
            }
        }
        return true;
    }
    
}