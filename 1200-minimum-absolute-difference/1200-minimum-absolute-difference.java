class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
      
        Arrays.sort(arr);
        int min=99999;
        for(int i=0;i<arr.length-1;++i)
        {
            min=Math.min(min,arr[i+1]-arr[i]);
        }
       List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<arr.length-1;++i)
        {
            if(arr[i+1]-arr[i]==min)
                ls.add(Arrays.asList(arr[i],arr[i+1]));
        }
        return ls;
    }
    
}