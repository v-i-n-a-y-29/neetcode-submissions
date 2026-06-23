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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        maxDepth(root);
        return diameter;

    }

    int maxDepth(TreeNode root)
    {
        if(root==null)
        return 0;
        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);

        diameter = Math.max(diameter,ld + rd);

        return 1 + Math.max(ld,rd);
    }
}
