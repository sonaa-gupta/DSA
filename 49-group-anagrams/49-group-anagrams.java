class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();

  List<List<String>> list = new ArrayList<>();
  
  for(String str : strs)
  {
    char ch[] = str.toCharArray();
    Arrays.sort(ch);
    String str1 = String.valueOf(ch);
    
    if(!map.containsKey(str1))
      map.put(str1 , new ArrayList<>());
    
    map.get(str1).add(str);
  }
  
  for(Map.Entry<String , List<String>> mm : map.entrySet())
  {  
    list.add(mm.getValue());
  }
  
  return list;
}}
