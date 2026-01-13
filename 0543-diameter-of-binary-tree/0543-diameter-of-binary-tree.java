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
    int maxPath = 0;
    public int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) +1;
    }
    public void longestPath(TreeNode root){
        if(root == null) return;
        int lh = height(root.left);
        int rh = height(root.right);
        maxPath = Math.max(lh+rh,maxPath);
        longestPath(root.left);
        longestPath(root.right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        longestPath(root);
        return maxPath;
    }
}