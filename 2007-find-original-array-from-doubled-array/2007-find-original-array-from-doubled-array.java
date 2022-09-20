class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int[] temp = new int[changed.length/2];
        
        if(changed.length%2!=0) return new int[0];
        Arrays.sort(changed);
        int i=0;
        Queue<Integer> q=new LinkedList<>();
        for(int num:changed)
        {
            if( !q.isEmpty() && q.peek()==num)
            {
                temp[i++]=q.poll()/2;
            }
            else q.add(num*2);
        }
        return q.size()>0 ? new int[]{}:temp;
        
}
}