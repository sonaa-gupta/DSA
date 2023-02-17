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
    int min=Integer.MAX_VALUE;
    TreeNode prev;
    public int minDiffInBST(TreeNode root) {
        
        find(root);
        return min;
       
    }
       void find(TreeNode root){
           
        if(root!=null)
        {
           find(root.left);
            if(prev!=null)
            {
                min=Math.min(min,root.val-prev.val);
            }
            prev=root;
            find(root.right);
        }
           return;
           

       }
}