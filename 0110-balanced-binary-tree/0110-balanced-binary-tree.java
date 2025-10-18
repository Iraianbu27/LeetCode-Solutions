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
        if(root == null) return 0;
        int lh = recFunction(root.left);
        int rh = recFunction(root.right);
        if(lh == -1 || rh == -1) return -1;
        if(Math.abs(rh-lh) > 1) return -1;
        
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int i =recFunction(root);
        if(i<0) return false;
        return true;
    }
}
// two pass solution
// class Solution {
   
//     public int leftHeight(TreeNode root){
//         if(root == null) return 0;
//         int lh = leftHeight(root.left);
//         int rh = leftHeight(root.right);
//         return Math.max(lh,rh) + 1;
//     }
//     public boolean recFunction(TreeNode root){
//         if(root == null) return true;
//         int lh = leftHeight(root.left);
//         int rh = leftHeight(root.right);
//         if(Math.abs(rh-lh)> 1) return false;
//         boolean left = recFunction(root.left);
//         boolean right = recFunction(root.right);
//         if(left == false || right == false) return false;
//         return true;
//     }
//     public boolean isBalanced(TreeNode root) {
//         return recFunction(root);
//     }
// }