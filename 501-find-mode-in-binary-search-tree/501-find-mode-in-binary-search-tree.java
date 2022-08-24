/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
         
        int max=Integer.MIN_VALUE;
        find(root,map);
        for(Map.Entry<Integer,Integer> ele:map.entrySet())
        {
            if(ele.getValue()>max) max=ele.getValue();
        }
        int size=0;
        for(Map.Entry<Integer,Integer> ele: map.entrySet())
        {
            if(ele.getValue()==max)
                size++;
        }
       int res[]=new int[size]; 
        int i=0;
        for(Map.Entry<Integer,Integer> ele: map.entrySet())
        {
            if(ele.getValue()==max)
                res[i++]=ele.getKey();}
        return res;
    }
    void find(TreeNode root,HashMap<Integer,Integer> set)
    {
        if(root==null) return;
        if(set.containsKey(root.val))
            set.put((root.val),set.get(root.val)+1);
        else set.put(root.val,0);
        find(root.left,set);
        find(root.right,set);
        return;
    }
    
}