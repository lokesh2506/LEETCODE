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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans  = new ArrayList<>();

        if(root == null){
            return ans;
        }

        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> nodes = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode front = queue.poll();
                nodes.add(front.val);

                if(front.left != null){
                    queue.add(front.left);
                }

                if(front.right != null){
                    queue.add(front.right);
                }
            }

            ans.add(nodes);

        }

        return ans;
    }
}