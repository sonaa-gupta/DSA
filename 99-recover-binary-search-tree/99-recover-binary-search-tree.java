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
    public void recoverTree(TreeNode root) {
        PriorityQueue<Integer> q=new PriorityQueue();
        inorder(root,q);
        correct(root,q);
        
    }
    void inorder(TreeNode root,PriorityQueue<Integer> q)
    {
        if(root==null) return;
        inorder(root.left,q);
        q.add(root.val);
        inorder(root.right,q); 
    }
     void correct(TreeNode root,PriorityQueue<Integer> q)
    {
        if(root==null) return;
       correct(root.left,q);
         if(root.val!=q.peek())
             root.val=q.peek();
       q.poll();
        correct(root.right,q); 
    }
    
}