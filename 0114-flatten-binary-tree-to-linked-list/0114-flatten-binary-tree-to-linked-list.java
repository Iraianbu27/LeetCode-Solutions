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
    TreeNode prevNode = null;
    public void dfs(TreeNode root){
        if(root == null)return;
        dfs(root.right);
        dfs(root.left);
        root.right = prevNode;
        root.left = null;
        prevNode = root;
    }
    public void flatten(TreeNode root) { 
        dfs(root);
        // return root;
    }
}