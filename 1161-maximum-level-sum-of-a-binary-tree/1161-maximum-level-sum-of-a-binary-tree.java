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
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }

        int overallMax = root.val;
        int maxLevel = 1;

        int lvlIndex = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;

            for(int i=0;i<size;i++){
                TreeNode top = queue.poll();

                sum += top.val;

                if(top.left != null){
                    queue.offer(top.left);
                }

                if(top.right != null){
                    queue.offer(top.right);
                }
            }

            if(sum > overallMax){
                overallMax = sum;
                maxLevel = lvlIndex;
            }

            lvlIndex++;
        }

        return maxLevel;
        
    }
}