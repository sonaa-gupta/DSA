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
    int height=0;
    public int countNodes(TreeNode root) {
        
        solve(root);
        return height;
    }
    void solve(TreeNode root)
    {
        if(root==null) return;
        if(root!=null) height++;
        if(root.left!=null) 
        {
            
            solve(root.left);
        }
        if(root.right!=null)
           
            solve(root.right);
          
    }
 
}