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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<TreeNode> deepest = new ArrayList<>();

        while(!queue.isEmpty()){
            int size = queue.size();

            deepest.clear(); // then only we get the last leep 7 and 4

            for(int i=0;i<size;i++){
                TreeNode top = queue.poll();
                deepest.add(top);

                if(top.left != null){
                    queue.offer(top.left);
                }

                if(top.right != null){
                    queue.offer(top.right);
                }
            }
        }

        return findLCA(root,deepest);
    }

    public TreeNode findLCA(TreeNode root, List<TreeNode> deepest){
        if(root == null){
            return null;
        }

        for(TreeNode node : deepest){
            if(root == node){
                return root;
            }
        }

        // it will return the left 7 and right 4 
        // basically return the leaf node


        TreeNode left = findLCA(root.left, deepest);
        TreeNode right = findLCA(root.right, deepest);

        if(left != null && right != null){
            return root;
        }

        return left != null ? left : right;
    }
}