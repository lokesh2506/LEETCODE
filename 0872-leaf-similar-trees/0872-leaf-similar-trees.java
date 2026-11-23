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
    Queue<Integer> queue = new LinkedList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        collectLeaf(root1);

        if(!deleteQueueLeaf(root2)){
            return false;
        }

        return queue.isEmpty();
    }

    public void collectLeaf(TreeNode root){
        if (root == null) {
            return;
        }

        if(root.left == null && root.right == null){
            queue.offer(root.val);
            return;
        }

        collectLeaf(root.left);
        collectLeaf(root.right);
        
    }

    public boolean deleteQueueLeaf(TreeNode root){
        if(root == null){
            return true;
        }

        if(root.left == null && root.right == null){
            if(queue.isEmpty() ||  queue.poll() != root.val){
                return false;
            }

            return true;
        }
        
        return deleteQueueLeaf(root.left) && deleteQueueLeaf(root.right);
    } 
}