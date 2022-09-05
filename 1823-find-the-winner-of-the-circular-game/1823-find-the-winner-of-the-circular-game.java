class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new ArrayDeque<>();
   
        int ok=k;
        
        for(int i=1;i<=n;i++)
            q.offer(i);
        while(q.size()>1)
        {
             k=ok;
            while(k-->1)
            {
                q.offer(q.poll());
                
            }
            q.poll();
        }
        return q.poll();
    }
}