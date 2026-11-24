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
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxCalculating(root);
        return ans;
    }

    public int maxCalculating(TreeNode root){
        if(root == null){
            return 0;
        }

        // ignore the negative 
        int left = Math.max(0,maxCalculating(root.left));
        int right = Math.max(0,maxCalculating(root.right));

        int pathSum = root.val + left + right;

        ans = Math.max(ans,pathSum);

        return root.val + Math.max(left,right);

    }   
}