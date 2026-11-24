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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        int index = 0;

        if(root == null){
            return ans;
        }

        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> curr = new ArrayList<>();
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode top = queue.poll();

                curr.add(top.val);

                if(top.left != null){
                    queue.offer(top.left);
                }

                if(top.right != null){
                    queue.offer(top.right);
                }
            }

            if(index % 2 == 1){ // only for odd index
                Collections.reverse(curr);
            }
            index++;

            ans.add(curr);
        }

        return ans;
    }
}