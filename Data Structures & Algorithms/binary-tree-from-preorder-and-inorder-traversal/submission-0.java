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
    Map<Integer , Integer> map;
    int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        int n = preorder.length;
        for(int i=0;i<n;i++)
        {
            map.put(inorder[i] , i);
        }
        

        return solve(preorder , inorder , 0 , n-1  );
    }

    TreeNode solve(int pre[] , int in[] , int start , int end )
    {
        if(start>end  )
        return null;

        int rootVal = pre[idx];
        int i = map.get(rootVal);
        idx++;

        TreeNode root = new TreeNode(rootVal);
        root.left = solve(pre , in , start , i-1);
        root.right = solve(pre , in , i+1 , end );

        return root;

    }
}