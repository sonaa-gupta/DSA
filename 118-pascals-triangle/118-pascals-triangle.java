class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al=new ArrayList<List<Integer>>();
        List<Integer> m= new ArrayList<Integer>();
        m.add(1);
        al.add(m);
        
        for(int i=1;i<numRows;i++)
        {
            List<Integer> m2 = new ArrayList<Integer>();
            for(int j=0;j<=al.size();j++)
            {
                if(j==0 || j==i)
                   m2.add(1);
                else if(j+1<=al.size())
                    m2.add((al.get(i-1).get(j))+(al.get(i-1).get(j-1)));
            }
                           al.add(m2);
            
            
        }
    
                           return al;
}}