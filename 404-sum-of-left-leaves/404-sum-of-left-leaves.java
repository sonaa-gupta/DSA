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
    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root);
    }
    int solve(TreeNode root)
    {
        int sum=0;
       
        if (root.left == null);
        else if(root.left.left!=null || root.left.right!=null) 
            sum+=solve(root.left);
        else 
            sum+=root.left.val;
        if(root.right==null);
        else if(root.right.left!=null || root.right.right!=null)
            sum+=solve(root.right);
        return sum;
        
        
        
        
}
}