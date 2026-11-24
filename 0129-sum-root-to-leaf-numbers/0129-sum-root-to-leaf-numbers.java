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
    public int sumNumbers(TreeNode root) {
        return calculate(root, 0);
    }

    public int calculate(TreeNode root, int current){
        if(root == null){
            return 0;
        }


        current = current * 10 + root.val;

        if(root.left == null && root.right == null){
            return current;
        }

        int left = calculate(root.left,current);
        int right = calculate(root.right,current);

        return left+right;
    }
}