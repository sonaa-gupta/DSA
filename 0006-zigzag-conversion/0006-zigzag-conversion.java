class Solution {
    public String convert(String s, int numRows) {
        char arr[]=new char[s.length()];
int count=0;
        if(numRows<=1 || numRows>s.length())
            return s;
        int interval=2*numRows-2;
        
        for(int i=0;i<numRows;i++)
        {
            int steps=interval-2*i;
            for(int j=i;j<s.length();j+=interval)
            {
                arr[count]=s.charAt(j);
                count++;
                if(steps>0 && steps<interval && (steps+j)<s.length()){
                    arr[count++]=s.charAt(steps+j);}
                
            }
        }
        return new String(arr);
    }
}