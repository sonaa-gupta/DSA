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
   TreeNode head,tail;
    public boolean findTarget(TreeNode root, int k) {
       convert(root);
        int sum=0;
        while(head!=tail)
        {
            if(head.val+tail.val==k)
                return true;
            else if(head.val+tail.val<k)
                head=head.right;
            else tail=tail.left;
        }
        return false;
        
        
        
    }
    void convert(TreeNode root)
    {
        if(root==null) return;
        convert(root.left);
        if(head==null)
            head=root;
        else 
        {
            root.left=tail;
            tail.right=root;
        }
        tail=root;
        convert(root.right);
    }
}