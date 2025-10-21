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
    public boolean symmetry(TreeNode root1,TreeNode root2){
        if(root1 == null || root2 == null){
            if(root1 != root2) return false;
            return true;
        }
        if(root1.val == root2.val){
            if(symmetry(root1.left,root2.right) == true &&
             symmetry(root1.right,root2.left) == true ){
                return true;
            }
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        return symmetry(root.left,root.right);
    }
}