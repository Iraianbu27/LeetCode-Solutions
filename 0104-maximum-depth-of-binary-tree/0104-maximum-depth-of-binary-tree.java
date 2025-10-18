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
    public int recFunction(TreeNode root){
        if(root == null) 
        {
            return 0;
        }
        int left = recFunction(root.left);
        int right = recFunction(root.right);
        // return Math.max(recFunction(root.left),recFunction(root.right)) + 1;
        return Math.max(left,right) + 1;
    }
    public int maxDepth(TreeNode root) {
        return recFunction(root);
        
    }
}