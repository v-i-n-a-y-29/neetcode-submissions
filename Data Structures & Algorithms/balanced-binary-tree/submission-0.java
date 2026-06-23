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
    public boolean isBalanced(TreeNode root) {

        if(root==null)
        return true;

        
        int currleft = maxDepth(root.left);
        int currright = maxDepth(root.right);

        if(Math.abs(currleft-currright)>1)
        return false;

        boolean l = isBalanced(root.left);
        boolean  r = isBalanced(root.right);

        return l && r;
    }

    int maxDepth(TreeNode root) 
    {
        if(root==null)
        return 0;

        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);

        return 1 + Math.max(ld,rd);
    }
}
