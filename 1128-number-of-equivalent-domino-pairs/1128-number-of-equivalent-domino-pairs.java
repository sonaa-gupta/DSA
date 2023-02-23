class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        
        
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<dom.length;i++)
        {
         String temp="";
            if(dom[i][0]>dom[i][1]){
                temp+=dom[i][1];
                temp+=dom[i][0];
            }else{
                temp+=dom[i][0];
                temp+=dom[i][1];
            }
            if(map.containsKey(temp))count+=map.get(temp);
            map.put(temp,map.getOrDefault(temp,0)+1);
            
        }
        return count;
        
    }
     
}