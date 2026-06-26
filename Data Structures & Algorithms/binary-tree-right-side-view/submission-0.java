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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode node = null;
        List<Integer> ans = new ArrayList<>();
        if(root == null)
        return ans;
        while(!q.isEmpty())
        {
            int n = q.size();
            while(n!=0)
            {
                node = q.poll();
                if(node!=null && node.left!=null) q.add(node.left);
                if(node!=null && node.right!=null) q.add(node.right);
                n--;
            }
            if(node!=null)
            ans.add(node.val);
        }
        return ans;
    }
}
