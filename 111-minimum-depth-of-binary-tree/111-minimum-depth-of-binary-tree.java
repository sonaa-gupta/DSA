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
    public int minDepth(TreeNode root) {
        
            if(root==null)
                return 0;
        int mindepth=1;
        int Nodeleft=minDepth(root.left);
        int NodeRight=minDepth(root.right);
             if(root.left==null)
                mindepth+=NodeRight;
              else if(root.right==null)
                mindepth+=Nodeleft;
            else
                mindepth+=Math.min(Nodeleft,NodeRight);
        return mindepth;
        
        }
}