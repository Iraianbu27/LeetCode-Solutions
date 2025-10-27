/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 
 class Solution {
    public TreeNode dfs(TreeNode root,TreeNode p,TreeNode q){
        if(root == null)return root;

        if(root == p || root == q){
            return root;
        }
        TreeNode lR = dfs(root.left,p,q);
        TreeNode rR = dfs(root.right,p,q);
        if(lR == null && rR == null) return null;
        else if(lR != null && rR != null) return root;
        else{
            //lR != null || rR != null
            if(lR != null) return lR;
            else return rR;
        }
         

    }
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root,p,q);

    }
}