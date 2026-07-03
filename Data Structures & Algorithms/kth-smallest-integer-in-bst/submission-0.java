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
    public int kthSmallest(TreeNode root, int k) {

        //inorder traversal of a bst will give the tree elements in a sorted order
        ArrayList<Integer> list = new ArrayList<>();
        InOrder(root , list);
        System.out.println(list);

        return list.get(k-1);

    }

    void InOrder(TreeNode root , ArrayList<Integer> list)
    {
        if(root == null)
        return ;

        InOrder(root.left , list);
        list.add(root.val);
        InOrder(root.right , list);
    }
}
