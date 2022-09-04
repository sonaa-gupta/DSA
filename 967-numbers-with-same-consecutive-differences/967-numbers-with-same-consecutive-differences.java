class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        if(n==1)
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        
        List<Integer> results=new ArrayList<>();
        
        for(int num=1;num<10;num++)
            dfs(n-1,num,k,results);
        
        
             return results.stream().mapToInt(i->i).toArray();
        
    }
    void dfs(int n,int num,int k,List<Integer> results)
    {
        if(n==0){
            results.add(num);
        return;}
        List<Integer> ls=new ArrayList<>();
        int newdigit=num%10;
        Integer nnum=0;
        ls.add(newdigit+k);
        if(k!=0)
            ls.add(newdigit-k);
        for(Integer next:ls)
        {
            if(next>=0 && next<10){
               nnum=num*10+next;
            dfs(n-1,nnum,k,results);}
        }
    }
}