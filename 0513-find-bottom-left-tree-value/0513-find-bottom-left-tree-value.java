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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = root.val;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode top = queue.poll();

                if(i == 0){
                    left = top.val;
                }

                if(top.left != null){
                    queue.offer(top.left);
                }

                if(top.right != null){
                    queue.offer(top.right);
                }
            }
        }

        return left;
        
    }
}