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
    int maxi = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxi;
    }

    int solve(TreeNode root)
    {
        if(root==null)
        return 0;

        int lsum = solve(root.left)>0 ? solve(root.left) : 0;
        int rsum = solve(root.right)>0 ? solve(root.right) : 0;
        maxi = Math.max(maxi , lsum + rsum + root.val);

        return root.val + Math.max(lsum , rsum);
    }
}
