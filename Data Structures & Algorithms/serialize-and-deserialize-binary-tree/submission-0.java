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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        // we will use levelorder traversal to encode the tree
        if(root==null)
        return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            while(n>0)
            {
                TreeNode node = q.poll();
                if(sb.length()>0)
                    sb.append(",");

                if(node==null)
                {
                    //donot add in the queueu
                    sb.append("n");
                }
                else{
                    //add the children in the queue
                    sb.append(node.val);
                    q.offer(node.left);
                    q.offer(node.right);
                }
                n--;
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "")
        return null;
        Queue<TreeNode> q = new LinkedList<>();
        String res[] = data.split(",");
        // System.out.println(Arrays.toString(res));
        int n = res.length;

        TreeNode root = new TreeNode(Integer.parseInt(res[0]));
        q.offer(root);

        int idx = 1;
        while(!q.isEmpty() && idx<n)
        {
            TreeNode node = q.poll();
            if(!res[idx].equals("n"))
            {
                TreeNode left = new TreeNode(Integer.parseInt(res[idx]));
                node.left = left;
                q.offer(left);
            }
            idx++;
            if(!res[idx].equals("n"))
            {
                TreeNode right = new TreeNode(Integer.parseInt(res[idx]));
                node.right = right;
                q.offer(right);
            }
            idx++;
        }
        return root;
    }
}
