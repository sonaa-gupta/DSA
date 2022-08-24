class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 != 0) return Collections.emptyList();

        List<Long> result = new ArrayList<>();
        long sum = 0, even= 2;
          
        while(sum+even<=finalSum)
        {
            sum+=even;
            result.add(even);
            even+=2;
        }
        if(sum<finalSum)
        {
           long x= result.remove(result.size()-1);
            result.add(finalSum-sum+x);
        }
        return result;
    }
}