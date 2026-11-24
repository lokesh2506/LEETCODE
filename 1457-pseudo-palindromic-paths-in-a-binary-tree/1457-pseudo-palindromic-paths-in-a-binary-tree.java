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
    int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        palindromicPaths(root,0);

        return count;
    }

    public void palindromicPaths(TreeNode root,int mask){
        if(root == null){
            return;
        }

        mask ^= (1<<root.val);

        if(root.left == null && root.right == null){
            if((mask & (mask -1)) ==0){
                count++;
            
            }
        }

        palindromicPaths(root.left,mask);
        palindromicPaths(root.right,mask);

    }

}